/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class DaoListaPrecio {
    
    public static Object procesoListaPrecio(ArrayList param) throws SQLException {
        String proc = "{call pa_grabarlistaprecio(?,?,?,?,?,?,?,?,?,?,?)}";
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
    
    public static Object eliminarListaPrecio(ArrayList param) throws SQLException {
        String proc = "{call pa_eliminarlistaprecio(?,?)}";
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
    
    public static Object consultaListaPrecio(ArrayList param) {
         String proc = "{?=call pa_consultarlistaprecio(?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
