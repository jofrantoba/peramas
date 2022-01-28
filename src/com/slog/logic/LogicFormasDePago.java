/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.logic;

import com.slog.bean.Fpago;
import com.slog.dao.DaoFormasDePago;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class LogicFormasDePago {

    public static ArrayList<Fpago> consultaFormasDePago() {
        ArrayList param = new ArrayList();
        param.add(Types.OTHER);
        ResultSet rs = (ResultSet) DaoFormasDePago.consultaFormasDePago(param);
        if (rs == null) {
            return null;

        } else {
            try {
                ArrayList<Fpago> listaFormaDePago = new ArrayList();
                while (rs.next()) {
                    Fpago fp = new Fpago();
                    fp.setCodigoFpago(rs.getString(1));
                    fp.setDescriFpago(rs.getString(2));
                    fp.setCancelacionFpago(rs.getString(3).charAt(0));
                    listaFormaDePago.add(fp);
                }
                return listaFormaDePago;
            } catch (Exception ex) {
                System.err.print("Error al crear la lista de formas de pago: " + ex.getMessage());
                return null;
            }/*finally{
            boolean cerrar=ObjetoConexion.getBdTumi().destroy();
            if(cerrar){
            System.out.print("conexion cerrada correctamente");
            }else{
            System.err.print("error al cerrar conexion");
            }
            }*/
        }
    }
}
