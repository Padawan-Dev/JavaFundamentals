import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		
		//TODO A aplicação deve pedir para que o usuário escolha 
		//entre duas opções: gravar ou ler os dados.
		System.out.println("Escolha a opção desejada e pressione <ENTER>");
		System.out.println("<========Opção 1 > Gravar os dados=========>");
		System.out.println("<========Opção 2 >    Ler os dados=========>");
		
		Scanner op = new Scanner(System.in);
		int resp = op.nextInt();
		
		if(resp == 1) {
        //TODO Caso a opção de gravar seja escolhida, dois objetos Livro 
        //devem ser criados e gravados em um arquivo.
			
			Livro livro1 = new Livro();
			Livro livro2 = new Livro();
			//TODO gravar objetos em arquivo
			
		} else if (resp == 2) {
        //TODO Já se a opção de leitura for escolhida, estes dois objetos
		//devem ser lidos do arquivo e impressos no console.
		}else {
			System.out.println("Opção inválida - Digite 1 ou 2 !");
		}
		
	}
}
