/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marbug
 */
public class MainPage extends JPanel {
    
    protected static int BORDER_MARGIN = 10;

    protected static final String pathButtonString = "Open";
    protected static final String pathInputString = "Path will be here";
    protected static final String pathLabelString = "Path";
    
    public MainPage() {
        setLayout(new BorderLayout());

        JPanel pathPanel = new JPanel(new FlowLayout());
        pathPanel.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(BORDER_MARGIN, BORDER_MARGIN, BORDER_MARGIN, BORDER_MARGIN),
                BorderFactory.createTitledBorder("Repo")
            )
        );
        add(pathPanel, BorderLayout.NORTH);
                
        this.addPathItems(pathPanel);
    }

    public void addPathItems(JPanel pathPanel) {
        JLabel pathLabel = new JLabel(pathLabelString);

        // pathInput
        JTextField pathInput = new JTextField();
        pathInput.setText(pathInputString);
        pathLabel.setLabelFor(pathInput);

        // pathButton
        JButton pathButton = new JButton();
        pathButton.setText(pathButtonString);
        pathButton.setCursor(Cursor.getDefaultCursor());        
        
        pathPanel.add(pathLabel, BorderLayout.WEST);
        pathPanel.add(pathInput);
        pathPanel.add(pathButton, BorderLayout.EAST);
    }
}
