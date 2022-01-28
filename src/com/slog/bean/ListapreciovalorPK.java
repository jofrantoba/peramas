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
public class ListapreciovalorPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ide_lp", nullable = false)
    private int ideLp;
    @Basic(optional = false)
    @Column(name = "ide_item", nullable = false)
    private int ideItem;
    @Basic(optional = false)
    @Column(name = "codfpago", nullable = false, length = 2)
    private String codfpago;

    public ListapreciovalorPK() {
    }

    public ListapreciovalorPK(int ideLp, int ideItem, String codfpago) {
        this.ideLp = ideLp;
        this.ideItem = ideItem;
        this.codfpago = codfpago;
    }

    public int getIdeLp() {
        return ideLp;
    }

    public void setIdeLp(int ideLp) {
        this.ideLp = ideLp;
    }

    public int getIdeItem() {
        return ideItem;
    }

    public void setIdeItem(int ideItem) {
        this.ideItem = ideItem;
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
        hash += (int) ideItem;
        hash += (codfpago != null ? codfpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListapreciovalorPK)) {
            return false;
        }
        ListapreciovalorPK other = (ListapreciovalorPK) object;
        if (this.ideLp != other.ideLp) {
            return false;
        }
        if (this.ideItem != other.ideItem) {
            return false;
        }
        if ((this.codfpago == null && other.codfpago != null) || (this.codfpago != null && !this.codfpago.equals(other.codfpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.slog.bean.ListapreciovalorPK[ ideLp=" + ideLp + ", ideItem=" + ideItem + ", codfpago=" + codfpago + " ]";
    }
    
}
