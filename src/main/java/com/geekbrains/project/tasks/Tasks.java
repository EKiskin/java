package com.geekbrains.project.tasks;

public interface Tasks {
    boolean addTask(Task task) throws TaskException;
    Task deleteTaskById(int id);
    Task deleteTaskByName(String name);
    void printTasks();
}
