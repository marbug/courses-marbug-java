/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marbug
 */
public class MainPage extends JPanel {

    String pathButtonString = "Open";
    String pathInputString = "Path will be here";
    String pathLabelString = "Repo";
    
    public MainPage() {
        setLayout(new GridLayout(0, 3));

        JLabel pathLabel = new JLabel(pathLabelString);

        // pathInput
        JTextField pathInput = new JTextField();
        pathInput.setText(pathInputString);

        // pathButton
        JButton pathButton = new JButton();
        pathButton.setText(pathButtonString);
        pathButton.setCursor(Cursor.getDefaultCursor());        
        
        this.add(pathLabel);
        this.add(pathInput);
        this.add(pathButton);
    }
}
