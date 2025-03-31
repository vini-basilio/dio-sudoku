import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.dio.sudoku.Board;
import edu.dio.sudoku.BoardTemplate;
import edu.dio.sudoku.Square;

public class App {
    public static void main(String[] args) throws Exception {
        var board = new Board();

        ;

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                        1. Iniciar um novo o jogo.
                        2. Colocar um novo número.
                        3. Remover um número.
                        4. Verificar jogo.
                        5. Verificar status do jogo.
                        6. Limpar.
                        7. Finalizar o jogo
                        """);

        var loopGame = true;
        while (loopGame) {

            var input = scanner.nextLine();
            switch (String.valueOf(input)) {
                case "1":

                    break;
                case "4":
                    List<String> printBoard = new ArrayList<>();
                    for (var lines : board.getSquares()) {
                        for (Square squares : lines) {

                            printBoard.add(squares.getCurrentValue());
                        }

                    }
                    var boarState = String.format(BoardTemplate.BOARD_TEMPLATE, printBoard.toArray());
                    System.out.println(boarState);
                    break;
                case "7":
                    loopGame = false;
                    break;
                default:
                    break;
            }
        }
    }
}
