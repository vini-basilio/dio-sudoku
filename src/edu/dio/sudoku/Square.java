package edu.dio.sudoku;

public class Square {
    private Integer currentValue;

    private final int expectedValue;
    private final boolean fixed;

    public int getExpectedValue() {
        return expectedValue;
    }

    public boolean isFixed() {
        return fixed;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        if (fixed)
            return;
        this.currentValue = currentValue;
    }

    public void clearSpace() {
        setCurrentValue(null);
    }

    public Square(Integer currentValue, int expectedValue, boolean fixed) {
        this.currentValue = currentValue;
        this.expectedValue = expectedValue;
        this.fixed = fixed;
        if (fixed)
            currentValue = expectedValue;
    }
}
