/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.logic;

import com.slog.bean.Usuario;
import com.slog.dao.DaoUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JONA
 */
public class LogicUsuario {

    public static Usuario consultaUsuario(String login) {
        ArrayList param = new ArrayList();
        param.add(login);
        ResultSet rs = (ResultSet) DaoUsuario.consultaUsuario(param);
        if (rs == null) {
            return null;
        } else {
            try {
                Usuario beanUsuario = new Usuario();
                while (rs.next()) {
                    try {
                        beanUsuario.setIdeTpersona(rs.getInt(1));
                        beanUsuario.setPaternoPer(rs.getString(2));
                        beanUsuario.setMaternoPer(rs.getString(3));
                        beanUsuario.setNombresPer(rs.getString(4));
                        beanUsuario.setSexoPer(rs.getString(5).charAt(0));
                        beanUsuario.setFechanacPer(rs.getDate(6));
                        beanUsuario.setEmailPer(rs.getString(7));
                    } catch (Exception ex) {
                    }
                    beanUsuario.setPasswordUsuario(rs.getBytes(8));
                    beanUsuario.setLoginUsuario(login);
                }
                return beanUsuario;
            } catch (Exception ex) {
                System.err.print("error al crear bean usuario: " + ex.getMessage());
                return null;
            }/*finally {
            boolean cerrar = ObjetoConexion.getBdTumi().destroy();
            if (cerrar) {
            System.out.print("conexion cerrada correctamente");
            } else {
            System.err.print("error al cerrar conexion");
            }
            }*/
        }
    }

    public static String validarUsuario(String user, String clave) throws SQLException {
        String msg = "";
        if (user.equals("") || clave.equals("")) {
            msg = "vacio";
        } else {
            Usuario usuario = consultaUsuario(user);
            if (usuario.getLoginUsuario() == null) {
                msg = "nouser";
            } else {
                String password = new String(usuario.getPasswordUsuario());
                if (password.equals(clave)) {
                    msg = "correcto";
                } else {
                    msg = "noclave";
                }
            }
        }
        return msg;
    }
}
