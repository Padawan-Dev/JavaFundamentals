import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) throws IOException {
		
//******* 1ª Forma mais dificil e de baixo nivel para leitura de bytes e conversão em Strings*****
//		try (InputStream is = new FileInputStream("entrada.txt")) {
//		
//		byte[] buffer = new byte[1024];
//		
//		int bytesLidos = is.read(buffer);
//		
//		String s = new String(buffer, 0, bytesLidos);
//		
//		System.out.println(s);
//		System.out.println(s.length());
		
		//2ª Forma mais facil
//		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
//			String s = "";
//			String line;
//			while ((line = reader.readLine()) != null) {
//				s += line + "\n";
//			}
//			System.out.println(s);
//		}
		
		//3ª forma mais facil e intuitiva
		try (Scanner scanner = new Scanner(new File("entrada.txt"))) {
			String s = "";
			while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			s += line + "\n";
			}
			System.out.println(s);
		}
	}
}
