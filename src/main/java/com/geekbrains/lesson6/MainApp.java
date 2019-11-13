package com.geekbrains.lesson6;

import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        String[] arr = {"слово 1", "слово 2", "слово 3", "слово 1", "слово 1",
                        "слово 2", "слово 3", "слово 4", "слово 5", "слово 6",
                        "слово 1", "слово 2", "слово 3", "слово 1", "слово 1",
                        "слово 2", "слово 3", "слово 4", "слово 5", "слово 6"};
        HashMap<String, Integer> map = new HashMap<>();
        Integer count;
        for (int i = 0; i < arr.length; i++) {
            count = map.getOrDefault(arr[i], 0);
            map.put(arr[i], ++count);
        }
        System.out.println(map);

        PhoneBook book = new PhoneBook();
        book.add("Иванов", "123456");
        book.add("Петров", "223456");
        book.add("Сидоров", "323456");
        book.add("Иванов", "423456");
        System.out.println(book.get("Иванов"));
        System.out.println(book);
    }
}
