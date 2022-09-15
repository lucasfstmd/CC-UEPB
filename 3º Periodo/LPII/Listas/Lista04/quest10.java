package Lista04;

import java.util.Scanner;

public class quest10 {
    
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        double saldoInicialPolpa, saldoInicialCorrente ,saquePolpanca, saqueCorrente, depositoPolpanca, depositoCorrente;  

        System.out.println("Qual saldo inicial na conta Polpança");
        saldoInicialPolpa = scan.nextDouble();  
        
        ContaBancaria contaPolpaca = new ContaBancaria(saldoInicialPolpa);
        System.out.println(contaPolpaca.toString());
        
        System.out.println("Qual saldo inicial na conta Corrente");
        saldoInicialCorrente = scan.nextDouble(); 

        ContaBancaria contaCorrente = new ContaBancaria(saldoInicialCorrente);
        System.out.println(contaCorrente.toString());

        System.out.println("Digite quanto quer depositar na Polpança");
        depositoPolpanca = scan.nextDouble();

        contaPolpaca.deposito(depositoPolpanca);
        System.out.println(contaPolpaca.toString());

        System.out.println("Digite quanto quer depositar na Corrente");
        depositoCorrente = scan.nextDouble();

        contaCorrente.deposito(depositoCorrente);
        System.out.println(contaCorrente.toString());

        System.out.println("Digite quanto quer sacar na Polpança");
        saquePolpanca = scan.nextDouble();

        contaPolpaca.saque(saquePolpanca);
        System.out.println(contaPolpaca.toString());
        
        System.out.println("Digite quanto quer sacar na Corrente");
        saqueCorrente = scan.nextDouble();

        contaCorrente.saque(saqueCorrente);
        System.out.println(contaCorrente.toString());
    }
}
