/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author JONA
 */
@Embeddable
public class LocalidadPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codigo_emp", nullable = false, length = 3)
    private String codigoEmp;
    @Basic(optional = false)
    @Column(name = "codigo_localidad", nullable = false, length = 2)
    private String codigoLocalidad;

    public LocalidadPK() {
    }

    public LocalidadPK(String codigoEmp, String codigoLocalidad) {
        this.codigoEmp = codigoEmp;
        this.codigoLocalidad = codigoLocalidad;
    }

    public String getCodigoEmp() {
        return codigoEmp;
    }

    public void setCodigoEmp(String codigoEmp) {
        this.codigoEmp = codigoEmp;
    }

    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(String codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEmp != null ? codigoEmp.hashCode() : 0);
        hash += (codigoLocalidad != null ? codigoLocalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalidadPK)) {
            return false;
        }
        LocalidadPK other = (LocalidadPK) object;
        if ((this.codigoEmp == null && other.codigoEmp != null) || (this.codigoEmp != null && !this.codigoEmp.equals(other.codigoEmp))) {
            return false;
        }
        if ((this.codigoLocalidad == null && other.codigoLocalidad != null) || (this.codigoLocalidad != null && !this.codigoLocalidad.equals(other.codigoLocalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.slog.bean.LocalidadPK[ codigoEmp=" + codigoEmp + ", codigoLocalidad=" + codigoLocalidad + " ]";
    }
    
}
