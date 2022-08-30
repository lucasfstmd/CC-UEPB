

import java.util.Scanner;

public class teste2{
    public static void main(String[] args){

        int idade;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite a idade: ");
        idade = scan.nextInt();

        if(idade != 0 && idade > 0){
            if(idade < 16){
                System.out.printf("Não obigatorio");
            }
            else if(idade <= 16 || idade < 18 || idade > 65){
                System.out.printf("Facultativo");
            }
            else if(idade > 18 || idade < 65){
                System.out.printf("Obrigatorio");
            }
        }
        else{
            System.out.printf("idade invalida!");
        }
    }
}