package task_manager;

import java.time.LocalDateTime;

public class Task {

    private String id;
    private String description;
    private TaskStatus status;
    private Employee executor;
    private Employee author;
    private LocalDateTime taskDateTime;
    private LocalDateTime timeLimit;
    private Priority priority;
    private double completionDate;

    public Task() {
    }

    public Task(String id, String description, TaskStatus status, Employee executor, Employee author,
                LocalDateTime taskDateTime, LocalDateTime timeLimit, Priority priority, double completionDate) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.executor = executor;
        this.author = author;
        this.taskDateTime = LocalDateTime.now();
        this.timeLimit = timeLimit;
        this.priority = priority;
        this.completionDate = completionDate;
    }

    public void addTask() {
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Employee getExecutor() {
        return executor;
    }

    public Employee getAuthor() {
        return author;
    }

    public LocalDateTime getTaskDateTime() {
        return taskDateTime;
    }

    public LocalDateTime getTimeLimit() {
        return timeLimit;
    }

    public Priority getPriority() {
        return priority;
    }

    public double getCompletionDate() {
        return completionDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + id + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", executor=" + executor +
                ", author=" + author +
                ", taskDateTime=" + taskDateTime +
                ", timeLimit=" + timeLimit +
                ", priority=" + priority +
                ", completionDate=" + completionDate +
                '}';
    }
}