package com.japanese.model;

public abstract class NumbersModel {

    public abstract void addNumberToRow(int number, int row);

    public abstract void setNumbersByRow(int[] numbers, int row);

    public abstract void setNumbers(int[][] numbers);

    public abstract int[] getNumbersByRow(int row);

    public abstract int[][] getNumbers();


}
