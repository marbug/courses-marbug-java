# Add main window / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| **English** | [Русский / Russian](README.ru.md) | [Українська / Ukrainian](README.uk.md) |

After the following text:

    package com.mycompany.gitmanagerapp;

add, please, such code:

    import javax.swing.JFrame;

Then replace line after

    public static void main(String[] args) {

by the following text:

        createMainWindow();

Then add:

    public static void createMainWindow() {
        JFrame frame = new JFrame( "Git Manager" );

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        frame.setExtendedState( frame.getExtendedState() | JFrame.MAXIMIZED_BOTH );
    }

See changes on:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v0.6_before-add-main-window...v0.7_add-main-window)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v0.7_add-main-window%0Dv0.6_before-add-main-window#diff)

| Navigation               |
| ------------------------ |
| [Level up](../README.md) |
