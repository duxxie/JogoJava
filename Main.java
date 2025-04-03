import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tabela tabela = new Tabela();
        Player player1 = new Player(1, 16, 1, 1); // Jogador começa na posição (2,2)

        print("------ Joguinho 3000 ------");
        String[][] quadro = new String[3][3];

        while (true) {
            tabela.tornarTabela(quadro);
            tabela.posicionarJogador(quadro, player1.getX(), player1.getY()); // Posiciona o jogador
            tabela.printTabela(quadro);

            print("Use W (cima), S (baixo), A (esquerda), D (direita) para mover:");
            String escolha = scanner.next().toLowerCase();

            player1.mover(escolha, quadro.length, quadro[0].length); // Passa os limites do tabuleiro
        }
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
