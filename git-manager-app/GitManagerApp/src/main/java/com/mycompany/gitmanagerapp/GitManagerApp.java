/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitmanagerapp;

import javax.swing.JFrame;

/**
 *
 * @author marbug
 */
public class GitManagerApp {
    public static void main(String[] args) {
        createMainWindow();
    }
    
    public static void createMainWindow() {
        JFrame frame = new JFrame( "Git Manager" );
        
        MainPage mainPage = new MainPage();
        frame.add(mainPage);

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        frame.setExtendedState( frame.getExtendedState() | JFrame.MAXIMIZED_BOTH );
    }
}
