# Добавление ярлыка на главной странице / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

В файле **src/main/java/com/mycompany/gitmanagerapp/MainPage.java** после

    String pathInputString = "Path will be here";

вставить

    String pathLabelString = "Repo";

В строке

    setLayout(new GridLayout(0, 2));

заменяем **2** на **3**:

    setLayout(new GridLayout(0, 3));

И потом добавляем:

    JLabel pathLabel = new JLabel(pathLabelString);

Перед

    this.add(pathInput);

вставить

    this.add(pathLabel);

Смотрите изменения на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v4.3_change-grid-layout-params...v4.4_add-main-page-label)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v4.4_add-main-page-label%0Dv4.3_change-grid-layout-params#diff)

## Запуск проекта ##

* Кликнуть на **Выпролнить** в верхнем меню
* Кликнуть на **Запустить проект (GitManagerApp)**

![Меню](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/run-project/menu.ru.png)

## Результат ##

![Меню](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/add-main-page-label/result.ru.png)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
