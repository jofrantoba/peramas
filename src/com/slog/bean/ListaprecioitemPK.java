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
public class ListaprecioitemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ide_lp", nullable = false)
    private int ideLp;
    @Basic(optional = false)
    @Column(name = "ide_item", nullable = false)
    private int ideItem;

    public ListaprecioitemPK() {
    }

    public ListaprecioitemPK(int ideLp, int ideItem) {
        this.ideLp = ideLp;
        this.ideItem = ideItem;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ideLp;
        hash += (int) ideItem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListaprecioitemPK)) {
            return false;
        }
        ListaprecioitemPK other = (ListaprecioitemPK) object;
        if (this.ideLp != other.ideLp) {
            return false;
        }
        if (this.ideItem != other.ideItem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.slog.bean.ListaprecioitemPK[ ideLp=" + ideLp + ", ideItem=" + ideItem + " ]";
    }
    
}
