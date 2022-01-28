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
public class DaoMoneda {
    
    public static Object consultaMoneda(ArrayList param) {    
         String proc = "{?=call pa_consultarmoneda()}";
        return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
