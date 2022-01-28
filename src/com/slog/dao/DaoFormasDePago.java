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
public class DaoFormasDePago {
    public static Object consultaFormasDePago(ArrayList param) {
         String proc = "{?=call pa_consultarformasdepago()}";
         return Consultas.funcion(proc, param,DaoUsuario.cnx);
    }
}
