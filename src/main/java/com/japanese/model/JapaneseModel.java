package com.japanese.model;

public abstract class JapaneseModel {

    public abstract void setCellState(int i, int j, CellState state);

    public abstract CellState changeCellState(int i, int j);

    public abstract CellState getCellState(int i, int j);

    public abstract int countUnknown();

}
