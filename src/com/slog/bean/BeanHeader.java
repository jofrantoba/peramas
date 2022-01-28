/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.bean;

/**
 *
 * @author JONA
 */
public class BeanHeader {
    private String nomColumn;
    private int numeroColumna;
    private String grupo;
    private String columna;

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    public String getNomColumn() {
        return nomColumn;
    }

    public void setNomColumn(String nomColumn) {
        this.nomColumn = nomColumn;
    }
    
    

    public BeanHeader(String nombreColumna,int numColumn,String grupo, String columna) {
        this.nomColumn=nombreColumna;
        this.numeroColumna=numColumn;
        this.grupo = grupo;
        this.columna = columna;
    }        

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }        
    
}
