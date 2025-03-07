package task_manager;

import java.util.Scanner;

public class GraphicMenu {

    public void menu(String[] args) {
        System.out.println("1. Создать задачу");
        System.out.println("2. Статус задачи");
        System.out.println("3. Полная информация по задаче");
        System.out.println("4. Сменить приоритет задачи");
        System.out.println("5. Дата создания");
        System.out.println("6. Выход из меню");
        System.out.println("Выберете пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
    }
}