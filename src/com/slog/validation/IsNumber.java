/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.validation;

import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author JONA
 */
public class IsNumber extends AbstractValidatorInput{
    
    public IsNumber(JDialog parent,JComponent c,String mensaje){
        super(parent,c,mensaje);
    }

    @Override
    protected boolean validationCriteria(JComponent c) {                           
            try{
                String val=((JTextField)c).getText();
                BigDecimal.valueOf(Double.valueOf(val));
                return true;
            }catch(Exception ex){
                return false;
            }
    }       
}
