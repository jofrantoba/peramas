/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.logic;

import com.slog.bean.Marca;
import com.slog.dao.DaoMarca;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JONA
 */
public class LogicMarca {

    public static ArrayList<Marca> consultaMarca(String codEmp, String codLocalidad, int idprov, String codfam, int iditem) {
        ArrayList param = new ArrayList();
        param.add(Types.OTHER);
        param.add(codEmp);
        param.add(codLocalidad);
        param.add(idprov);
        param.add(codfam);
        param.add(iditem);
        ResultSet rs = (ResultSet) DaoMarca.consultaMarca(param);
        if (rs == null) {
            return new ArrayList();
        } else {
            try {
                ArrayList<Marca> listaMarca = new ArrayList();
                while (rs.next()) {
                    Marca marca = new Marca();
                    marca.setIdeMarca(rs.getInt(1));
                    marca.setDescriMarca(rs.getString(2));
                    listaMarca.add(marca);
                }
                return listaMarca;
            } catch (Exception ex) {
                System.err.print("Error al crear la lista de marcas: " + ex.getMessage());
                return new ArrayList();
            }/*finally{
            boolean cerrar=ObjetoConexion.getBdTumi().destroy();
            if(cerrar){
            System.out.print("conexion cerrada correctamente");
            }else{
            System.err.print("error al cerrar conexion");
            }
            }*/
        }
    }

    public static Object[] consultarMarca(ArrayList<Marca> listaMarca) {
        ArrayList<Marca> listAux = new ArrayList();
        listAux = listaMarca;
        Iterator i = listAux.iterator();
        int cont = 1;
        Object[] marcas = new Object[listAux.size() + 1];
        marcas[0] = "All";
        while (i.hasNext()) {
            Marca m = (Marca) i.next();
            marcas[cont] = m.getDescriMarca();
            cont = cont + 1;
        }
        return marcas;
    }

    public static Marca consultarMarcaXnombre(ArrayList<Marca> listaMarcas, Marca objMarca, String descriMarca) {
        Iterator i = listaMarcas.iterator();
        while (i.hasNext()) {
            Marca m = (Marca) i.next();
            if (descriMarca.equals(m.getDescriMarca())) {
                objMarca = m;
                break;
            }
        }
        return objMarca;
    }
}
