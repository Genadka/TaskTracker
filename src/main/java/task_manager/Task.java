package task_manager;

import java.time.LocalDateTime;

public class Task {

    private int id;
    private static final int nextId = 1;
    private String description;
    private TaskStatus status;
    private Employee executor;
    private Employee author;
    private LocalDateTime dateTimeTaskCreation;
    private LocalDateTime timeLimit;
    private Priority priority;
    private LocalDateTime completionDate;

    public Task() {
    }

    public Task(int nextId, int id, String description, TaskStatus status, Employee executor, Employee author,
                LocalDateTime dateTimeTaskCreation, LocalDateTime timeLimit, Priority priority, LocalDateTime completionDate) {
        this.id = nextId;
        nextId++;
        this.description = description;
        this.status = status;
        this.executor = executor;
        this.author = author;
        this.dateTimeTaskCreation = LocalDateTime.now();
        this.timeLimit = timeLimit;
        this.priority = priority;
        this.completionDate = completionDate;
    }

    public int getId() {
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

    public LocalDateTime getDateTimeTaskCreation() {
        return dateTimeTaskCreation;
    }

    public LocalDateTime getTimeLimit() {
        return timeLimit;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setExecutor(Employee executor) {
        this.executor = executor;
    }

    public void setAuthor(Employee author) {
        this.author = author;
    }

    public void setDateTimeTaskCreation(LocalDateTime dateTimeTaskCreation) {
        this.dateTimeTaskCreation = dateTimeTaskCreation;
    }

    public void setTimeLimit(LocalDateTime timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + id + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", executor=" + executor +
                ", author=" + author +
                ", taskDateTime=" + dateTimeTaskCreation +
                ", timeLimit=" + timeLimit +
                ", priority=" + priority +
                ", completionDate=" + completionDate +
                '}';
    }
}