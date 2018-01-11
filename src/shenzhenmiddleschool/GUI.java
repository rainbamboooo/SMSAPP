/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shenzhenmiddleschool;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rainb
 */
public class GUI {
    public static void main(String[] args) {
        Frame f = new Frame("Shenzhen Middle School");
        f.setBounds(400, 200, 400, 300);
        f.setLayout(new FlowLayout());
        
        Button bu = new Button("Start APP");
        f.add(bu);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        bu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ShenzhenMiddleSchool.main(args);
                } catch (Exception ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        f.setVisible(true);
    }
}
