package Lista06;

import java.util.Scanner;

public class quest03 {
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int erro;
        try {
            System.out.println("Deseja que ocorra um erro? ");
            System.out.println("[1] Sim\n[2] Não");
            erro = scan.nextInt();
      
            if (erro == 1) {
                throw new Exception();
            }

        } catch(Exception e) {
        System.out.println("Erro tratado.");
        } 
        finally {
        System.out.println("Final certo.");
        scan.close();
        
        }
    
    }

}