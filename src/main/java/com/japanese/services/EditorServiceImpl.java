package com.japanese.services;

import com.japanese.model.CellState;
import com.japanese.model.JapaneseModel;

public class EditorServiceImpl extends EditorService {

    private JapaneseModel model;

    public EditorServiceImpl(JapaneseModel model) {
        this.model = model;
    }

    @Override
    public CellState changeCell(int i, int j) {
        return model.changeCellState(i, j);
    }

    @Override
    public CellState getCell(int i, int j) {
        return model.getCellState(i, j);
    }
}
