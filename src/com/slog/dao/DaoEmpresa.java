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
public class DaoEmpresa {    
    
    public static Object consultaEmpresa(ArrayList param) {    
         String proc = "select * from pa_consultausuarioempresa(?) as (cod text, emp text)";
        return Consultas.consultaPreparada(proc, param,DaoUsuario.cnx);
    }
    
}
