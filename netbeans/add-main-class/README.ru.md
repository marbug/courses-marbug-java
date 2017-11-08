# Создание проекта / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

## Открыть нужную директорию/папку ##

* Кликнуть на **Файлы** слева вверху
* Кликнуть на **GitManagerApp**
* Кликнуть на **src**
* Кликнуть на **main**
* Кликнуть на **java**
* Кликнуть на **com**
* Кликнуть на **mycompany**

## Создать GitManagerApp файл ##

* Кликнуть правой кнопкой мышки на **gitmanagerapp**
* Кликнуть на **Новый**
* Кликнуть на **Класс Java...**
* Ввести **GitManagerApp** в поле **Имя класса**
* Кликнуть на кнопку **Готово**

## Проверить GitManagerApp файл ##

Он должен содержать следующий код:

    package com.mycompany.gitmanagerapp;

    public class GitManagerApp {

    }

[GitHub](https://github.com/marbug/courses-marbug-java/blob/v0.4_add-main-class/git-manager-app/GitManagerApp/src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java)
[Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/src/95e0c0b8c67759736756f1ec169c043b5e5664f8/git-manager-app/GitManagerApp/src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java?fileviewer=file-view-default)

## Добавить код Hello World ##

Вставьте следующий код

    public static void main(String[] args) {
        System.out.println("Hello, World");
    }

внутрь

    public class GitManagerApp {

    }

т.е в результате должно получиться:

    public class GitManagerApp {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }

[GitHub](https://github.com/marbug/courses-marbug-java/blob/v0.5_add-hello-world-code/git-manager-app/GitManagerApp/src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java)
[Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/src/d592cefd1b637a1e54531c902037c6788d3052f6/git-manager-app/GitManagerApp/src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java?at=v0.5_add-hello-world-code&fileviewer=file-view-default)
