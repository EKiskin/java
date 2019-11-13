package com.geekbrains.project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(task1(5, 16));
        task2(-10);
        System.out.println(task3(2016));
        int[] arr = {1,2,100,3};
        System.out.println(task4(arr));
        task5();
        int[][] t6 = task6(4);
        for (int[] a: t6) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(task7(arr));
    }
    public static boolean task1(int a, int b){
        int sum = a+b;
        return sum>=10 && sum<=20;
    }
    public static void task2(int a){
        System.out.println(a<0?"отрицательное":"положительное");
    }
    public static boolean task3(int year){
        return year%4 == 0 && (year%100!=0 || year%400==0);
    }
    public static int task4(int[] arr){
        int sum = 0;
        for (int a : arr) {
            sum+=a;
        }
        return sum;
    }
    public static void task5(){
        int[] arr = new int[8];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+3;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[][] task6(int l){
        int[][] result = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                result[i][j] = i==j?1:0;
            }
        }
        return result;
    }
    public static int task7(int[] arr){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (result<arr[i]){
                result = arr[i];
            }
        }
        return result;
    }
}
