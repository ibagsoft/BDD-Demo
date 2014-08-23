package com.codekata.cucumber;

/**
 * Created by ibagsoft
 */
public class Course {
    private int amount;

    public Course(int price) {
        this.amount = price;
    }

    public void times(int multiple) {
        this.amount*=multiple;
    }

    public int getAmount() {
        return amount;
    }
}
