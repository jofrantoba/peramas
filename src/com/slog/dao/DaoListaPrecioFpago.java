/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class DaoListaPrecioFpago {
    public static Object procesoListaPrecioFpago(ArrayList param) throws SQLException {
        String proc = "{call pa_grabarlistapreciofpago(?,?,?,?,?,?,?)}";
        Object rs=Consultas.funcionConsultar(proc, param,DaoUsuario.cnx);                        
        if (rs!=null) {
            try {
                DaoUsuario.cnx.commit();
            } catch (Exception ex) {
                System.out.println("ERROR: " + ex.getCause());
            }
        }
        return rs;                                
    }
    
    public static Object eliminarListaPrecioFpago(ArrayList param) throws SQLException {
        String proc = "{call pa_eliminarlistapreciofpago(?,?,?)}";
        Object rs=Consultas.funcionConsultar(proc, param,DaoUsuario.cnx);                        
        if (rs!=null) {
            try {
                DaoUsuario.cnx.commit();
            } catch (Exception ex) {
                System.out.println("ERROR: " + ex.getCause());
            }
        }
        return rs;                                
    }
    
    public static Object consultaListaPrecioFpago(ArrayList param) {
         String proc = "{?=call pa_consultarlistapreciofpago(?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
