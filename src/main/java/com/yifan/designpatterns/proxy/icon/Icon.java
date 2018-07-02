package com.yifan.designpatterns.proxy.icon;

import java.awt.*;

/**
 * @author wuyifan
 * @since 2018年01月29日
 */
public interface Icon {

    int getIconWidth();

    int getIconHeight();

    void paintIcon(final Component c, Graphics g, int x, int y);
}
