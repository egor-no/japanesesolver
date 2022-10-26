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
        int width = solution.getWidth();
        int height = solution.getHeight();
        int correct = 0;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                if (isCellCorrect(i, j))
                    correct++;
        return correct;
    }

    @Override
    public int countIncorrectCells() {
        int width = solution.getWidth();
        int height = solution.getHeight();
        int incorrect = 0;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                if (isCellIncorrect(i, j))
                    incorrect++;
        return incorrect;
    }


    @Override
    public boolean isCellCorrect(int i, int j) {
        return  !game.getCellState(i,j).equals(CellState.UNKNOWN)
                && game.getCellState(i, j).equals(solution.getCellState(i, j));
    }

    @Override
    public boolean isCellIncorrect(int i, int j) {
        return  !game.getCellState(i,j).equals(CellState.UNKNOWN) &&
                game.getCellState(i, j).equals(solution.getCellState(i, j));
    }

    public CellState getCell(int i, int j) {
        return solution.getCellState(i, j);
    }

}
