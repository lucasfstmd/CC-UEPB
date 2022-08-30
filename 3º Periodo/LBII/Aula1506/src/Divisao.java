import java.util.Scanner;

public class Divisao {
    
    public static int quociente(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        int a, b, resultado;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        a = scan.nextInt();

        System.out.println("Digite o denominador: ");
        b = scan.nextInt();

        resultado = quociente(a, b);

        System.out.printf("Resiltado: %d%n", resultado);
    }

}
