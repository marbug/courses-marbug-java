# Detailed info / Add main window / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| **English** | [Русский / Russian](README.ru.md) | [Українська / Ukrainian](README.uk.md) |

## import ##

    import javax.swing.JFrame;

This means that we are going to use public class **JFrame** from **javax.swing** package in out code.

## remove line ##

    System.out.println("Hello, World");

We have removed that line because we do not need that message anymore.

## createMainWindow ##

    createMainWindow();

This means that we are calling function called **createMainWindow**.

## method/function ##

    public static void createMainWindow() {
      ...
    }

Is our new **createMainWindow** method/function body.

## frame ##

    JFrame frame = new JFrame( "Git Manager" );

This means the following:

* **JFrame frame** defines that we are going to use variable of type **JFrame** and it's name is **frame**.
* **new JFrame(...)** creates new object of type **JFrame**.
* **"Git Manager"** means that new **JFrame** object will have this title.
* **frame = ...** means that new **JFrame** object is assigned to variable **frame**

I.e. variable **frame** contains new window with title **Git Manager** now.

## setDefaultCloseOperation ##

    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

Means that close button of our window will just close it. Let's discuss this [later](TODO).

## setVisible ##

    frame.setVisible( true );

This code shows window (by default window is hidden).

## setExtendedState ##

    frame.setExtendedState( frame.getExtendedState() | JFrame.MAXIMIZED_BOTH );

This line makes window to use whole screen width and height.

| Navigation               |
| ------------------------ |
| [Level up](../README.md) |
