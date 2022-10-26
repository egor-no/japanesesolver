package com.japanese.model;

public abstract class JapaneseModel {

    public abstract void setCellState(int i, int j, CellState state);

    public abstract CellState changeCellState(int i, int j);

    public abstract CellState getCellState(int i, int j);

    public abstract int countUnknown();

    public abstract void setRowNumbers(NumbersModel rowNumbers);

    public abstract void setColNumbers(NumbersModel colNumbers);

    public abstract int getWidth();

    public abstract void setWidth(int width);

    public abstract int getHeight();

    public abstract void setHeight(int height);

}
