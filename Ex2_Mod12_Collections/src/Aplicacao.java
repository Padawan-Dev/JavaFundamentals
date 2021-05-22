
public class Aplicacao {

	public static void main(String[] args) {
		
		Produtos p = new Produtos();
		
		Produto p1 = new Produto("Laranja", 2.50);
		Produto p2 = new Produto("Laranja", 2.70);
		Produto p3 = new Produto("Maçã", 1.45);
		Produto p4 = new Produto("Mamão", 4.95);
		Produto p5 = new Produto("Limão", 2.30);
		
		p.adicionar(p1);
		p.adicionar(p2);
		p.adicionar(p3);
		p.adicionar(p4);
		p.adicionar(p5);
		
		p.imprimir();
		
	}

}
