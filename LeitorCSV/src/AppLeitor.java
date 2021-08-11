import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppLeitor {

	public static void main(String[] args) {

		String path = "Entrada.txt";
		
		
		List<Product> list = new ArrayList<Product>();
		


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {


			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String [] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				
				Product prod = new Product(name, price, qte);
				list.add(prod);
								
				line = br.readLine();
			}
			
			System.out.println("Products:");
			for(Product p : list) {
				System.out.println(p);
			}


		}
		catch (IOException e) {
			System.out.println("Erro inesperado: " + e.getMessage());
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
