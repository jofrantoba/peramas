/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.util;

import com.slog.dao.DaoUsuario;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import org.openide.util.Exceptions;

/**
 *
 * @author JONA
 */
public class Exportar {

    File archivoDestino;
    Map parameters = new HashMap();
    String tipoExpor = "";

    public Exportar(File fileDestino, Map parametros, String tipoExportacion) {
        archivoDestino = fileDestino;
        parameters = parametros;
        tipoExpor = tipoExportacion;
    }

    public void show() {
        try {
            OutputStream out = new FileOutputStream(archivoDestino);
            InputStream entrada = this.getClass().getResourceAsStream("/com/slog/reporte/rptlistaprecioitem.jasper");
            JasperPrint jasper;
            jasper = JasperFillManager.fillReport(entrada, parameters, DaoUsuario.cnx);
            if (tipoExpor.equals("pdf")) {
                JRPdfExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasper);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
                exporter.exportReport();
            }else if(tipoExpor.equals("xls")){
                JExcelApiExporter xlsExporter = new JExcelApiExporter();
                xlsExporter.setParameter(JRExporterParameter.JASPER_PRINT,jasper);
                xlsExporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,Boolean.TRUE);
                xlsExporter.setParameter(JRExporterParameter.OUTPUT_STREAM,out);
                xlsExporter.exportReport();
            }
            out.flush();
            out.close();
            Desktop.getDesktop().open(archivoDestino.getAbsoluteFile());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        } catch (JRException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
