package com.geekbrains.lesson2;

public class MainApp {
    public static void main(String[] args) {
        TaskTracker taskTracker = new TaskTracker();
        taskTracker.addTask(new Task(1, "task 1"));
        taskTracker.addTask(new Task(2, "task 2"));
        taskTracker.addTask(new Task(3, "task 3"));
        taskTracker.printTasks();
        taskTracker.deleteTaskById(2);
        taskTracker.printTasks();
    }
}
