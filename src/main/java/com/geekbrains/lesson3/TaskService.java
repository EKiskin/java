package com.geekbrains.lesson3;

public class TaskService {
    private Tasks tasks;

    public TaskService() {
        this.tasks = new TaskRepository();
    }

    public int addTask(Task task){
        int position = tasks.addTask(task);
        if (position==-2) {
           System.out.println("Ошибка: задача с таким id или name уже есть");
        }
        if (position==-1){
            System.out.println("Ошибка: нет свободного места");
        }
        return position;
    }

    public Task deleteTaskById(int id){
        return tasks.deleteTaskById(id);
    }

    public Task deleteTaskByName(String name){
        return tasks.deleteTaskByName(name);
    }

    public void printTasks(){
        tasks.printTasks();
    }
}
