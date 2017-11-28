# Добавление главного окна / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

После следующего текста:

    package com.mycompany.gitmanagerapp;

добавьте, пожалуйста, такой код:

    import javax.swing.JFrame;

Затем замените строку после

    public static void main(String[] args) {

таким текстом:

        createMainWindow();

Потом добавьте:

    public static void createMainWindow() {
        JFrame frame = new JFrame( "Git Manager" );

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        frame.setExtendedState( frame.getExtendedState() | JFrame.MAXIMIZED_BOTH );
    }

Смотрите изменения на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v0.6_before-add-main-window...v0.7_add-main-window)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v0.7_add-main-window%0Dv0.6_before-add-main-window#diff)

## Детальное описание ##

Читайте [тут](detailed-info/README.md)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
