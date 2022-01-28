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
public class DaoMarca {
    
    public static Object consultaMarca(ArrayList param) {
         String proc = "{?=call pa_consultarmarca(?,?,?,?,?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
