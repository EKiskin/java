package com.geekbrains.lesson4;

public interface Tasks {
    int addTask(Task task) throws TaskException;
    Task deleteTaskById(int id);
    Task deleteTaskByName(String name);
    void printTasks();
}
