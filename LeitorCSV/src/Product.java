import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	/*A serialização em Java é o processo no qual a instância 
	 * de um objeto é transformada em uma sequência de bytes 
	 * e é útil quando precisamos enviar objetos pela rede, 
	 * salvar no disco, ou comunicar de uma JVM com outra. 
	 */
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {
		
	}

	public Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
