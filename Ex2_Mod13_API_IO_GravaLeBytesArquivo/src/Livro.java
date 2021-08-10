import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Livro implements Recordable{

	String titulo;
	int numPaginas;
	Autor autor;
		
	@Override
	public void read(DataInputStream in) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void write(DataOutputStream out) throws IOException {
		byte [] buffer = titulo.getBytes();
		out.write(buffer);
		out.writeByte(numPaginas);
		
//		out.write("\n".getBytes()); //Inserindo caractere de quebra de linha 
//		out.write(20); //writeByte Nao/writeInt Nao/
//		out.write("\n".getBytes());
		
		
				
	}
}
