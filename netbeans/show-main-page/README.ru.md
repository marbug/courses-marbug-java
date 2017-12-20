# Отображение главной страницы / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

В файле **src/main/java/com/mycompany/gitmanagerapp/GitManagerApp.java** после

    JFrame frame = new JFrame( "Git Manager" );

добавляем

        MainPage mainPage = new MainPage();
        frame.add(mainPage);

Смотрите изменения на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v0.10_add-main-page-code...v0.11_show-main-page)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v0.11_show-main-page%0Dv0.10_add-main-page-code#diff)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
