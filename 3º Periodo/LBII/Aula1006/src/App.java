public class App {

    public static void main(String[] args) throws Exception {
        char[][] Tabuleiro = new char[8][8];
        java.util.Random Sorteio = new java.util.Random();


        for(int linha = 0; linha < Tabuleiro.length; linha++){
            for(int coluna = 0; coluna < Tabuleiro[linha].length; coluna++){
                Tabuleiro[linha][coluna] =(char) Sorteio.nextInt(100);
                System.out.printf("%2s ", Tabuleiro[linha][coluna]);
            }
            System.out.println();
        }
    }
}
