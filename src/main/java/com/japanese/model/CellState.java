package com.japanese.model;

public enum CellState {
    UNKNOWN,
    EMPTY,
    FILLED;

    private static CellState[] vals = values();

    public CellState next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
