import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AppLeitor {
	
	public static void main(String[] args) {
		
		
		File file = new File("Entrada.txt");
		/*Você pode colocar o caminha absoluto se preferir, como:
		 * No windows seria: ("c:\\temp\\Entrada.txt")
		 * No linux seria:  ("   ");
		 */
		
		Scanner sc = null;
		try {
		sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		
		}
		catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		finally {
			if(sc != null) {
			   sc.close();
			}
		}
		
	}

}
