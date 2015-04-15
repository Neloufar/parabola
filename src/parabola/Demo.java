/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parabola;

import javax.swing.JFrame;

/**
 *
 * @author neliloghmani
 */
public class Demo {
    public static void main(String[] args) {
// TODO Auto-generated method stub
    Parabola frame= new Parabola("Parabola");
    frame.setVisible(true);
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Parabola.GraphPanel g= new Parabola.GraphPanel();
    frame.add(g);
}
}
