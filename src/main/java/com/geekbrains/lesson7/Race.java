package com.geekbrains.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Race {
    private final Object mon = new Object();
    private ArrayList<Stage> stages;
    private int carsCount;
    private boolean started = false;
    private boolean first = true;

    private CyclicBarrier startBarrier;

    public ArrayList<Stage> getStages() { return stages; }
    public Race(int carsCount, Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.carsCount = carsCount;
        startBarrier = new CyclicBarrier(carsCount);
    }
    public int getCarsCount() {
        return carsCount;
    }

    public void start(Car car){
        try {
            startBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        synchronized (mon){
            if (!started){
                started = true;
                first = true;
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            }
        }
        System.out.println(car.getName() + " стартовал");
    }
    public void finish(Car car){
        if (started) {
            synchronized (mon) {
                if (first) {
                    System.out.println(car.getName() + " WIN");
                    first = false;
                }
            }
            try {
                startBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            synchronized (mon) {
                if (started) {
                    started = false;
                    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
                }
            }
        }
    }
}
