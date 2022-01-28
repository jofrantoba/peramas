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
public class DaoFactorConversion {
    
    public static Object consultaFactorConversion(ArrayList param) {
         String proc = "{?=call pa_consultarfconvuni(?,?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
