import java.util.Objects;

public class Address1 {

	private String street;
	private String city;
	private int pincode;
	public Address1(){}

	public Address1(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Address1 other = (Address1) obj;
		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return  street + ","+ city + "," + pincode ;
	}
	
}
