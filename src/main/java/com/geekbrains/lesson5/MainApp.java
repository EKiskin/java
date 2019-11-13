package com.geekbrains.lesson5;

import com.geekbrains.lesson4.Task;
import com.geekbrains.lesson4.TaskService;
import com.geekbrains.lesson5.fruits.Apple;
import com.geekbrains.lesson5.fruits.Box;

public class MainApp {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.addTask(new Task(1, "task 1"));
        taskService.addTask(new Task(2, "task 2"));
        taskService.addTask(new Task(3, "task 1"));
        taskService.printTasks();
        taskService.deleteTaskById(2);
        taskService.printTasks();

        Box box1 = new Box();
        Box box2 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box2.add(new Apple());
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        box1.emptyInto(box2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
    }
}
