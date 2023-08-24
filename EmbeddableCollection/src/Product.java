//Product.java(pojo class)
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "products_default")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	//properties
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "pid")
	private int productId;
	@Column(name = "pname", length = 10)
	private String productName;
	// @Column(name="price")
	private double price;
    @Temporal(TemporalType.DATE)
	@Column(name = "joiningdate")
	private Date date;
    @ElementCollection //making different column
    @JoinTable(name="join_table")
    private Set<Address> address = new HashSet<>();
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", date="
				+ date + ", address=" + address + "]";
	}

	
}
