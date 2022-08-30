package Quest06;

import java.util.Scanner;

public class cadastroPessoas {

    public static Scanner scan = new Scanner(System.in);
    
    protected static Pessoas vetPessoas[] = new Pessoas[10];
    protected int qntPessoas;

    public static void cadastrarPessoas(int qntPessoas){
        String nome, cpf;
        for(int i = 0; i < qntPessoas; i++){
            System.out.printf("\nNome da pessoa %d: ", i);
            nome = scan.next();
            System.out.printf("\nCPF da pessoa %d: ", i);
            cpf = scan.next();
            vetPessoas[i] = new Pessoas(nome, cpf);
        }
    }

    public static String mostraPessoas(Pessoas pessoa){
        return System.out.printf("&s",  mostraDados(pessoa));
    }

    public static void main(String[] args) {
        
    }
}
