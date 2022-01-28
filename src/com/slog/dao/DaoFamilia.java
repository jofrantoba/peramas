/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slog.dao;

import java.util.ArrayList;

/**
 *
 * @author cixtic03
 */
public class DaoFamilia {
    public static Object consultaFamilia(ArrayList param) {
         String proc = "{?=call pa_consultarfamilia(?,?,?)}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
}
