import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException, ParseException {

		
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
			livro1.titulo = "titulo do livro1";
			livro1.numPaginas = 15;
			Autor autor1 = new Autor();
			autor1.nome = "autorlivro1";
			autor1.dataNascimento = new Date();
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
			String s = df.format(autor1.dataNascimento);
			System.out.println(s);
			//TODO implementar data nascimento do autor
			
			
			Livro livro2 = new Livro();
			livro2.titulo = null;
			livro2.numPaginas = 0;
			Autor autor2 = new Autor();
			autor2.nome = null;
			autor2.dataNascimento = new Date();
			DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
			String ss = df2.format(autor2.dataNascimento);
			System.out.println(ss);
			
			//Teste de escrita em arquivo no formato de bytes - ok
			String string = "Simple Testing";
			int i = 50;
	        byte[] bytes = string.getBytes();
	        byte bytes2;
	        System.out.println("String: " + string);
	        System.out.println("Bytes: " + Arrays.toString(bytes));
			
//			OutputStream f = new FileOutputStream("Livro.txt");
//			DataOutputStream o = new DataOutputStream(f);
			
						
//			livro1.write(o);
//			autor1.write(o);
//			livro2.write(o);
//			autor2.write(o);
//			
			
			
			
						
		} else if (resp == 2) {
        //TODO Já se a opção de leitura for escolhida, estes dois objetos
		//devem ser lidos do arquivo e impressos no console.
		}else {
			System.out.println("Opção inválida - Digite 1 ou 2 !");
		}
		
	}

	
}
