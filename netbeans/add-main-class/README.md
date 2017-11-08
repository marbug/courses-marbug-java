# Create Project / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| **English** | [Русский / Russian](README.ru.md) | [Українська / Ukrainian](README.uk.md) |

## Open needed directory/folder ##

* Click on **Files** on the top left
* Click on **GitManagerApp**
* Click on **src**
* Click on **main**
* Click on **java**
* Click on **com**
* Click on **mycompany**

## Create GitManagerApp file ##

* Right click on **gitmanagerapp**
* Click on **New**
* Click on **Java Class...**
* Input **GitManagerApp** in **Class Name** field
* Click on **Finish** button

## Check GitManagerApp file ##

It should contain the following code:

    package com.mycompany.gitmanagerapp;

    public class GitManagerApp {

    }

## Add Hello World code ##

Put the following code

    public static void main(String[] args) {
        System.out.println("Hello, World");
    }

inside

    public class GitManagerApp {

    }

i.e. the result should be:

    public class GitManagerApp {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }
