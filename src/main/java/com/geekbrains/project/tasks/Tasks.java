package com.geekbrains.project.tasks;

import java.util.stream.Stream;

public interface Tasks {
    boolean addTask(Task task) throws TaskException;
    Task deleteTaskById(int id);
    Task deleteTaskByName(String name);
    void printTasks();
    Stream<Task> stream();
}
