import java.util.Scanner;
import java.util.InputMismatchException;

public class Divisao2 {
    
    public static int quociente(int a, int b) throws ArithmeticException, InputMismatchException{
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean aux = true;
    
        do{
            try{
            
            int a, b, resultado;

            System.out.println("Digite o numerador: ");
            a = scan.nextInt();

            System.out.println("Digite o denominador: ");
            b = scan.nextInt();

            resultado = quociente(a, b);

            System.out.printf("Resiltado: %d%n", resultado);
            
           /*  } catch(ArithmeticException ex){
                //ex.printStackTrace();
                System.out.println("Denominador não pode ser 0.");
                System.err.printf("Exceção encontrada: %s%n", ex.getMessage());
            } catch(InputMismatchException ex){
                System.out.println("Digite apenas inteiros.");
                System.err.printf("Exceção encontrada: %s%n", ex.getMessage());
            } catch(Exception ex){
                System.out.println("Defeito no codigo.");
                System.err.printf("Exceção encontrada: %s%n", ex.getMessage());*/
            } catch(Throwable ex){
                System.out.println("Nunca chegara aqui.");
            }
            
            aux = false;
        }while(aux);
    }

}
