import java.util.Scanner;

public class teste{

    public static void main(String[] args){

        int escolha;
        double x[] = new double[2];
        double y[] = new double[2];
        double opercao;

        System.out.printf("[1] PARA SOMAR.\n[2] PARA SUBTRAIR.\n[3] PARA MULTIPLICAR.\n[4] PARA DIVIDIR.");
        System.out.print("\n");

        Scanner scan = new Scanner(System.in);
        escolha = scan.nextInt();

        System.out.print("Digite x: ");
        x[1] = scan.nextDouble();

        System.out.print("Digite y: ");
        y[1] = scan.nextDouble();

        if (escolha == 1){
            opercao = x[1] + y[1];
            System.out.print("Resultado: " + opercao);
            if (opercao > 0){
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(int i = 1; i <= opercao; i++){
                System.out.print(" " + i);
                }
            }         
            else{
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(double i = opercao; i >= opercao; i++){
                System.out.print(" " + i);
                }
            }
        }
        else if (escolha == 2){
            opercao = x[1] - y[1];
            System.out.print("Resultado: " + opercao);
            
            if (opercao > 0){
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(int i = 1; i <= opercao; i++){
                System.out.print(" " + i);
                }
            }         
            else{
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(double i = opercao; i >= opercao; i++){
                System.out.print(" " + i);
                }        
            }
        }
        else if (escolha == 3){
            opercao = x[1] * y[1];
            System.out.print("Resultado: " + opercao);
            
            if (opercao > 0){
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(int i = 1; i <= opercao; i++){
                System.out.print(" " + i);
                }
            }         
            else{
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(double i = opercao; i >= opercao; i++){
                System.out.print(" " + i);
                }         
            }
        }
        else if (escolha == 4){
            opercao = x[1] / y[1];
            System.out.print("Resultado: " + opercao);
            
            if (opercao > 0){
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(int i = 1; i >= opercao; i--){
                System.out.print(" " + i);
                }
            }         
            else{
                System.out.print("\nA contagem de 1 até " + opercao + " é:");
            
                for(double i = opercao; i >= opercao; i++){
                System.out.print(" " + i);
                }         
            }
        }   
    }
}