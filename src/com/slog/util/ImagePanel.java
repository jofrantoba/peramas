/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slog.util;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author JONA
 */
public class ImagePanel extends JPanel {

    Image img;

    public ImagePanel(Image imagen) {
        img = imagen;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        if (img != null) {
            g.drawImage(img, 20, 20, this);
        }
    }
}
