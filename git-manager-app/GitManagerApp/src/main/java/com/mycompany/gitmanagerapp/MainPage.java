/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author marbug
 */
public class MainPage extends JPanel {
    
    protected static final String pathButtonString = "Open";
    
    public MainPage() {
        // pathButton
        JButton pathButton = new JButton();
        pathButton.setText(pathButtonString);
        pathButton.setCursor(Cursor.getDefaultCursor());        
        
        this.add(pathButton);
    }
}
