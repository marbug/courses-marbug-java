# Додавання головного вікна / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | [Русский / Russian](README.ru.md) | **Українська / Ukrainian** |

Після наступного тексту:

    package com.mycompany.gitmanagerapp;

додайте, будь-ласка, такий код:

    import javax.swing.JFrame;

Потім замініть лінійку після

    public static void main(String[] args) {

наступним текстом:

        createMainWindow();

Потім додайте:

    public static void createMainWindow() {
        JFrame frame = new JFrame( "Git Manager" );

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        frame.setExtendedState( frame.getExtendedState() | JFrame.MAXIMIZED_BOTH );
    }

Перегляньте зміни на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v0.6_before-add-main-window...v0.7_add-main-window)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v0.7_add-main-window%0Dv0.6_before-add-main-window#diff)

## Детальний опис ##

Читайте [тут](detailed-info/README.uk.md)

| Навігація                |
| ------------------------ |
| [Вгору](../README.uk.md) |
