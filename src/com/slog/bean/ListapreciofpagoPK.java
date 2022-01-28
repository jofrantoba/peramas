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
public class ListapreciofpagoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ide_lp", nullable = false)
    private int ideLp;
    @Basic(optional = false)
    @Column(name = "codfpago", nullable = false, length = 2)
    private String codfpago;

    public ListapreciofpagoPK() {
    }

    public ListapreciofpagoPK(int ideLp, String codfpago) {
        this.ideLp = ideLp;
        this.codfpago = codfpago;
    }

    public int getIdeLp() {
        return ideLp;
    }

    public void setIdeLp(int ideLp) {
        this.ideLp = ideLp;
    }

    public String getCodfpago() {
        return codfpago;
    }

    public void setCodfpago(String codfpago) {
        this.codfpago = codfpago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ideLp;
        hash += (codfpago != null ? codfpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListapreciofpagoPK)) {
            return false;
        }
        ListapreciofpagoPK other = (ListapreciofpagoPK) object;
        if (this.ideLp != other.ideLp) {
            return false;
        }
        if ((this.codfpago == null && other.codfpago != null) || (this.codfpago != null && !this.codfpago.equals(other.codfpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.slog.bean.ListapreciofpagoPK[ ideLp=" + ideLp + ", codfpago=" + codfpago + " ]";
    }
    
}
