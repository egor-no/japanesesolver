package com.japanese.model;

public class Cell {

    private CellState state;

    public Cell() {
        state = CellState.UNKNOWN;
    }

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

}
