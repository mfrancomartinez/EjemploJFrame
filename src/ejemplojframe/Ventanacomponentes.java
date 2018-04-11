/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;

import javax.swing.*;

/**
 *
 * @author mfrancomartinez
 */
public class Ventanacomponentes {
    JFrame marco;
    JFrame panel;
    JLabel etUsuario, etContrasinal;
    JButton button1, button2;
    JTextField JtUsuario, JtContrasinal;
    
    public Ventanacomponentes(){
        marco = new JFrame("ventana componentes");
        panel = new JFrame();
        etUsuario = new JLabel("usuario");
        etContrasinal = new JLabel("contrasinal");
        button1 = new JButton ("");
        button2 = new JButton ("");
        JtContrasinal = new JPasswordField();
        JtUsuario = new JTextField();
        
        marco.setSize(800,600);
        panel.add(etUsuario);
        panel.add(etContrasinal);
        panel.add(JtUsuario);
        panel.add(JtContrasinal);
        panel.add(button1);
        panel.add(button2);
        marco.add(panel);        
        marco.setLocationRelativeTo(marco);
        marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
}
