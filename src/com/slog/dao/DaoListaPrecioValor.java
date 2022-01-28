/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class DaoListaPrecioValor {

    public static Object procesoListaPrecioValor(ArrayList param) throws SQLException {
        String proc = "{call pa_grabarlistapreciovalor(?,?,?,?,?,?,?)}";
        Object rs = Consultas.funcionConsultar(proc, param, DaoUsuario.cnx);                
        return rs;
    }

    public static Object consultaListaPrecioValor(ArrayList param) {
        String proc = "{?=call pa_consultarlistapreciovalor(?,?)}";
        return Consultas.funcion(proc, param, DaoUsuario.cnx);
    }
}
