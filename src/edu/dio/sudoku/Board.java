package edu.dio.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Square>> squares;
    private boolean isFirstMove;
    private boolean isCorrected;

    public boolean isFirstMove() {
        return isFirstMove;
    }

    public boolean isCompleted() {
        for (var lines : squares) {
            for (Square square : lines) {

                if (square.getPrintbleValue().equalsIgnoreCase("  ")) {
                    return false;

                }
                ;
            }
        }
        return true;
    }

    public boolean isCorrected() {
        return isCorrected;
    }

    public Board(
            int numbers[][],
            boolean fixed[][]) {
        isFirstMove = true;
        squares = new ArrayList<>();

        for (int line = 0; line < 9; line++) {

            List<Square> lineBoard = new ArrayList<>();

            for (int column = 0; column < 9; column++) {

                var number = numbers[line][column];
                var isFixed = fixed[line][column];
                var square = new Square(number, isFixed);
                lineBoard.add(square);

            }

            squares.add(lineBoard);
        }
    }

    public String printBoard() {
        List<String> printBoard = new ArrayList<>();
        for (var lines : squares) {
            for (Square square : lines) {
                printBoard.add(square.getPrintbleValue());
            }

        }
        var boarState = String.format(BoardTemplate.BOARD_TEMPLATE, printBoard.toArray());
        return boarState;
    }

    public void makeAPlay(int line, int column, int value) {
        isFirstMove = false;

        if (line < 0 || line > 8)
            return;
        if (column < 0 || column > 8)
            return;
        if (value < 1 || value > 9)
            return;
        var square = squares.get(line).get(column);
        square.setCurrentValue(value);

        if (square.isCorrected())
            this.isCorrected = true;

    }

    public void clearASquare(int line, int column) {
        if (line < 0 || line > 8)
            return;
        if (column < 0 || column > 8)
            return;
        var square = squares.get(line).get(column);
        square.clearSpace();
    }

    public void clearBoard() {
        isFirstMove = true;
        for (List<Square> lines : squares) {
            for (Square square : lines) {
                square.clearSpace();
            }
        }
    }
}
