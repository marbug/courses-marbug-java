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
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v0.10_add-main-page-code%0Dv0.9_add-main-page#diff)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
