package com.japanese.services;

import com.japanese.model.CellState;
import com.japanese.model.JapaneseModel;
import com.japanese.model.JapaneseModelImpl;
import com.japanese.model.NumbersModel;

public class GameServiceImpl extends GameService {

    private JapaneseModel model;
    private JapaneseModel solution;

    public GameServiceImpl(JapaneseModel model, JapaneseModel solution) {
        this.model = model;
    }

    @Override
    public CellState changeCell(int i, int j) {
        return model.changeCellState(i, j);
    }

    @Override
    public CellState getCellState(int i, int j) {
        return model.getCellState(i, j);
    }

    @Override
    public int countUnfinishedCells() {
        return model.countUnknown();
    }

}
