/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parabola;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author neliloghmani
 */
public class Parabola extends JFrame {

    public Parabola(String g){
        super(g);
                              }
        public static class GraphPanel extends JPanel{

            @Override
            protected void paintComponent(Graphics g){
            g.drawLine(50,200,350,200); // g.drawline(x1,y1,x2,y2)
            g.drawLine(200, 0, 200, 300);
           
            Polygon poly;
                poly = new Polygon();
            double scaleFactor = 0.1;
            for (int x=-50; x<=50; x++) {
            poly.addPoint(x+200, 200- (int)(scaleFactor *x *x));
                                }
                    g.drawPolygon(poly);
                                                      }
                                                       }
}
