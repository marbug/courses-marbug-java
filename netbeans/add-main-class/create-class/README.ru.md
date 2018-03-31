# Создать класс GitManagerApp / Создание проекта / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

* Ввести **GitManagerApp** в поле **Имя класса**
* Кликнуть на кнопку **Готово**

![Диалог](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/add-main-class/dialog.ru.png)

## Проверить GitManagerApp файл ##

Он должен содержать следующий код:

    package com.mycompany.gitmanagerapp;

    public class GitManagerApp {

    }

## Пример реализации ##

Изменения можно посмотреть по одной из следующих ссылок:

* [GitHub](https://github.com/marbug/courses-marbug-java/blob/v0.4_add-main-class/git-manager-app/GitManagerApp/src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/src/95e0c0b8c67759736756f1ec169c043b5e5664f8/git-manager-app/GitManagerApp/src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java?fileviewer=file-view-default)

## Детальное описание ##

### package ###

**package** (читается **пЭкэдж**) - это "пакет". Но не целофановый, и не бумажный, а для хранения части кода программы.

Зачем он нужен? Представьте, что вы производитель машин или духов. Информация о том, как вы производите свою продукцию, должна где-то храниться. Если всю информацию свалить в одно место, то получится не очень удобно. Это как написать книгу/курсовую/проект без глав, разделов и абзацев: будет крайне запутанно.

Поэтому участки кода разделяют на пакеты. Более детально поговорим позже. Главное сейчас - это понять, что каждый пакет за что-то отвечает.

Например, если бы мы писали программу производства машин или духов, то один пакет мог бы описывать доставку материалов (железа для машин, или растений для духов). Другой пакет мог бы описывать процесс обработки железа для производства двигателя (для авто) или процесс варки растений (для духов).

В нашем случае пакет описывает, что именно с него начинается наша программа. Т.е. именно в этом пакете мы описываем то, что будем делать дальше (для производства машины или духов). 

### com.mycompany.gitmanagerapp ###

Эта "абра-кадабра" является:

* названием сайта нашей компании (например, **mycompany.com**), записанное в обратном порядке (т.е. **com.mycompany**)

* с добавлением (через точку) названием нашей программы (**GitManagerApp**), записанная маленькими буквами.

Зачем это нужно? Так нннада ;) Давайте вернёмся к этому позже, чтобы не отвлекаться от главного на данный момент. Важно запомнить: **названия пакетов пишутся через точку, маленькими буквами, без пробелов**.

### public ###

**public** (читается **пАблик**) - это "служебное слово" языка Ява, которое означает, что этот код может быть использован из других пакетов. Детальнее поговорим позже (не удивляйтесь: "поговорим позже" будет встречаться тут часто - так нннадо).

### class ###

**class** (читается **класс**) - это "служебное слово" языка Ява, которое означает тип объекта, с которым мы собираемся работать. Может быть класс "Машина", может быть класс "Духи", может быть класс "КакХотимТакИНазываем". Главное: **перед названием класса обязательно должно стоять "служебное слово" class**.

### GitManagerApp ###

**GitManagerApp** - это именно вариант "КакХотимТакИНазываем". Имеено так вот мы решили назвать свой класс (ну ладно, я решил), который означает, что именно с него мы хотим начать выполнение нашей программы.

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |