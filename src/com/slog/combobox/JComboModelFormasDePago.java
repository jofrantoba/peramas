/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.combobox;

/**
 *
 * @author JONA
 */
import com.slog.bean.Fpago;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;
import javax.swing.event.EventListenerList;

/**
 *
 * @author cixtic03
 */
public class JComboModelFormasDePago extends AbstractListModel implements MutableComboBoxModel {

    private Object selectedItem;
    private ArrayList<Fpago> data = new ArrayList();

    public JComboModelFormasDePago() {
    }

    public JComboModelFormasDePago(ArrayList<Fpago> datos) {
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
        return (Object) data.get(index).getDescriFpago();
    }

    public Fpago getElement(int index) {
        return data.get(index);
    }

    @Override
    public void addElement(Object obj) {
        data.add((Fpago) obj);
        int length = getSize();
        fireIntervalAdded(this, length - 1, length - 1);
    }

    @Override
    public void removeElement(Object obj) {
        int index = data.indexOf((Fpago) obj);
        if (index != -1) {
            data.remove((Fpago) obj);
            fireIntervalRemoved(this, index, index);
        }
    }

    @Override
    public void insertElementAt(Object obj, int index) {
        data.add(index, (Fpago) obj);
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

    public ArrayList<Fpago> getData() {
        return data;
    }

    public void setData(ArrayList<Fpago> data) {
        this.data = data;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
}
