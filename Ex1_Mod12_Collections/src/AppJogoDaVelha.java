public class AppJogoDaVelha {

	Object [] x;

	public static void main(String[] args) {

		//Criando tabuleiro
		Tabuleiro jogo = new Tabuleiro();

		//Limpando tabuleiro e inserindo espaços em branco
		jogo.clear();

		//Criando lista de jogadas
		Jogadas op = new Jogadas();

		for (int i = 0; i < op.plays.length; i++) {
			jogo.starting(op.start(i));

		}

		//Imprimindo tabuleiro com resultado final das jogadas;
		jogo.print(); 

	}

}
