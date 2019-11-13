package com.geekbrains.lesson4;

public class TaskRepository implements Tasks {
    private Task[] tasks;

    public TaskRepository() {
        this.tasks = new Task[10];
    }

    @Override
    public int addTask(Task task) throws TaskException {
        int position = -1;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]!=null){
                if (tasks[i].getId()==task.getId() || tasks[i].getName()==task.getName()){
                    throw new TaskException("Задача с таким id или name уже есть");
                }
            } else if (position==-1){
                position = i;
            }
        }
        if (position==-1){
            throw new TaskException("Нет свободного места");
        } else{
            tasks[position] = task;
        }
        return position;
    }

    @Override
    public Task deleteTaskById(int id) {
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

    @Override
    public Task deleteTaskByName(String name) {
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

    @Override
    public void printTasks() {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]!=null){
                System.out.println(tasks[i]);
            }
        }
    }
}
