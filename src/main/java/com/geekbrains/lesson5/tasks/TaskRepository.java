package com.geekbrains.lesson5.tasks;

import java.util.ArrayList;
import java.util.ListIterator;

public class TaskRepository implements Tasks {
    private ArrayList<Task> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public boolean addTask(Task task) throws TaskException {
        int position = -1;
        for (Task item: tasks ) {
            if (item.getId()==task.getId() || item.getName()==task.getName()){
                throw new TaskException("Задача с таким id или name уже есть");
            }
        }
        return tasks.add(task);
    }

    @Override
    public Task deleteTaskById(int id) {
        Task result = null;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId()==id) {
                result = tasks.get(i);
                tasks.remove(i);
                break;
            }
        }
        return result;
    }

    @Override
    public Task deleteTaskByName(String name) {
        Task result = null;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getName()==name) {
                result = tasks.get(i);
                tasks.remove(i);
                break;
            }
        }
        return result;
    }

    @Override
    public void printTasks() {
        for (Task task: tasks) {
            System.out.println(task);
        }
    }
}
