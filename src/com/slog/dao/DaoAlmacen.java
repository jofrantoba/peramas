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
public class DaoAlmacen{

    public static Object consultaLocalidad(ArrayList param) {    
         String proc = "{?=call pa_consultaralmacen(?,?)}";
        return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
