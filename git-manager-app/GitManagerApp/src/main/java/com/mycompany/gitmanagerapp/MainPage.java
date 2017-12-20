/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.BorderLayout;
import java.awt.Cursor;
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

    static int horizontalSpace = 10;
    static int verticalSpace = 5;

    public MainPage() {
        setLayout(new BorderLayout());

        JPanel pathPanel = new MainPagePathPanel();
        add(pathPanel, BorderLayout.NORTH);
    }

}
