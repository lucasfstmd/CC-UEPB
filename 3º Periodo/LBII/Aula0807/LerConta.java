// LerConta.java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LerConta{
    private Scanner entrada;

    public void abrirArquivo(){
        try{
            entrada = new Scanner(new File("clientes.abcd"));
        }
        catch(FileNotFoundException ex){
            System.err.println("Erro ao abrir o arquivo.");
            System.exit(1);
        }
    }
        public void lerRegistros(){
            ContaBancaria conta = new ContaBancaria();
            System.out.printf("%5s %10s %10s %5s\n", "Conta", "Nome", "Sobrenome", "Saldo");
            try{
                while(entrada.hasNext()){
                    conta.setnConta(entrada.nextInt());
                    conta.setNome(entrada.next());
                    conta.setSobrenome(entrada.next());
                    conta.deposito(entrada.nextDouble());

                    System.out.printf("%5d %10s %10s %5.2f\n", conta.getnConta(),
                        conta.getNome(), conta.getSobrenome(), conta.getSaldo());
                }
            }
            catch(NoSuchElementException ex){
                System.err.println("Arquivo corrompido.");
                System.exit(1);
            }
            catch(IllegalStateException ex){
                System.err.println("Erro na leitura.");
                System.exit(1);
            }
        } // Fim do método LerArquivo

        public void fecharArquivo(){
            if(entrada != null) entrada.close();
        }
        public static void main(String[] args) {
            LerConta obj = new LerConta();
            obj.abrirArquivo();
            obj.lerRegistros();
            obj.fecharArquivo();
        }
} // Fim da classe