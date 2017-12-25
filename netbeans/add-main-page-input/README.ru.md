# Добавление поля ввода на главной странице / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

В файле **src/main/java/com/mycompany/gitmanagerapp/MainPage.java** после

    String pathButtonString = "Open";

добавляем

    String pathInputString = "Path will be here";

После

    public MainPage() {

добавляем

        // pathInput
        JTextField pathInput = new JTextField();
        pathInput.setText(pathInputString);

Перед

    this.add(pathButton);

добавляем

    this.add(pathInput);

Смотрите изменения на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v4.0_before-add-input...v4.1_add-path-input)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v4.1_add-path-input%0Dv4.0_before-add-input#diff)

## Запуск проекта ##

* Кликнуть на **Выпролнить** в верхнем меню
* Кликнуть на **Запустить проект (GitManagerApp)**

![Меню](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/run-project/menu.ru.png)

## Результат ##

![Меню](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/add-main-page-input/result.ru.png)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
