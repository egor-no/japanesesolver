package com.japanese.model;

public class JapaneseModelImpl extends JapaneseModel {

    private Cell[][] cells;
    private int width;
    private int height;

    public JapaneseModelImpl(int width, int height) {
        this.height = height;
        this.width = width;
        cells = new Cell[width][height];
    }


    @Override
    public void setCellState(int i, int j, CellState state) {

    }

    @Override
    public CellState changeCellState(int i, int j) {
        return null;
    }

    @Override
    public CellState getCellState(int i, int j) {
        return null;
    }

    @Override
    public int countUnknown() {
        return 0;
    }
}
