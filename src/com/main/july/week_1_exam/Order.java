package com.main.july.week_1_exam;

public class Order {
    private long id;

    private double type;

    private short top;

    private String symbol;

    private  char symbolFirst;

    private boolean isOpen;

    private  int idx;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    public short getTop() {
        return top;
    }

    public void setTop(short top) {
        this.top = top;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public char getSymbolFirst() {
        return symbolFirst;
    }

    public void setSymbolFirst(char symbolFirst) {
        this.symbolFirst = symbolFirst;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
}
