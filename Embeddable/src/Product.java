

//Product.java(pojo class)
import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "products_default")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	//properties
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "pid")
	private int productId;
	public Address getOfficeaddress() {
		return Officeaddress;
	}

	public void setOfficeaddress(Address officeaddress) {
		Officeaddress = officeaddress;
	}

	@Column(name = "pname", length = 10)
	private String productName;
	// @Column(name="price")
	private double price;
    @Temporal(TemporalType.DATE)
	@Column(name = "joinigdate")
	private Date date;
    @Embedded
    private Address address;
    
    @Embedded
    @AttributeOverrides({
    	@AttributeOverride(name="street" , column=@Column(name="off_street")),
    	@AttributeOverride(name="pincode" , column=@Column(name="off_picode")),
    	@AttributeOverride(name="state" , column=@Column(name="off_state"))
    })
    private Address Officeaddress;

	public Product(int productId, String productName, double price, Date date, Address address) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.date = date;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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
				+ date + ", address=" + address + "]";
	}

}
