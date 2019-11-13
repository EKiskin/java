package com.geekbrains.lesson3;

public interface Tasks {
    int addTask(Task task);
    Task deleteTaskById(int id);
    Task deleteTaskByName(String name);
    void printTasks();
}
