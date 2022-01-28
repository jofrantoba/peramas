/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.validation;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author JONA
 */
public class NotEmptyValidator extends AbstractValidatorInput{
    
    public NotEmptyValidator(JDialog parent,JComponent c,String mensaje){
        super(parent,c,mensaje);
    }

    @Override
    protected boolean validationCriteria(JComponent c) {        
            if(((JTextField)c).getText().equals("")){
                return false;
            }else{
                return true;
            }        
    }       
}
