package com.japanese.services;

import com.japanese.model.Cell;
import com.japanese.model.JapaneseModel;

public abstract class SolutionService {

    public abstract void solveCrossword();

    public abstract int countCorrectCells();

    public abstract int countIncorrectCells();

    public abstract boolean isCellCorrect(int i, int j);

    public abstract boolean isCellIncorrect(int i, int j);


}
