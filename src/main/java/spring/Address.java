package spring;

public class Address {

	String region;
	
	String city;
	
	int zipCode;
	
	

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String region, String city, int zipCode) {
		this.region = region;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [region=" + region + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
}
