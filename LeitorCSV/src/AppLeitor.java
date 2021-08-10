import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppLeitor {

	public static void main(String[] args) {

		String path = "Entrada.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}


		}
		catch (IOException e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		}
		finally {
			try {
				br.close();
				fr.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}		

		/*PRIMEIRA VERSÃO DO LEITOR*/
		//		File file = new File("Entrada.txt");
		//		/*Você pode colocar o caminha absoluto se preferir, como:
		//		 * No windows seria: ("c:\\temp\\Entrada.txt")
		//		 * No linux seria:  ("   ");
		//		 */
		//		
		//		Scanner sc = null;
		//		try {
		//		sc = new Scanner(file);
		//		
		//		while (sc.hasNextLine()) {
		//			System.out.println(sc.nextLine());
		//			
		//		}
		//		
		//		}
		//		catch (IOException e) {
		//			
		//			System.out.println(e.getMessage());
		//			
		//		}
		//		finally {
		//			if(sc != null) {
		//			   sc.close();
		//			}
		//		}
		//		
	}

}
