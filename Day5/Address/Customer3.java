import java.util.Objects;

public class Customer3 {
	private String name;
	private Address1 address;
	Customer3(){}
	
	Customer3(String name, Address1 address) {
		this.setName(name);
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
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
		Customer3 other = (Customer3) obj;
		return Objects.equals(name, other.name) && Objects.equals(address, other.address);
	}

	@Override
	public String toString() {
		return " Name:" + name +  " Address:" + address ;
	}
}
