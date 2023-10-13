package myActpack;

public class Employee {
	int id;
	String nm;
	Address addr;
	
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nm=" + nm + ", addr=" + addr + "]";
	}
	public Employee(int id, String nm, Address addr) {
		super();
		this.id = id;
		this.nm = nm;
		this.addr = addr;
	}
}
