
//Product.java(pojo class)
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	// properties
	@Id
	@Column(name = "pid")
	private int productId;
	@Column(name = "pname", length = 10)
	private String productName;
	// @Column(name="price")
	private double price;
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "joinigdate")
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public Product() {
	}

	public Product(int productId) {
		this.productId = productId;
	}

	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	// setter & getter
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductName(String productName) {

		this.productName = productName;

	}

	public String getProductName() {
		return this.productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {

		return this.price;

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", date="
				+ date + "]";
	}

}
