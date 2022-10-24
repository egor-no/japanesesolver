package com.japanese.services;

import com.japanese.model.JapaneseModel;
import com.japanese.model.JapaneseModelImpl;
import com.japanese.model.NumbersModelImpl;

public abstract class SolutionService {

    public abstract JapaneseModel solveCrossword(NumbersModelImpl rows, NumbersModelImpl cols);
}
