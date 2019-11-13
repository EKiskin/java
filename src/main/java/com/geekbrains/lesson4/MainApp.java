package com.geekbrains.lesson4;

public class MainApp {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.addTask(new Task(1, "task 1"));
        taskService.addTask(new Task(2, "task 2"));
        taskService.addTask(new Task(3, "task 1"));
        taskService.printTasks();
        taskService.deleteTaskById(2);
        taskService.printTasks();
        String[][] arr = {{"1", "2", "3", "0"},{"1", "2", "3", "0"},{"0", "0", "0", "0"},{"0", "0", "0", "0"}};
        try{
           System.out.println(String.format("Сумма массива %d", SumArray(arr)));
        } catch (MyArraySizeException e){
            System.out.println("Массив должен быть 4х4");
        } catch (MyArrayDataException e){
            System.out.println(String.format("Ошибка преобразования элемента [%d, %d] в число", e.getI(), e.getJ()));
        }
    }
    public static int SumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int result = 0;
        if (arr.length!=4)
            throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length!=4)
                throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }
}
