public class Comissionado extends Empregado implements Pagavel{

	private double vendasBrutas, txComissao;
	
	public Comissionado(String nome, String sobrenome, String matricula, 
						double vendasBrutas, double txComissao) {
		super(nome, sobrenome, matricula);
		if(txComissao <= 0D || txComissao >= 1D) {
			throw new IllegalArgumentException(" Taxa invalida");
		}
		this.txComissao = txComissao;
		this.vendasBrutas = vendasBrutas;
	}

	public double getVendasBrutas() {
		if(vendasBrutas < 0.0) throw new IllegalArgumentException("Vendas Validas");
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getTxComissao() {
		return txComissao;
	}

	public void setTxComissao(double txComissao) {
		if(txComissao <= 0D || txComissao >= 1D) throw new IllegalArgumentException(" Taxa invalida");
		this.txComissao = txComissao;
	}
	
	@Override
	public double getPagamento() {
		return txComissao * vendasBrutas;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: R$ %.2f (%s %%%.2f)", 
				"Comissionado ", super.toString(), 
				"Vendas Brutas ", vendasBrutas, 
				"Taxa de comissao ",txComissao);
	}

	@Override
	public double vencimentos() {
		// TODO Auto-generated method stub
		return 0;
	}
}