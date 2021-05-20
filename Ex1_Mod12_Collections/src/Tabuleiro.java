public class Tabuleiro {

	//Criando tabuleiro bidimensional.
	char [][] tab = new char [3][3];


	//Limpando Tabuleiro e inserindo espaços em branco
	public void clear() {
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j< tab[0].length; j++) {
				tab[i][j] = ' ';
			}
		}
	}

	//Inserindo as jogadas no tabuleiro
	public void starting(Object [] j) {
		int line = (int)j[0];
		int colum = (int)j[1];
		char player = (char)j[2];
		this.tab[line][colum] = player;

	}

	//Imprimindo tabuleiro com resultado das jogadas.
	public void print() {
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j< tab[0].length; j++) {
				System.out.print(tab[i][j] + " | ");

			}
			System.out.println();
		}
	}

}