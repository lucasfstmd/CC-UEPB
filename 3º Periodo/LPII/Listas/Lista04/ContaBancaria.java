package Lista04;

public class ContaBancaria {
    
        private double saldo;
    
        public ContaBancaria(){} // Fim do construtor vazio
        public ContaBancaria(double saldoInicial){
            if (saldoInicial > 0){
                saldo = saldoInicial;
            }
            else throw new Exception("Não autorizado.");
        }
        public void deposito(double valor){
            if(valor > 0) saldo += valor;
        } 
        public void saque(double valor){
            if(valor <= saldo){
                saldo -= valor;
            }
            else{
                System.out.printf("Saldo insuficiente: [saldo %.2f]\n", this.saldo);
            }
        }
        public double getSaldo(){
            return this.saldo;
        }
    
        @Override
        public String toString(){
            return String.format("Saldo %f", this.saldo);
        }

} 

