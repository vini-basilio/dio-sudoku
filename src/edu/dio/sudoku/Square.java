package edu.dio.sudoku;

public class Square {
    // Os espaços a mais são precisos por que %s estava virando apenas 1 caracter.
    // Fazendo com que a cada inserção o alinhamento fosse se perdendo
    private String currentValue;

    private final int expectedValue;
    private final boolean fixed;

    public int getExpectedValue() {
        return expectedValue;
    }

    public boolean isFixed() {
        return fixed;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        if (fixed)
            return;
        this.currentValue = " " + String.valueOf(currentValue);
    }

    public void clearSpace() {
        this.currentValue = " ";
    }

    public Square(int expectedValue, boolean fixed) {

        this.expectedValue = expectedValue;
        this.fixed = fixed;
        if (fixed) {
            currentValue = " " + String.valueOf(expectedValue);
        } else {
            currentValue = "  ";
        }
    }
}
