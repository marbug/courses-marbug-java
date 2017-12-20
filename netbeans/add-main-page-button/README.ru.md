# Добавление кнопки на главной странице / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

В файле **src/main/java/com/mycompany/gitmanagerapp/MainPage.java** после

    public class MainPage

добавьте текст

    extends JPanel

чтобы получилось

    public class MainPage extends JPanel {

и после этой строки добавьте

        String pathButtonString = "Open";

        public MainPage() {
            // pathButton
            JButton pathButton = new JButton();
            pathButton.setText(pathButtonString);
            pathButton.setCursor(Cursor.getDefaultCursor());

            this.add(pathButton);
        }

Смотрите изменения на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v0.9_add-main-page...v0.10_add-main-page-code)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v0.10_add-main-page-code%0Dv0.9_add-main-page#diff)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
