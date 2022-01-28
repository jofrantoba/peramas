/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.util;

import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Jona
 */
public class IconTreeModel implements TreeModel {

    private TreeEntry root;
    protected EventListenerList listenerList = new EventListenerList();

    public IconTreeModel() {
        root = new TreeEntry("_ROOT_", null, "root");
        Imagenes picture = new Imagenes();
        /*Modulos */
        TreeEntry moduloLogistica = new TreeEntry("LOGISTICA", picture.getLogistica64(), "ml");
        ArrayList<TreeEntry> hijosRoot = new ArrayList();
        hijosRoot.add(moduloLogistica);
        root.setHijos(hijosRoot);
        /*Fin Modulos*/
        TreeEntry listaPrecios = new TreeEntry("LISTA DE PRECIOS", picture.getLista32(), "mlprecios");
        ArrayList<TreeEntry> hijosModuloPrestamo = new ArrayList();
        hijosModuloPrestamo.add(listaPrecios);
        moduloLogistica.setHijos(hijosModuloPrestamo);
    }

    public Object getRoot() {
        return root;
    }

    public Object getChild(Object parent, int index) {
        return ((TreeEntry) parent).get(index);
    }

    public int getChildCount(Object parent) {
        return ((TreeEntry) parent).size();
    }

    public boolean isLeaf(Object node) {
        return ((TreeEntry) node).size() == 0;
    }

    public void valueForPathChanged(TreePath path, Object newValue) {
        throw new UnsupportedOperationException("Not supported");
    }

    public int getIndexOfChild(Object parent, Object child) {
        return ((TreeEntry) parent).indexOf(child);
    }

    public void addTreeModelListener(TreeModelListener l) {
        listenerList.add(TreeModelListener.class, l);
    }

    public void removeTreeModelListener(TreeModelListener l) {
        listenerList.remove(TreeModelListener.class, l);
    }
}