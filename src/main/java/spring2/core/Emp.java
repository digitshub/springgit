package spring2.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
	public class Emp {

	    @Autowired
	    @Qualifier("address2")
	    private Address address;
	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public Emp(Address address) {
	        this.address = address;
	    }

	    public Emp() {
	        super();
	    }

	    @Override
	    public String toString() {
	        return "Emp{" + "address=" + address + '}';
	    }
	}


