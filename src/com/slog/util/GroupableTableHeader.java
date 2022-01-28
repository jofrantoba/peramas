/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.util;

import java.util.HashSet;
import java.util.Iterator;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author JONA
 */
public class GroupableTableHeader extends JTableHeader {

    private static final String uiClassID = "GroupableTableHeaderUI";
    protected HashSet columnGroups = null;

    public GroupableTableHeader(TableColumnModel model) {
        super(model);
        setUI(new GroupableTableHeaderUI());
        setReorderingAllowed(false);
    }

    @Override
    public void updateUI() {
        setUI(new GroupableTableHeaderUI());
    }

    @Override
    public void setReorderingAllowed(boolean b) {
        reorderingAllowed = false;
    }

    public void addColumnGroup(ColumnGroup g) {
        if (columnGroups == null) {
            columnGroups = new HashSet();
        }
        columnGroups.add(g);
    }

    public HashSet getColumnGroups(TableColumn col) {
        if (columnGroups == null) {
            return null;
        }
        for (Iterator i = columnGroups.iterator(); i.hasNext();) {
            ColumnGroup cGroup = (ColumnGroup) i.next();
            HashSet v_ret = (HashSet) cGroup.getColumnGroups(col, new HashSet());
            if (v_ret != null) {
                return v_ret;
            }
        }
        return null;
    }

    public void setColumnMargin() {
        if (columnGroups == null) {
            return;
        }
        int columnMargin = getColumnModel().getColumnMargin();
        for (Iterator i = columnGroups.iterator(); i.hasNext();) {
            ColumnGroup cGroup = (ColumnGroup) i.next();
            cGroup.setColumnMargin(columnMargin);
        }
    }
}