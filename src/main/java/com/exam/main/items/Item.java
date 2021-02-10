package com.exam.main.items;

public abstract class Item {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addItem() {
        count += 1;
    }
}
