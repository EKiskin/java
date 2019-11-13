package com.geekbrains.lesson4;

public class TaskService {
    private Tasks tasks;

    public TaskService() {
        this.tasks = new TaskRepository();
    }

    public int addTask(Task task) {
        int position = -1;
        try {
            position = tasks.addTask(task);
        }catch (TaskException e){
            System.out.println("Ошибка: "+e.getMessage());
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
