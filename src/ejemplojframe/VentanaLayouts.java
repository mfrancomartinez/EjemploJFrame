/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author mfrancomartinez
 */
public class VentanaLayouts {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public VentanaLayouts(JFrame marco, JPanel panel, JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5) {
        this.marco = marco;
        this.panel = panel;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.boton4 = boton4;
        this.boton5 = boton5;
    }

    public VentanaLayouts() {
    }
    
    
    
    public void distribuidorFlowLayouts(){
        marco = new JFrame("FlowLayout");
        panel = new JPanel ();
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
        boton1.setBackground(Color.yellow);
        boton2.setBackground(Color.red);
        boton3.setBackground(Color.BLUE);
        boton4.setBackground(Color.BLACK);
        boton5.setBackground(Color.GREEN);
        marco.setSize(600,300);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    public void disboxLayout(){
          panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
          panel.add(boton1);
          panel.add(boton2);
          panel.add(boton3);
          panel.add(boton4);
          panel.add(boton5);
          marco.pack();
          marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          marco.setVisible(true);
          
          
    }
    public void disborderLayout(){
        panel.setLayout(new BorderLayout());
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.EAST);
        panel.add(boton3,BorderLayout.WEST);
        panel.add(boton4,BorderLayout.SOUTH);
        panel.add(boton5,BorderLayout.CENTER);
        marco.add(panel);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    public void disGridLayout(){
        panel.setLayout(new GridLayout(3,2));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
