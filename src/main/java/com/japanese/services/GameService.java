package com.japanese.services;

import com.japanese.model.CellState;

public abstract class GameService {

    public abstract CellState changeCell(int i, int j);

    public abstract CellState getCell(int i, int j);

    public abstract boolean isCellCorrect(int i, int j);

}
