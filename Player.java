public class Player {

    private int jogador;
    private int pecas;
    private int x;
    private int y;

    Player(int jogador, int pecas, int x, int y) {
        this.jogador = jogador;
        this.pecas = pecas;
        this.x = x;
        this.y = y;
    }

    public int getJogador() {
        return jogador;
    }

    public int getPecas() {
        return pecas;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void mover(String direcao, int limiteX, int limiteY) {
        switch (direcao) {
            case "w": // Cima
                if (x > 0) x--;
                break;
            case "s": // Baixo
                if (x < limiteX - 1) x++;
                break;
            case "a": // Esquerda
                if (y > 0) y--;
                break;
            case "d": // Direita
                if (y < limiteY - 1) y++;
                break;
            default:
                System.out.println("Comando inválido! Use W, A, S ou D.");
        }
    }
}
