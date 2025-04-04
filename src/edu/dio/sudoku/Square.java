package edu.dio.sudoku;

public class Square {
    // Os espaços a mais são precisos por que %s estava virando apenas 1 caracter.
    // Fazendo com que a cada inserção o alinhamento fosse se perdendo
    private int currentValue;

    private final int expectedValue;
    private final boolean fixed;
    private boolean state;

    public Square(int expectedValue, boolean fixed) {

        this.expectedValue = expectedValue;
        this.fixed = fixed;
        if (fixed) {
            currentValue = expectedValue;
            this.state = true;
        } else {
            currentValue = -1;
        }
    }

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
        if (this.currentValue != -1)
            return;
        this.currentValue = newValue;
        this.state = newValue == this.expectedValue;

    }

    public void clearSpace() {
        if (fixed)
            return;
        this.currentValue = -1;
    }

    public boolean isCorrected() {
        return this.state;
    }
}
