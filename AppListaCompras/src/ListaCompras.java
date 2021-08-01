import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Aplicação para gerenciar itens de uma lista de compras.
public class ListaCompras {

	public static void main(String[] args) throws IOException {

		Scanner cin = new Scanner(System.in);
		File f = new File("lista.txt");
		FileWriter fw = new FileWriter(f, true);
		//Verifica se o arquivo existe e mostra na tela itens já cadastrados caso retorne TRUE;
		if(f.exists()) {
			System.out.println("Itens já adicionados a lista:");
			mostraLista(f);
			System.out.println("Informe um item e pressione <ENTER> ! ");
		}
		//Metodo para ler do console e grava no arquivo TXT.
		gravaLista(cin, fw);
	}

	private static void gravaLista(Scanner in, FileWriter out) throws IOException {
		
		while(in.hasNext() && !in.hasNext("0")) {
			System.out.println("Informe um item da lista e pressione <ENTER>!");
			String buffer = in.nextLine() + "\n";
			out.write(buffer);

		}
		in.close();
		out.close();
	}

	private static void mostraLista(File f) throws IOException {

		FileReader arq = new FileReader(f);
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		while (linha != null) {
			System.out.printf("%s\n", linha);
			linha = lerArq.readLine();
		}
		arq.close();
	}

}
	