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
