
import java.util.Scanner;
import edu.dio.sudoku.Board;

public class Game {
    public Game() {

    }

    public void loop(int numbers[][],
            boolean fixed[][]) {
        var board = new Board(
                numbers,
                fixed);

        Scanner scanner = new Scanner(System.in);

        int line, column;
        String askLine, askColumn, askNumber;

        askLine = "\nInforme o número da linha: ";
        askColumn = "\nInforme o número da coluna: ";
        askNumber = "\nInforme o número para ser jogado: ";

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
                    System.out.println(askLine);
                    line = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(askColumn);
                    column = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(askNumber);
                    var value = scanner.nextInt();
                    scanner.nextLine();

                    board.makeAPlay(line, column, value);
                    break;
                case "3":
                    System.out.println(askLine);
                    line = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(askColumn);
                    column = scanner.nextInt();
                    scanner.nextLine();

                    board.clearASquare(line, column);
                    break;
                case "4":
                    System.out.println(board.printBoard());
                    break;
                case "5":
                    if (board.isFirstMove()) {
                        System.out.println("O tabuleiro está limpo. Faça uma jogada!");
                    } else if (!board.isCompleted()) {
                        System.out.println("O tabuleiro não está completado.");
                    } else if (board.isCompleted() & board.isCorrected()) {
                        System.out.println("Parabéns! Você completou o jogo!");
                    } else {
                        System.out.println("O tabuleiro está completo. Mas há números errados!");
                    }
                    break;
                case "6":
                    board.clearBoard();
                    break;
                case "7":

                    if (board.isCompleted() & board.isCorrected()) {
                        System.out.println("Parabéns! Você completou o jogo!");
                        loopGame = false;
                    } else {
                        System.out.println("Você ainda não completou o jogo :c");
                    }
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }
}
