import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public interface Recordable {

	public default void read(DataInputStream in) throws IOException{
		
	}
	
	public default void write(DataOutputStream out) throws IOException{
		
	}
}
