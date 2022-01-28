/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.logic;

import com.slog.bean.Factorconv;
import com.slog.bean.FactorconvPK;
import com.slog.dao.DaoFactorConversion;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class LogicFactorConversion {

    public static Factorconv consultaFactorConversion(String uniOrigen, String uniDestino) {
        ArrayList param = new ArrayList();
        param.add(Types.OTHER);
        param.add(uniOrigen);
        param.add(uniDestino);
        ResultSet rs = (ResultSet) DaoFactorConversion.consultaFactorConversion(param);
        if (rs == null) {
            return null;
        } else {
            try {
                Factorconv fc = new Factorconv();
                FactorconvPK pk = new FactorconvPK();
                while (rs.next()) {
                    pk.setUmorigen(rs.getString(1));
                    pk.setUmdestino(rs.getString(2));
                    fc.setFactorconvPK(pk);
                    fc.setFactor(rs.getDouble(3));
                    fc.setOperador(rs.getString(4).charAt(0));
                }
                return fc;
            } catch (Exception ex) {
                System.err.print("Error al crear la lista de familias: " + ex.getMessage());
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
