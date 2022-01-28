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
public class FactorconvPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "umorigen", nullable = false, length = 6)
    private String umorigen;
    @Basic(optional = false)
    @Column(name = "umdestino", nullable = false, length = 6)
    private String umdestino;

    public FactorconvPK() {
    }

    public FactorconvPK(String umorigen, String umdestino) {
        this.umorigen = umorigen;
        this.umdestino = umdestino;
    }

    public String getUmorigen() {
        return umorigen;
    }

    public void setUmorigen(String umorigen) {
        this.umorigen = umorigen;
    }

    public String getUmdestino() {
        return umdestino;
    }

    public void setUmdestino(String umdestino) {
        this.umdestino = umdestino;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (umorigen != null ? umorigen.hashCode() : 0);
        hash += (umdestino != null ? umdestino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FactorconvPK)) {
            return false;
        }
        FactorconvPK other = (FactorconvPK) object;
        if ((this.umorigen == null && other.umorigen != null) || (this.umorigen != null && !this.umorigen.equals(other.umorigen))) {
            return false;
        }
        if ((this.umdestino == null && other.umdestino != null) || (this.umdestino != null && !this.umdestino.equals(other.umdestino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.slog.bean.FactorconvPK[ umorigen=" + umorigen + ", umdestino=" + umdestino + " ]";
    }
    
}
