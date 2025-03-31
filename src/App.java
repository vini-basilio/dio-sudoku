import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.dio.sudoku.Board;
import edu.dio.sudoku.BoardTemplate;
import edu.dio.sudoku.Square;

public class App {
    public static void main(String[] args) throws Exception {
        var board = new Board();

        Scanner scanner = new Scanner(System.in);

        var loopGame = true;
        while (loopGame) {
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
            var input = scanner.nextLine();
            switch (String.valueOf(input)) {
                case "1":

                    break;
                case "2":
                    System.out.println("\nInforme o número da linha: ");
                    var line = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nInforme o número da coluna: ");
                    var column = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nInforme o número para ser inserido: ");
                    var value = scanner.nextInt();
                    scanner.nextLine();

                    board.makeAPlay(line, column, value);
                    break;
                case "4":
                    System.out.println(board.boardState());
                    break;
                case "7":
                    loopGame = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
