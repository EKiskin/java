package com.geekbrains.project;

import com.geekbrains.project.tasks.Task;
import com.geekbrains.project.tasks.TaskService;

public class MainApp {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.addTask(new Task(1, "task 1"));
        taskService.addTask(new Task(2, "task 2"));
        taskService.addTask(new Task(3, "task 1"));
        taskService.printTasks();
        taskService.deleteTaskById(2);
        taskService.printTasks();
    }
}
