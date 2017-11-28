# Detailed info / Create Project / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| **English** | [Русский / Russian](README.ru.md) | [Українська / Ukrainian](README.uk.md) |

## package ##

    package com.mycompany.gitmanagerapp;

This line shows a package of current file. The package name must be unique for each company or developer. For example, **com.google.**, **org.bitbucket.**, etc. Usually it contains also the name of the program: it our case it's **gitmanagerapp**.

## class ##

    public class GitManagerApp {

Each real world object has a type: a car, a bicycle, a book, etc. In development it's called **class**. I.e. here we defined our own class called **GitManagerApp**. **public** means that it's visible to everyone. Let's talk about **public** in details [later](TODO)

## main ##

    public static void main(String[] args) {
        ...
    }

Each object could do something: a car and a bicycle could move, a book could be opened/closed, etc. Each program must be started when it's run. And it has been decided that each program must start from a place (i.e. from "method/fuction") called **main**.

**void** means that this function does not return any data when it's called.

**static** means that this function could be called directly from any place without object creation. Let's talk about this in details [later](TODO)

**public** means ... Guess what. ;) Kidding... Same as above: it's visible to everyone.

## println ##

    System.out.println("Hello, World");

**System** is a public class, which has public object **out**. That public object **out** has a public method/function, called **println**. And that method/function **println** shows in console the value, which is send to it via parentheses. I.e. it prints on screen **Hello, World** text.

| Navigation               |
| ------------------------ |
| [Level up](../README.md) |
