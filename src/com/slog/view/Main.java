/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.view;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author JONA
 */
public class Main {

    public static void main(String arg[]) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);                
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewLogin GUI_login = new ViewLogin();
                GUI_login.setVisible(true);
            }
        });
    }
}
