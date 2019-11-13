package com.geekbrains.lesson5.tasks;

public class TaskService {
    private Tasks tasks;

    public TaskService() {
        this.tasks = new TaskRepository();
    }

    public boolean addTask(Task task) {
        try {
            return tasks.addTask(task);
        }catch (TaskException e){
            System.out.println("Ошибка: "+e.getMessage());
            return false;
        }
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
