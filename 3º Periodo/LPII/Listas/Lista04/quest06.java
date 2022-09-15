package Lista04;

import java.util.Scanner;

public class quest06{

    public static Carro fiatUno = new Carro();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        String marca, modelo, combustivel = "";
        int ano, opCombs;

        System.out.println("Digite a marca do carro: ");
        marca = scan.nextLine();
        System.out.println("Digite o modelo do carro: ");
        modelo = scan.nextLine();
        System.out.println("Digite o ano do carro: ");
        ano = scan.nextInt();

        System.out.println("Combustivel");
        System.out.println("[1] - Gasolina."
                          +"\n[2] - Alcool."
                          +"\n[3] - Flex.\n");
        System.out.print("Sua opção: ");
        opCombs = scan.nextInt();

        switch(opCombs){
            case 1: combustivel = "Gasolina"; break;
            case 2: combustivel = "alcool"; break;
            case 3: combustivel = "flex"; break;
            default: System.out.println("Opção não disponivel.");
        }

        Carro fiatUno = new Carro(marca, modelo, combustivel, ano);
        fiatUno.toString();

        menu();

    }

    public static void menu(){
        
        int op;

        System.out.println("Alteração");
        System.out.println("[1] - para marca."
                          +"\n[2] - para modelo."
                          +"\n[3] - para ano."
                          +"\n[4] - para combustivel.\n");
                          
        System.out.print("Sua opção: ");
        op = scan.nextInt();

        switch(op){
            case 1: alteraMarca(fiatUno); break;
            case 2: alteraModelo(fiatUno); break;
            case 3: alteraAno(fiatUno); break;
            case 4: alteraCombustivel(fiatUno); break;
        }
        
    }
    public static void alteraMarca(Carro carro){
        String marca;
        System.out.println("Digite a marca: ");
        marca = scan.nextLine();
        carro.setMarca(marca);
        System.out.println(carro.toString());
        menu();
    }

    public static void alteraModelo(Carro carro){
        String modelo;
        System.out.println("Digite o modelo: ");
        modelo = scan.nextLine();
        carro.setModelo(modelo);
        System.out.println(carro.toString());
        menu();
    }

    public static void alteraAno(Carro carro){
        int ano;
        System.out.println("Digite o ano: ");
        ano = scan.nextInt();
        carro.setAno(ano);
        System.out.println(carro.toString());
        menu();
    }
    public static void alteraCombustivel(Carro carro){
        String combustivel = "";
        int opCombs;

        System.out.println("Combustivel");
        System.out.println("[1] - Gasolina."
                          +"\n[2] - Alcool."
                          +"\n[3] - Flex.\n");
        System.out.print("Sua opção: ");
        opCombs = scan.nextInt();

        switch(opCombs){
            case 1: combustivel = "Gasolina"; break;
            case 2: combustivel = "alcool"; break;
            case 3: combustivel = "flex"; break;
            default: System.out.println("Opção não disponivel.");
        }

        carro.setCombustivel(combustivel);
        System.out.println(carro.toString());
        menu();
    }
}