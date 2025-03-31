package edu.dio.sudoku;

import edu.dio.sudoku.utils.InitState;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Square>> squares;

    public Board() {

        squares = new ArrayList<>();

        for (int line = 0; line < 9; line++) {
            List<Square> lineBoard = new ArrayList<>();
            for (int column = 0; column < 9; column++) {

                var number = InitState.numbers[line][column];
                var isFixed = InitState.fixed[line][column];

                var square = new Square(number, isFixed);

                lineBoard.add(square);
            }

            squares.add(lineBoard);
        }
    }

    public List<List<Square>> getSquares() {
        return squares;
    }

    public void makeAPlay(int line, int column, int value) {
        var square = squares.get(line).get(column);
        square.setCurrentValue(value);
    }
}
