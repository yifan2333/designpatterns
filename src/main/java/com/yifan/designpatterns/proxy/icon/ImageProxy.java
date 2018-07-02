package com.yifan.designpatterns.proxy.icon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author wuyifan
 * @since 2018年01月29日
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;

    private URL imageURL;

    private boolean retrieving = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    @Override
    public int getIconWidth() {
        return imageIcon == null ? 800 : imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon == null ? 600 : imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, Please wait...", x + 300, y+ 190);
            if (!retrieving) {
                retrieving = true;
                Thread retrievalThread = new Thread(() -> {
                    try {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

                retrievalThread.start();
            }
        }
    }
}
