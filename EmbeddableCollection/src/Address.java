import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="user_street")
	private String street;
	@Column(name="user_pincode")
	private String pincode;
	@Column(name="user_state")
	private String state;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	Address(){
		
	}
	public Address(String street, String pincode, String state) {
		super();
		this.street = street;
		this.pincode = pincode;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + ", state=" + state + "]";
	}

}
