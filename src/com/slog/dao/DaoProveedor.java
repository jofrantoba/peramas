/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.dao;

import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class DaoProveedor {
    
    public static Object consultaProveedor(ArrayList param) {    
         String proc = "{?=call pa_consultarproveedor(?,?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
