/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author mfrancomartinez
 */
public class Ventana {
   JFrame marco;
   JPanel panel1, panel2;
   public Ventana(){
       marco = new JFrame("OUI");
       marco.setSize(800,400);
       panel1 = new JPanel ();
       panel2 = new JPanel ();
       panel1.setBounds(0,0,800,150);
       panel1.setBackground(Color.red);
       panel2.setBounds(0,200,800,150);
       panel2.setBackground(Color.BLUE);
       marco.setLayout(null);
       marco.add(panel1);
       marco.add(panel2);
       marco.setLocationRelativeTo(marco);
       marco.pack();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
}
