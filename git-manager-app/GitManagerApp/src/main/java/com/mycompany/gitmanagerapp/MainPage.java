/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marbug
 */
public class MainPage extends JPanel {

    protected static final String pathButtonString = "Open";
    protected static final String pathInputString = "Path will be here";
    protected static final String pathLabelString = "Repo";
    
    public MainPage() {
        setLayout(new BorderLayout());

        JLabel pathLabel = new JLabel(pathLabelString);

        // pathInput
        JTextField pathInput = new JTextField();
        pathInput.setText(pathInputString);
        pathLabel.setLabelFor(pathInput);

        // pathButton
        JButton pathButton = new JButton();
        pathButton.setText(pathButtonString);
        pathButton.setCursor(Cursor.getDefaultCursor());        
        
        this.add(pathLabel, BorderLayout.WEST);
        this.add(pathInput);
        this.add(pathButton, BorderLayout.EAST);
    }
}
