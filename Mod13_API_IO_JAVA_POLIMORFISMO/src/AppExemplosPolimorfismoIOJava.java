import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AppExemplosPolimorfismoIOJava {

	public static void main(String[] args) throws IOException {
//      Transferencia de dados entre arquivos
//      obs:Necessário colocar em bloco try usando try-with-resouces
//		
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(fin, fout);
//----------------------------------------------------------------------
//		Pegando dados do arquivo txt e apresentando no console
//		
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		OutputStream cout = System.out;
//		transfer(fin, cout);
//----------------------------------------------------------------------
//		Pegando dados digitados no console e armazenando no arquivo txt
//		
//		InputStream cin = System.in;
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(cin, fout);
//----------------------------------------------------------------------
//		lendo arquivo de entrada e armazenando em uma string
//		
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		ByteArrayOutputStream bout = new ByteArrayOutputStream();
//		transfer(fin, bout);
//		
//		byte [] bytes = bout.toByteArray();
//		String s = new String(bytes);
//		System.out.println(s);
//-------------------------------------------------------------------
	}
	//Mostrando o poder do polimorfismo usando a API de IO do Java
	//Metodo generico que recebe qualquer tipo de dado e faz conversão
	private static void transfer(InputStream in, OutputStream out) throws IOException {
		
		byte [] buffer = new byte[1024];
		
		int bytesLidos;
		
		while((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
