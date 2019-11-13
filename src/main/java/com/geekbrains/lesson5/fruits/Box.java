package com.geekbrains.lesson5.fruits;

import java.util.ArrayList;
import java.util.ListIterator;

public class Box {
    private ArrayList<Fruit> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(Fruit item) {
        if (!fruits.isEmpty() && fruits.get(0).getClass()!=item.getClass()){
            throw new WrongFruitException();
        }
        fruits.add(item);
    }

    public float getWeight(){
        float weight = 0;
        for (Fruit fruit: fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }
    public boolean compare(Box box){
        return Math.abs(getWeight()-box.getWeight())<0.00001f;
    }

    public void emptyInto(Box box){
        ListIterator<Fruit> iterator = fruits.listIterator();
        while (iterator.hasNext()){
            box.add(iterator.next());
            iterator.remove();
        }
    }
}
