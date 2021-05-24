import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;


public class Produtos {

	//Collection <Produto> produtos = new TreeSet<>();
	//Collection <Produto> produtos = new HashSet<>();
	Collection <Produto> produtos = new ArrayList<>();
	
	
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
