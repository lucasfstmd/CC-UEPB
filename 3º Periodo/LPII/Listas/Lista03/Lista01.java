/* QUESTÃO 3 */

/*
import java.util.Scanner;

public class Lista01{

    public static void main(String args[]){

        String nome, disciplina;
        float nota1, nota2, nota3, nota4, notas, media;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o nome: ");
        nome = scan.nextLine();

        System.out.printf("Digite a Disciplina: ");
        disciplina = scan.nextLine();

        System.out.println("Digite a nota 1: ");
        nota1 = scan.nextFloat();

        System.out.println("Digite a nota 2: ");
        nota2 = scan.nextFloat();

        System.out.println("Digite a nota 3: ");
        nota3 = scan.nextFloat();

        System.out.println("Digite a nota 4: ");
        nota4 = scan.nextFloat();
        
        notas = nota1 + nota2 + nota3 + nota4;

        media = notas / 4;

        System.out.printf("O/A aluno "+ nome +", teve media "+ media +", na disciplina de "+ disciplina);

    }

}
*/


/* QUESTÃO 4 */

/*
import java.util.Scanner;

public class Lista01{

    public static void main(String args[]){

        double ladoA, ladoB, ladoC;

        Scanner scan = new Scanner(System.in);

        System.out.printf("\nDigite o lado A: ");
        ladoA = scan.nextDouble();

        System.out.printf("Digite o lado B: ");
        ladoB = scan.nextDouble();

        System.out.printf("Digite o lado C: ");
        ladoC = scan.nextDouble();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){

            System.out.println("É triangulo");
        
        }
        else{
            System.out.println("Não é triangulo");
        }
    }
}
*/

/* QUESTÃO 05 */

/*
import java.util.Scanner;

public class Lista01{
    public static void main(String[] args){

        double deposito, rendimento, juros, total;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o valor do deposito: ");
        deposito = scan.nextDouble();

        System.out.printf("Digite a taxa de juros: ");
        juros = scan.nextDouble();

        rendimento = deposito * (juros/100);

        total = deposito + rendimento;

        System.out.printf("O valor total foi: " +total);
    }
}
*/

/* QUESTAO 06 */

/*
import java.util.Scanner;

public class Lista01{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.printf("Digite a idade: ");
        idade = scan.nextInt();

        if(idade < 16){
            System.out.printf("Nao eleitor.");
        }
        else if(idade > 18 && idade < 65){
            System.out.print("Eleitor obrigatorio.");
        }
        else if(16 < idade || idade < 18 || idade > 65){
            System.out.printf("Eletior facultativo.");
        }
        
    }
}
*/

/* QUESTAO 07 */
/*

import java.util.Scanner;

public class Lista01{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pratoITA = 750, pratoJAPA = 342, pratoSALV = 545;
        int cha = 30, sucoLara = 80, refri = 90;
        int escolha_prato, escolha_bebi, total_calorias = 0;

        System.out.printf("Qual prato tipico:\n[1] para Italiano.\n[2] para Japones.\n[3] para Salvadoriano.\n");
        escolha_prato = scan.nextInt();

        if (escolha_prato == 1){
            total_calorias += pratoITA;   
        }
        else if(escolha_prato == 2){
            total_calorias += pratoJAPA;
        }
        else if(escolha_prato == 3){
            total_calorias += pratoSALV;
        }
        else{
            System.out.printf("Opcao nao disponivel.");
        }


        System.out.printf("Qual bebida:\n[1] para Cha.\n[2] para Suco de Laranja.\n[3] para Refrigerante.\n");
        escolha_bebi = scan.nextInt();

        if (escolha_bebi == 1){
            total_calorias += cha;
        }
        else if(escolha_bebi == 2){
            total_calorias += sucoLara;
        }
        else if(escolha_bebi == 3){
            total_calorias += refri;
        }
        else{
            System.out.printf("Opcao nao disponivel.");
        }

        System.out.println("Total de calorias: " + total_calorias);
        
    }
}
*/