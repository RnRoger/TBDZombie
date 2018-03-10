/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdzombie;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author Rogier
 */
public class CardHandler {

    public static void createCard(JLabel label) {
        label.setSize(label.getPreferredSize());
        MouseHandler mh = new MouseHandler();
        label.addMouseListener(mh);
        label.addMouseMotionListener(mh);
        System.out.println("create");
    }

    public static class MouseHandler extends MouseAdapter {

        private Point offset;

        @Override
        public void mousePressed(MouseEvent e) {
            offset = e.getPoint();
            System.out.println("pressed");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("dragged");
            int x = e.getPoint().x - offset.x;
            int y = e.getPoint().y - offset.y;
            Component component = e.getComponent();
            Point location = component.getLocation();
            location.x += x;
            location.y += y;
            component.setLocation(location);
        }

    }
}
