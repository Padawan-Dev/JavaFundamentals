import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;

public class Autor implements Recordable{
	
	String nome;
	Date dataNascimento;
	
	@Override
	public void read(DataInputStream in) throws IOException {
		//TODO implementar a leitura dos dados
		
	}
	@Override
	public void write(DataOutputStream out) throws IOException {
		//TODO implementar a escrita dos dados no arquivo
		
	}
	
}
