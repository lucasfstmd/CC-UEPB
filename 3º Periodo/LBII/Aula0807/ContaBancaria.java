// ContaBancaria.java
public class ContaBancaria{
    private int nConta;
    private String nome;
    private String sobrenome;
    private double saldo;
 
    public void setnConta(int nConta) {
       if(nConta < 0) throw new IllegalArgumentException("Inválido.");
          this.nConta = nConta;
    }
 
    public void setNome(String nome) {
       this.nome = nome;
    }
 
    public void setSobrenome(String sobrenome) {
       this.sobrenome = sobrenome;
    }
 
    public void deposito(double saldo) {
       if(saldo < 0) throw new IllegalArgumentException("Inválido.");
       this.saldo = saldo;
    }
 
    public int getnConta() {
          return nConta;
       }
 
    public String getNome() {
       return nome;
    }
 
    public String getSobrenome() {
       return sobrenome;
    }
 
    public double getSaldo() {
       return saldo;
    }
 
    public ContaBancaria(){
       this(0, "", "", 0.00);
    } // Fim do construtor ContaBancaria()
 
    public ContaBancaria(int nConta,
                          String nome,
                          String sobrenome,
                          double saldo){
       if(nConta < 0 || saldo < 0) throw new IllegalArgumentException("Inválido.");
       this.nConta = nConta;
       this.saldo = saldo;
       this.nome = nome;
       this.sobrenome = sobrenome;               
    } // Fim do construtor ContaBancaria(int, String, String, double)
    @Override
    public String toString(){
       return String.format("Classe ContaBancaria.");
    }  
 }