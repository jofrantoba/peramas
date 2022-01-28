/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.dao;


import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class DaoUsuario {
    public static Connection cnx=ObjetoConexion.conectarBDTumi();
    
    public static Object consultaUsuario(ArrayList param) {    
         String proc = "select * from pa_consultausuario(?) AS (id int,pat text,mat text,nombres text,sexo text,fechanac date,email text,clave text)";
        return Consultas.consultaPreparada(proc, param,cnx);
    }    
    
}
