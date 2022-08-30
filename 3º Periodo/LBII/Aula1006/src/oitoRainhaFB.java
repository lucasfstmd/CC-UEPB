public class oitoRainhaFB{
    private static java.security.SecureRandom sorteio = new java.security.SecureRandom();
    private static final int tam = 8;
    private static char[][] tabuleiro;
    private static int rainhas;

    public static boolean movValido(int linha, int coluna){
        return linha >=0 && linha < tam && coluna >= 0 && coluna < tam;
    }
    public static boolean casaDiponivel(){
        for(int linha = 0; linha < tabuleiro.length; linha++){
            for(int coluna = 0; coluna < tabuleiro[linha].length; coluna++){
                if(tabuleiro[linha][coluna] == '\0'){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean veriRainha(int vLinha, int vColuna){
        int linha = vLinha;
        int coluna = vColuna;
        for(int posicao = 0; posicao < tam; posicao++){
            if(tabuleiro[linha][posicao] == 'R' || tabuleiro[posicao][coluna] == 'R'){
                return false;
            }
        }
        //Diag superior esquerda
        for(int casa = 0; casa < tam && movValido(--linha, --coluna); casa++){
            if(tabuleiro[linha][coluna] == 'R'){
                return false;
            }
        }
        linha = vLinha;
        coluna = vColuna;

        //Diag superior direita
        for(int casa = 0; casa < tam && movValido(--linha, ++coluna); casa++){
            if(tabuleiro[linha][coluna] == 'R'){
                return false;
            }
        }
        linha = vLinha;
        coluna = vColuna;

        //Diag inferior esquerdo
        for(int casa = 0; casa < tam && movValido(++linha, --coluna); casa++){
            if(tabuleiro[linha][coluna] == 'R'){
                return false;
            }
        }
        linha = vLinha;
        coluna = vColuna;

        //Diag inferior direito
        for(int casa = 0; casa < tam && movValido(++linha, ++coluna); casa++){
            if(tabuleiro[linha][coluna] == 'R'){
                return false;
            }
        }
        linha = vLinha;
        coluna = vColuna;

        return true;
    }
    
    public static void desenhaTab(int linha, int coluna){
        for(int i = 0; i < tam; i++){
            if(tabuleiro[linha][i] == '\0'){
                tabuleiro[linha][i] = '.';
            }
            if(tabuleiro[i][coluna] == '\0'){
                tabuleiro[i][coluna] = '.';
            }
        }
        
    }
}