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
public class DaoListaPrecioItem {
    
    public static Object procesoListaPrecioItem(ArrayList param) throws SQLException {
        String proc = "{call pa_grabarlistaprecioitem(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
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
    
    public static Object actualizarListaPrecioItem(ArrayList param){
        String proc = "{call pa_grabarlistaprecioitem(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        Object rs=Consultas.funcionConsultar(proc, param,DaoUsuario.cnx);             
        return rs;                                
    }
    
    public static Object eliminarListaPrecioItem(ArrayList param) throws SQLException {
        String proc = "{call pa_eliminarlistaprecioitem(?,?,?)}";
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
    
    public static Object consultaListaPrecioItem(ArrayList param) {
         String proc = "{?=call pa_consultarlistaprecioitem(?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
