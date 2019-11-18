package com.geekbrains.project;

import com.geekbrains.project.tasks.Task;
import com.geekbrains.project.tasks.TaskService;

import java.util.Comparator;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.addTask(new Task(1, "task 1", Task.Status.OPENED));
        taskService.addTask(new Task(2, "task 2", Task.Status.OPENED));
        taskService.addTask(new Task(3, "task 3", Task.Status.OPENED));
        taskService.addTask(new Task(4, "task 4", Task.Status.IN_WORK));
        taskService.addTask(new Task(5, "task 5", Task.Status.IN_WORK));
        taskService.addTask(new Task(6, "task 6", Task.Status.OPENED));
        taskService.addTask(new Task(7, "task 7", Task.Status.OPENED));
        taskService.addTask(new Task(8, "task 8", Task.Status.CLOSED));
        taskService.addTask(new Task(9, "task 9", Task.Status.CLOSED));

        System.out.println("filter status=inWork");;
        taskService.stream().filter(t -> t.getStatus()==Task.Status.IN_WORK).forEach(System.out::println);

        System.out.println("search id=18");
        if (taskService.stream().anyMatch(t -> t.getId()==18))
            System.out.println("found");
        else
            System.out.println("not found");

        System.out.println("order by status");
        taskService.stream().sorted((a,b)->a.getStatus().getOrder()-b.getStatus().getOrder()).forEach(System.out::println);

        System.out.println("count status=closed");
        System.out.println(taskService.stream().filter(t -> t.getStatus()==Task.Status.CLOSED).count());
    }
}
