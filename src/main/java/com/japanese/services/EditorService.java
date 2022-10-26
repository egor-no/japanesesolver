package com.japanese.services;

import com.japanese.model.CellState;

public abstract class EditorService {

    public abstract CellState changeCell(int i, int j);

    public abstract CellState getCellState(int i, int j);


}
