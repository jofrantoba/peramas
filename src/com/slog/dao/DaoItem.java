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
public class DaoItem {
    public static Object consultaItem(ArrayList param) {
         String proc = "{?=call pa_consultaritem(?,?,?,?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    public static Object consultaFiltroItem(ArrayList param) {
         String proc = "{?=call pa_consultarfiltroitem(?,?,?,?,?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
    public static Object consultaItemListaPrecio(ArrayList param) {
         String proc = "{?=call pa_consultaritemlistaprecio(?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
}
