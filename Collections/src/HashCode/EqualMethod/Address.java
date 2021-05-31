package HashCode.EqualMethod;

import java.io.Serializable;

public class Address implements Serializable {
	
	int hno;
	int streetNo;
	String city;
	
	public Address(int hno, int streetNo, String city) 
	{
		this.hno = hno;
		this.streetNo = streetNo;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "hno : "+hno+"\n"+"streetNo : "+streetNo+"\n"
				+"city : "+city;
	}

}
