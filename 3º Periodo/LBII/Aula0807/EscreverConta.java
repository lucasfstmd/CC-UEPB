import java.io.FileNotFoundException;
import java.io.IOException;
// import java.lang.SecurityException;
import java.util.Scanner;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;

public class EscreverConta {
    private Formatter saida;
    
    public void abrirArquivo(){
        try{
            saida = new Formatter("clientes.abcd");
        }
        catch(FileNotFoundException ex){
            System.err.println("Erro ao criar o arquivo.");
            System.exit(1);
        }
        catch(SecurityException ex){
            System.err.println("Sem permissão de escrita.");
            System.exit(1);
        }
    } // Fim do método abrirArquivo

    public void escrever(){
        ContaBancaria conta = new ContaBancaria();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite ctrl z no Windows ou ctrl d Linux/Mac/BSD para finalizar entrada.");
        System.out.printf("Digite o número da conta (> 0), nome, sobrenome e saldo: ");
        while(entrada.hasNext()){
            try{
                conta.setnConta(entrada.nextInt());
                conta.setNome(entrada.next());
                conta.setSobrenome(entrada.next());
                conta.deposito(entrada.nextDouble());
                saida.format("%5d %10s %10s %5.2f\n", conta.getnConta(),
                    conta.getNome(), conta.getSobrenome(), conta.getSaldo());
                System.out.printf("\nEscreveu: %5d %10s %10s %5.2f", conta.getnConta(),
                    conta.getNome(), conta.getSobrenome(), conta.getSaldo());          
            }
            catch(FormatterClosedException ex){
                System.err.println("Erro na escrita.");
                return;
            }
            catch(NoSuchElementException ex){
                System.err.println("Entrada inválida. Tente novamente...");
                entrada.nextLine();
            }
            System.out.println("Digite ctrl z no Windows ou ctrl d Linux/Mac/BSD para finalizar entrada.");
            System.out.printf("Digite o número da conta (> 0), nome, sobrenome e saldo: ");
        } // Fim do while

    } // Fim do método escrever

    public void fechar(){
        if(saida != null)
            saida.close();
    }

    public static void main(String[] args) {
        EscreverConta objeto = new EscreverConta();
        objeto.abrirArquivo();
        objeto.escrever();
        objeto.fechar();
    }

} // Fim da classe