# Размещение елементов в панели / NetBeans / Java / MarBug / Courses

| Language | Язык | Мова |
| -------- | ---- | ---- |
| [English](README.md) | **Русский / Russian** | [Українська / Ukrainian](README.uk.md) |

## Добавление переменных ##

В файле **src/main/java/com/mycompany/gitmanagerapp/MainPage.java** после

    public class MainPage extends JPanel {

нужно добавить

        static int borderMargin = 5;
        static int horizontalSpace = 10;
        static int verticalSpace = 5;

## Изменение метки ##

Вместо

        String pathLabelString = "Repo";

вставляем код

        String pathLabelString = "Path";

и сразу после этого

        String pathPanelString = "Repo";

## Изменение основного layout ##

Заменяем

        setLayout(new GridLayout(0, 3));

на

        setLayout(new BorderLayout());

## Добавляем панель ##

После

        setLayout(new BorderLayout());

добавляем такой код

        JPanel pathPanel = createMainPathPanel();
        add(pathPanel, BorderLayout.NORTH);
    }

    public JPanel createMainPathPanel() {
        JPanel pathPanel = new JPanel();

        pathPanel.setLayout(new BorderLayout(horizontalSpace, verticalSpace));

        pathPanel.setBorder(
            BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(borderMargin, borderMargin, borderMargin, borderMargin),
                BorderFactory.createTitledBorder(pathPanelString)
            )
        );

## Перемещаем елементы новую панель ##

Вместо

        this.add(pathLabel);
        this.add(pathInput);
        this.add(pathButton);

вставляем

        pathPanel.add(pathLabel, BorderLayout.WEST);
        pathPanel.add(pathInput);
        pathPanel.add(pathButton, BorderLayout.EAST);

        return pathPanel;

## Код ##

Смотрите изменения на:

* [GitHub](https://github.com/marbug/courses-marbug-java/compare/v4.4_add-main-page-label...v4.5_move-items-to-panel)
* [Bitbucket](https://bitbucket.org/marbug/courses-marbug-java/branches/compare/v4.5_move-items-to-panel%0Dv4.4_add-main-page-label#diff)

## Запуск проекта ##

* Кликнуть на **Выпролнить** в верхнем меню
* Кликнуть на **Запустить проект (GitManagerApp)**

![Меню](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/run-project/menu.ru.png)

## Результат ##

![Меню](https://github.com/marbug/courses-marbug-java/blob/master/netbeans/move-items-to-panel/result.ru.png)

| Навигация                |
| ------------------------ |
| [Вверх](../README.ru.md) |
