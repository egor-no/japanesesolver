package com.japanese.services;

import com.japanese.model.CellState;
import com.japanese.model.JapaneseModel;
import com.japanese.model.JapaneseModelImpl;
import com.japanese.model.NumbersModel;

public class GameServiceImpl extends GameService {

    private JapaneseModel model;

    public GameServiceImpl() {
    }

    @Override
    public CellState changeCell(int i, int j) {
        return null;
    }

    @Override
    public CellState getCell(int i, int j) {
        return null;
    }

    @Override
    public boolean isCellCorrect(int i, int j) {
        return false;
    }
}
