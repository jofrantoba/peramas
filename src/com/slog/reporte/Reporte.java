/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.reporte;

import com.slog.dao.DaoUsuario;
import java.awt.Dialog.ModalExclusionType;
import java.util.Map;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrador
 */
public class Reporte {

    public void show(String strNombreArchivo, Map parameters, String istrTitulo)
    {
        
        try {
            
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource(strNombreArchivo + ".jasper"));
//System.out.println(getClass().getResource( strNombreArchivo ));
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, DaoUsuario.cnx);
            jprint.setProperty(JRXlsAbstractExporterParameter.PROPERTY_DETECT_CELL_TYPE, "true");
            jprint.setProperty(JRXlsAbstractExporterParameter.PROPERTY_IGNORE_CELL_BORDER, "true");

            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jviewer.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
//            jviewer.setIconImage (new ImageIcon(getClass().getResource("/comedor/resources/MYCOMP.gif")).getImage());
            jviewer.setTitle(istrTitulo);
            jviewer.setVisible(true);


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             System.out.println(ex.getCause());
              System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace();
        }
    }
}
