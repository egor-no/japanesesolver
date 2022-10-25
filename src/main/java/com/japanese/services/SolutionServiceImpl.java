package com.japanese.services;

import com.japanese.model.*;

public class SolutionServiceImpl extends SolutionService {

    private JapaneseModel solution;
    private GameService game;

    public SolutionServiceImpl(JapaneseModel emptyModel) {
        solution = emptyModel;
    }

    @Override
    public void solveCrossword() {
        //solve
    }

    @Override
    public int countCorrectCells() {

    }

    @Override
    public int countIncorrectCells() {

    }

    @Override
    public boolean isCellCorrect(Cell cell, int i, int j) {

    }

    public CellState getCell(int i, int j) {
        return solution.getCellState(i, j);
    }

}
