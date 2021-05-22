import java.util.Collection;
import java.util.TreeSet;


public class Produtos {

	Collection <Produto> produtos = new TreeSet<>();
	//Collection <Produtos> produtos = new HashSet<>();
	//Collection <Produtos> produtos = new ArrayList<>();
	
	
	//Adiciona um produto a coleção
	void adicionar(Produto produto){
		produtos.add(produto);
	}
	//Imprime todos os produtos;
	void imprimir() {
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
