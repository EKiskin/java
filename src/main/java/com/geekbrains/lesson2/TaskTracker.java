package com.geekbrains.lesson2;

public class TaskTracker {
    private Task[] tasks;

    public TaskTracker() {
        this.tasks = new Task[10];
    }

    public int addTask(Task task){
        int position = 0;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]!=null && (tasks[i].getId()==task.getId() || tasks[i].getName()==task.getName())) {
                System.out.println("Ошибка: задача с таким id или name уже есть");
                return 10;
            }
        }
        while (position<10 && tasks[position]!=null) position++;
        if (position==10){
            System.out.println("Ошибка: нет свободного места");
        } else{
            tasks[position] = task;
        }
        return position;
    }

    public Task deleteTaskById(int id){
        Task result = null;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]!=null && tasks[i].getId()==id) {
                result = tasks[i];
                tasks[i] = null;
                break;
            }
        }
        return result;
    }

    public Task deleteTaskByName(String name){
        Task result = null;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]!=null && tasks[i].getName()==name) {
                result = tasks[i];
                tasks[i] = null;
                break;
            }
        }
        return result;
    }

    public void printTasks(){
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]!=null){
                System.out.println(tasks[i]);
            }
        }
    }
}
