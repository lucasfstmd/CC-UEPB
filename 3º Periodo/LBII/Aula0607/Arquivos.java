
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos { 

    public static void main(String[] args) throws IOException{
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o diretorio do arquivo: ");
        Path endereco = Path.get(in.nextLine());   
        
        if(Files.exists(endereco)){
            System.out.println("Arquivo Encontrado.");
            System.out.printf("\n%s ", Files.isDirectory(endereco) ? "é um diretario.\n" : "não é um diretorio.\n");
            System.out.printf("%s caminho ", endereco.isAbsolute() ? "É absoluto.\n" : "Não é absoluto.\n");
            System.out.printf("Caminho absoluto: %s.\n", endereco.toAbsolutePath());
            System.out.printf("Ultima modificação: %s", Files.getLastModifiedTime(endereco));
            System.out.printf("Tamanho do arquivo: %s", Files.size(endereco));
        } else{
            System.out.printf("Endereço %s não existe.", endereco.getFileName());
        }
        in.close();
    } // Fim do main

} // Fim da Classe