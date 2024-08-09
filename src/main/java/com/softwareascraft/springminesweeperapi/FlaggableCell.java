package com.softwareascraft.springminesweeperapi;

public abstract class FlaggableCell<T> implements Cell {

    protected boolean showsFlag;

    public FlaggableCell(boolean showsFlag) {
        this.showsFlag = showsFlag;
    }

    @Override
    public abstract boolean containsMine();


    public boolean isFlagged() {
        return this.showsFlag;
    }

    public abstract T removeFlag();

    public abstract T addFlag();
}