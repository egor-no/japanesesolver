package com.japanese.model;

import java.util.List;

public abstract class NumbersModel {

    public abstract void addNumberToRow(int number, int row);

    public abstract void setNumbersByRow(List<Integer> numbers, int row);

    public abstract List<Integer> getNumbersByRow(int row);

    public abstract int getSize();

}
