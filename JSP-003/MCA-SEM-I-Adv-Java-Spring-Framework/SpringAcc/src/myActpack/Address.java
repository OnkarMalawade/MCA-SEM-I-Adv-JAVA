package myActpack;

public class Address {
	int building;
	
	public Address(int building) {
		super();
		this.building = building;
	}

	public Address() {
		super();
	}


	public int getBuilding() {
		return building;
	}

	public void setBuilding(int building) {
		this.building = building;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + "]";
	}
}
