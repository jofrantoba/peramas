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
public class DaoTipoListaPrecio {
    
    public static Object consultaTipoListaPrecio(ArrayList param) {    
         String proc = "{?=call pa_consultartipolistaprecio()}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    
}
