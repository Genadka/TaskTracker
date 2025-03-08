package task_manager;

import java.util.HashMap;
import java.util.Scanner;

public class TasService {

    public void creationTask() {
        // Map<Task, Integer> taskIntegerMap = new HashMap<>();
        Task task = new Task();
        System.out.println("Введте описание задачи:");
        Scanner scanner = new Scanner(System.in);
        task.setDescription(scanner.nextLine());
    }

    public void getInfo() {

    }
    public void findById() {

    }

    public void editTask() {

    }

    public void delete() {

    }
}
