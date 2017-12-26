/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.GridLayout;
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

    static int borderMargin = 5;
    static int horizontalSpace = 10;
    static int verticalSpace = 5;

    String pathButtonString = "Open";
    String pathInputString = "Path will be here";
    String pathLabelString = "Path";
    String pathPanelString = "Repo";
    
    public MainPage() {
        setLayout(new BorderLayout());

        JPanel pathPanel = createMainPathPanel();
        add(pathPanel, BorderLayout.NORTH);
    }

    public JPanel createMainPathPanel() {
        JPanel pathPanel = new JPanel();

        pathPanel.setLayout(new BorderLayout(horizontalSpace, verticalSpace));

        pathPanel.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(borderMargin, borderMargin, borderMargin, borderMargin),
                BorderFactory.createTitledBorder(pathPanelString)
            )
        );

        JLabel pathLabel = new JLabel(pathLabelString);

        // pathInput
        JTextField pathInput = new JTextField();
        pathInput.setText(pathInputString);

        // pathButton
        JButton pathButton = new JButton();
        pathButton.setText(pathButtonString);
        pathButton.setCursor(Cursor.getDefaultCursor());        
        
        pathPanel.add(pathLabel, BorderLayout.WEST);
        pathPanel.add(pathInput);
        pathPanel.add(pathButton, BorderLayout.EAST);

        return pathPanel;
    }
}
