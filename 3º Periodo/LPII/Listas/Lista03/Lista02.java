
/* QUESTAO 01 */

/*
import java.util.Scanner;

public class Lista02{

    public static void main(String[] args){

        Scanner  scan = new Scanner(System.in);

        double numero, conta;

        System.out.printf("Digite o numero: ");
        numero = scan.nextDouble();

        for(int i = 1; i <= 10; i++){
            conta = numero * i;
            System.out.println(numero + " x " + i + " = " + conta);
        }
    }
}
*/

/* QESTAO 02 */

/*
import java.util.Scanner;

public class Lista02{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int filhos = 0, habitantes = 0, parar = 0;
        double salario = 0, maiorSalario = 0, mediaSalario = 0, mediaFilho = 0, totalsalario = 0, totalfilhos = 0, totalhabitantes = 0;

        while(parar != 1){
            
            System.out.printf("\nDigite o salario: ");
            salario = scan.nextDouble();
            if (salario == -1){
                parar = parar +1;
            }
            System.out.printf("Digite a quantidade de filhos: ");
            filhos = scan.nextInt();
            System.out.printf("Digite a quantidade total de pessoas: ");
            habitantes = scan.nextInt();

            if(salario > maiorSalario){
                maiorSalario = salario;
            }

            totalsalario += salario;
            totalfilhos += filhos; 
            totalhabitantes += habitantes;
        }

        mediaSalario = totalsalario / totalhabitantes;
        mediaFilho = totalfilhos / totalhabitantes;

        System.out.printf("A media de salario da populacao e: "+ mediaSalario +"\nA media de Filhos e: "+ mediaFilho +"\nO maior salario é: "+ maiorSalario);

    }
}
*/

/*
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Lista02{

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        char nomes[] = new char[4];
        int qntA = 0;

        for(int i = 1; i <= 3; i++){
            System.out.printf("\nDigite o nome "+ i +": ");
            nomes[i] = scan.nextLine();
        }

        while(nomes[qntA] == 'a' || nomes[qntA] == 'A'){
            ++qntA;
        }

    }

}*/
