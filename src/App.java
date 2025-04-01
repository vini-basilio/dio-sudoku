public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Por favor, forneça os números e os booleanos como argumentos.");
            return;
        }

        int[][] numbers = new int[9][9];
        boolean[][] fixed = new boolean[9][9];

        if (args.length != 81) {
            System.out.println("É necessário fornecer exatamente 81 argumentos.");
            return;
        }

        for (int i = 0; i < 81; i++) {
            String[] parts = args[i].split(",");
            numbers[i / 9][i % 9] = Integer.parseInt(parts[0]);
            fixed[i / 9][i % 9] = parts[1].equals("1");
        }

        var game = new Game();
        game.loop(numbers, fixed);
    }
}
