
public class Produto implements Comparable<Produto>{
//Usando Comparable<Produtos> para poder comparar produto com produto;
	
	private String nome;
	private double valor;
	
	public Produto(String descricao, double valor) {
		this.nome = descricao;
		this.valor = valor;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public double getValor() {
		return valor;
	}



	@Override
	public int compareTo(Produto o) { //Sobrescrevendo metodo para que seja olhado valor na ordem de inserção
		if (this.valor == o.valor) {
			return 0;
		}
		
		if (this.valor > o.valor) {
			return 1;
		}
		return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
}
