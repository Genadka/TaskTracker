package task_manager;

import java.util.Scanner;

public class GraphicMenu {

    public void menu(String[] args) {
        TasService tasService = new TasService();
        System.out.println("1. Создать задачу");
        System.out.println("2. Полная информация по задаче");
        System.out.println("3. Редактировать задачу");
        System.out.println("4. Удаление задачи");
        System.out.println("5. Выход из меню");
        //System.out.println("4. Сменить приоритет задачи");
        //System.out.println("5. Дата создания");
        //System.out.println("2. Статус задачи");
        System.out.println("Выберете пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1: tasService.creationTask();
            case 2: tasService.getInfo();
            case 3: tasService.editTask();
            case 4: tasService.delete();
            case 5: break;
        }
    }
}