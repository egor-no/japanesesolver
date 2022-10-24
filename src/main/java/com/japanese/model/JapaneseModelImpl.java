package com.japanese.model;

public class JapaneseModelImpl extends JapaneseModel {

    private Cell[][] cells;
    public NumbersModel rowNumbers;
    public NumbersModel colNumbers;
    private int width;
    private int height;

    public JapaneseModelImpl(int width, int height) {
        this.height = height;
        this.width = width;
        cells = new Cell[width][height];
        rowNumbers = new NumbersModelImpl(height);
        colNumbers = new NumbersModelImpl(width);
    }

    @Override
    public void setCellState(int i, int j, CellState state) {
        cells[i][j].setState(state);
    }

    @Override
    public CellState changeCellState(int i, int j) {
        CellState newState = cells[i][j].getState().next();
        cells[i][j].setState(newState);
        return newState;
    }

    @Override
    public CellState getCellState(int i, int j) {
        return cells[i][j].getState();
    }

    @Override
    public int countUnknown() {
        int unknownCells = 0;
        for (int i = 0; i < cells.length; i++)
            for (int j = 0; j < cells[i].length; j++)
                if (cells[i][j].getState().equals(CellState.UNKNOWN))
                    unknownCells++;
        return unknownCells;
    }
}
