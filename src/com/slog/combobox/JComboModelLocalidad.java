/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.combobox;

import com.slog.bean.Localidad;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;
import javax.swing.event.EventListenerList;

/**
 *
 * @author JONA
 */
public class JComboModelLocalidad extends AbstractListModel implements MutableComboBoxModel {

    private Object selectedItem = null;
    private ArrayList<Localidad> data = new ArrayList();

    public JComboModelLocalidad() {
    }

    public JComboModelLocalidad(ArrayList<Localidad> datos) {
        data = datos;
    }

    @Override
    public int getSize() {
        try {
            return data.size();
        } catch (NullPointerException ex) {
            return 0;
        }
    }

    @Override
    public Object getElementAt(int index) {
        return (Object) data.get(index).getDescriLocalidad();
    }

    public Localidad getElement(int index) {
        return data.get(index);
    }

    @Override
    public void addElement(Object obj) {
        data.add((Localidad) obj);
        int length = getSize();
        fireIntervalAdded(this, length - 1, length - 1);
    }

    @Override
    public void removeElement(Object obj) {
        int index = data.indexOf((Localidad) obj);
        if (index != -1) {
            data.remove((Localidad) obj);
            fireIntervalRemoved(this, index, index);
        }
    }

    @Override
    public void insertElementAt(Object obj, int index) {
        data.add(index, (Localidad) obj);
        fireIntervalAdded(this, index, index);
    }

    @Override
    public void removeElementAt(int index) {
        if (getSize() >= index) {
            data.remove(index);
            fireIntervalRemoved(this, index, index);
        }
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    public ArrayList<Localidad> getData() {
        return data;
    }

    public void setData(ArrayList<Localidad> data) {
        this.data = data;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
}
