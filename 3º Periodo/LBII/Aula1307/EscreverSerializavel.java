import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EscreverSerializavel {
    private ObjectOutput exit;
    public static Scanner scan = new Scanner(System.in);
    public void open(){
        try{
            exit = new ObjectOutput(
                new FileOutputStream("Client.ser"));
        }catch(IOException ex){
            System.err.println("Erro to writhe in arquive.");
            System.exit(1);
        }
    }
    public void writhe(){
        try{
            ContaBancariaSerializavel register;
            System.out.println("Entre com os dados e finalize com ctrl d ou ctrl z...");
            System.out.printf("Entre com o nome, sobrenome e saldo: \n");
            while(scan.hasNext()){
                int nConta = hashCode();
                String firstName = scan.next();
                String lastName = scan.next();
                double saudo = scan.nextDouble();
                register = new ContaBancariaSerializavel(nConta, firstName, lastName, saudo);
                exit.writeObject(register);
            }
        }catch(IOException ex){
            System.err.println("Erro na escrita do arquivo.");
        }catch(NoSuchElementException ex){
            System.err.println("Entrada invalida.");
            scan.nextLine();
        }
        System.out.println("Entre com os dados e finalize com ctrl d ou ctrl z...");
        System.out.printf("Entre com o numero da conta, nome, sobrenome e saldo: \n");
    }
    public void close(){
        try{
            if(exit != null){
                exit.close();
            }
        }catch(IOException ex){
            System.err.println();
        }
    }

    public static void main(String[] args) {
        EscreverSerializavel teste = new EscreverSerializavel();
        teste.open();
        teste.writhe();
        teste.close();
    }
}
