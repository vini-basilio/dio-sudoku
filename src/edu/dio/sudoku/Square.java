package edu.dio.sudoku;

public class Square {
    // Os espaços a mais são precisos por que %s estava virando apenas 1 caracter.
    // Fazendo com que a cada inserção o alinhamento fosse se perdendo
    private int currentValue;

    private final int expectedValue;
    private final boolean fixed;

    public int getExpectedValue() {
        return expectedValue;
    }

    public boolean isFixed() {
        return fixed;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public String getPrintbleValue() {
        if (currentValue == -1) {
            return "  ";
        }
        return " " + String.valueOf(currentValue);
    }

    public void setCurrentValue(Integer newValue) {
        if (fixed)
            return;
        if (this.currentValue == -1)
            return;
        this.currentValue = newValue;
    }

    public void clearSpace() {
        this.currentValue = -1;
    }

    public Square(int expectedValue, boolean fixed) {

        this.expectedValue = expectedValue;
        this.fixed = fixed;
        if (fixed) {
            currentValue = expectedValue;
        } else {
            currentValue = -1;
        }
    }
}
