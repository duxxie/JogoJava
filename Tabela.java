public class Tabela {

    public void tornarTabela(String[][] quadro) {
        for (int x = 0; x < quadro.length; x++) {
            for (int y = 0; y < quadro[0].length; y++) {
                quadro[x][y] = "[.]";
            }
        }
    }

    public void posicionarJogador(String[][] quadro, int x, int y) {
        if (x >= 0 && x < quadro.length && y >= 0 && y < quadro[0].length) {
            quadro[x][y] = "[P]"; // Marca a posição do jogador no tabuleiro
        } else {
            print("Posição inválida para o jogador!");
        }
    }

    public void printTabela(String[][] quadro) {
        for (int x = 0; x < quadro.length; x++) {
            for (int y = 0; y < quadro[0].length; y++) {
                System.out.print(quadro[x][y] + " ");
            }
            System.out.println(); // Pula linha no final de cada linha do tabuleiro
        }
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
