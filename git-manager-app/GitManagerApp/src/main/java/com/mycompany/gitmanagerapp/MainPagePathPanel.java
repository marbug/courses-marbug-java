/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import static com.mycompany.gitmanagerapp.MainPage.BORDER_MARGIN;
import static com.mycompany.gitmanagerapp.MainPage.horizontalSpace;
import static com.mycompany.gitmanagerapp.MainPage.verticalSpace;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author marbug
 */
public class MainPagePathPanel extends JPanel implements ActionListener {

    protected static final String pathButtonString = "Open";
    protected static final String pathInputString = "Path will be here";
    protected static final String pathLabelString = "Path";

    JTextField pathInput;

    public MainPagePathPanel() {
        setLayout(new BorderLayout(horizontalSpace, verticalSpace));

        setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(BORDER_MARGIN, BORDER_MARGIN, BORDER_MARGIN, BORDER_MARGIN),
                BorderFactory.createTitledBorder("Repo")
            )
        );

        addPathItems();
    }
    
    public void addPathItems() {
        JLabel pathLabel = new JLabel(pathLabelString);

        // pathInput
        pathInput = new JTextField();
        pathInput.setText(pathInputString);
        pathLabel.setLabelFor(pathInput);

        // pathButton
        JButton pathButton = new JButton();
        pathButton.setText(pathButtonString);
        pathButton.setCursor(Cursor.getDefaultCursor());
        pathButton.addActionListener(this);

        add(pathLabel, BorderLayout.WEST);
        add(pathInput);
        add(pathButton, BorderLayout.EAST);
    }

        // implements ActionListener
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is clicked");
        selectFolder();
    }

    public void selectFolder() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            String selectedDirectory = chooser.getSelectedFile().getAbsolutePath();
            pathInput.setText(selectedDirectory);
        }
    }

}
