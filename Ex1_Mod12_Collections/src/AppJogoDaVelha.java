public class AppJogoDaVelha {

	public static void main(String[] args) {

		// criando tabuleiro de duas dimensões
		char[][] tab = new char[3][3];

		
		/* Inicializando de forma diferente e com espaços em branco 
		 * {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		 */

		/*Limpa tabuleiro*/
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				tab[i][j] = ' ';

			}

		}
		//TODO Definir jogadas e armazenar em uma lista
		 char [] jogadas = {' ',' ','O','O','X','X','X',' ','X'};
		 for (int i:jogadas) {
			 System.out.println(i);
		 }
		 
		  
		
		
		
//		   COLUNA
//		   0  1   2 
//	lINHA0(O, O , X)
//		 1(0, X , O)
//		 2(X, X , X)
		                  
		
		

	}

}
