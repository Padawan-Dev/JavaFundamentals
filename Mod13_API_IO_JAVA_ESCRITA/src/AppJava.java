import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class AppJava { //Armazenando dados em arquivos

	public static void main(String[] args) throws IOException {
// FORMA MAIS DIFICIL
//		try(OutputStream os = new FileOutputStream("saida.tx")){
//			String s = "texto a ser exibido no arquivo";
//			byte [] buffer = s.getBytes();
//			os.write(buffer);
//		}
		
// SEGUNDA FORMA DE ESCRITA, SEM BUFFER E TRAB DIRET COM TEXTOS E NAO BYTES		
//		String s = "segunda forma de escrita";
//		
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter("saida2.txt"))){
//			writer.write(s);
//		}

		//TERCEIRA FORMA MAIS FACIL E MAIS INTUITIVA E SIMPLES
		String s = "terceira forma mais facil e intuitiva";
		try(PrintWriter pw = new PrintWriter("saida3.txt")){
			pw.println(s);
		}
	}
}
