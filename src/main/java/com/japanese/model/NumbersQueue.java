package com.japanese.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NumbersQueue {

    private List<Integer> numbers;
    private int pointer;

    public NumbersQueue() {
        numbers = new ArrayList<>();
        pointer = 0;
    }

    public void enqueue(Integer number) {
        numbers.add(number);
    }

    public void enqueueAll(ArrayList<Integer> numbers) {
        this.numbers.addAll(numbers);
    }

    public Integer dequeue() {
        Integer number;
        if (pointer < numbers.size())
            number = numbers.get(pointer++);
        else {
            number = null;
            resetPointer();
        }
        return number;
    }

    public List<Integer> dequeueAll() {
        resetPointer();
        return numbers;
    }

    public void clear() {
        numbers.clear();
        resetPointer();
    }

    public void resetPointer() {
        pointer = 0;
    }

}
