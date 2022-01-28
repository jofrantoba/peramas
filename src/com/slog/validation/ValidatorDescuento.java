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
public class ValidatorDescuento extends AbstractValidatorInput{
    
    public ValidatorDescuento(JDialog parent,JComponent c,String mensaje){
        super(parent,c,mensaje);
    }

    @Override
    protected boolean validationCriteria(JComponent c) { 
        int colum = ViewApplication.frmListaPrecioItem.getData().getSelectedColumn();
        int fil = ViewApplication.frmListaPrecioItem.getData().getSelectedRow();
        int rowModel = ViewApplication.frmListaPrecioItem.getData().convertRowIndexToModel(fil);
        int columnModel = ViewApplication.frmListaPrecioItem.getData().convertColumnIndexToModel(colum);
            try{
                String val=((JTextField)c).getText().trim();
                BigDecimal valorIngresado=BigDecimal.valueOf(Double.valueOf(val));
                if(0>valorIngresado.doubleValue()||valorIngresado.doubleValue()>100){
                    ViewApplication.frmListaPrecioItem.getTmlpi().setValueAt(0.0, rowModel, columnModel);
                    setMessage("aceptable entre 0% - 100%");
                    return false;
                }
                BigDecimal factor=BigDecimal.valueOf(100);
                BigDecimal porc=valorIngresado.divide(factor);
                ViewApplication.frmListaPrecioItem.getTmlpi().setValueAt(porc, rowModel, columnModel);
                return true;
            }catch(Exception ex){
                ViewApplication.frmListaPrecioItem.getTmlpi().setValueAt(0.0, rowModel, columnModel);
                setMessage("No es un numero");
                return false;
            }
    }       
}