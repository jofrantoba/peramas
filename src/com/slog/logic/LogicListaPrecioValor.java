/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.logic;

import com.slog.bean.Listapreciovalor;
import com.slog.bean.ListapreciovalorPK;
import com.slog.dao.DaoListaPrecioValor;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class LogicListaPrecioValor {

    public static Object proceso(
            int ide_lp,
            int ide_item,
            String codfpago,
            BigDecimal margenutilidad,
            BigDecimal valorventa,
            int operacion) throws SQLException {
        ArrayList param = new ArrayList();
        param.add(ide_lp);
        param.add(ide_item);
        param.add(codfpago);        
        param.add(margenutilidad);
        param.add(valorventa);
        param.add(operacion);
        param.add(Types.OTHER);
        return DaoListaPrecioValor.procesoListaPrecioValor(param);
    }

    public static ArrayList<Listapreciovalor> consultaListaPrecioValor(int idlistaprecio, int iditem) {
        ArrayList param = new ArrayList();
        param.add(Types.OTHER);
        param.add(idlistaprecio);
        param.add(iditem);
        ResultSet rs = (ResultSet) DaoListaPrecioValor.consultaListaPrecioValor(param);
        if (rs == null) {
            return new ArrayList();
        } else {
            try {
                ArrayList<Listapreciovalor> listaPrecioValor = new ArrayList();
                while (rs.next()) {
                    Listapreciovalor lpv = new Listapreciovalor();
                    ListapreciovalorPK pk = new ListapreciovalorPK();
                    pk.setIdeLp(rs.getInt(1));
                    pk.setIdeItem(rs.getInt(2));
                    pk.setCodfpago(rs.getString(3));
                    lpv.setListapreciovalorPK(pk);
                    lpv.setMargenutilidad(rs.getDouble(4));
                    lpv.setValorventa(rs.getDouble(5));
                    listaPrecioValor.add(lpv);
                }
                return listaPrecioValor;
            } catch (Exception ex) {
                System.err.print("Error al crear la lista : " + ex.getMessage());
                return new ArrayList();
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
