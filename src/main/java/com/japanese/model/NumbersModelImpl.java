package com.japanese.model;

import java.util.ArrayList;
import java.util.List;

public class NumbersModelImpl extends NumbersModel {

    private NumbersQueue[] numberLines;

    public NumbersModelImpl(int size) {
        numberLines = new NumbersQueue[size];
        for (int i = 0; i < size; i++)
            numberLines[i] = new NumbersQueue();
    }

    @Override
    public void addNumberToRow(int number, int row) {
        numberLines[row].enqueue(number);
    }

    @Override
    public void setNumbersByRow(List<Integer> numbers, int row) {
        numberLines[row].clear();
    }

    @Override
    public List<Integer> getNumbersByRow(int row) {
        return numberLines[row].dequeueAll();
    }

    @Override
    public int getSize() {
        return numberLines.length;
    }

}
