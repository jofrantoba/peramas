/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.validation;

import com.slog.view.ViewApplication;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author JONA
 */
public class ValidatorCosto extends AbstractValidatorInput {

    public ValidatorCosto(JDialog parent, JComponent c, String mensaje) {
        super(parent, c, mensaje);
    }

    @Override
    protected boolean validationCriteria(JComponent c) {
        int colum = ViewApplication.frmListaPrecioItem.getData().getSelectedColumn();
        int fil = ViewApplication.frmListaPrecioItem.getData().getSelectedRow();
        try {
            String val = ((JTextField) c).getText().trim();
            BigDecimal valorIngresado = BigDecimal.valueOf(Double.valueOf(val));
            if (valorIngresado.doubleValue() < 0) {
                ViewApplication.frmListaPrecioItem.getTmlpi().setValueAt(0.0, fil, colum);
                setMessage("Debe ser mayor o igual a 0");
                return false;
            }
            return true;
        } catch (Exception ex) {
            ViewApplication.frmListaPrecioItem.getTmlpi().setValueAt(0.0, fil, colum);
            setMessage("No es un numero");
            return false;
        }
    }
}