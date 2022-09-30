package Lista06;

class Animal {
    
    private String nome;
    private int quantPata;
    private String tipo;
  
    Animal(String nome, int quantPatas, String tipo) {
      this.setNome(nome);
      this.setQuantPatas(quantPatas);
      this.setTipo(tipo);
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public void setQuantPata(int quantPata) {
      this.quantPata = quantPata;
    }
  
    public void setTipo(String tipo) {
      this.tipo = tipo;
    }
  
    public String getNome() {
      return this.nome;
    }
  
    public int getQuantPatas() {
      return this.quantPatas;
    }
  
    public String getTipo() {
      return this.tipo;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", quantPata=" + quantPata + ", tipo=" + tipo + "]";
    }

  }
  