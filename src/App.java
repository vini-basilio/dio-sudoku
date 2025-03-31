import java.util.ArrayList;
import java.util.List;

import edu.dio.sudoku.Board;
import edu.dio.sudoku.BoardTemplate;
import edu.dio.sudoku.Square;

public class App {
    public static void main(String[] args) throws Exception {
        var board = new Board();

        List<String> printBoard = new ArrayList<>();
        for (var lines : board.getSquares()) {
            for (Square squares : lines) {

                printBoard.add(squares.getCurrentValue());
            }

        }
        ;

        System.out.println(
                String.format(BoardTemplate.BOARD_TEMPLATE, printBoard.toArray()));
    }
}
