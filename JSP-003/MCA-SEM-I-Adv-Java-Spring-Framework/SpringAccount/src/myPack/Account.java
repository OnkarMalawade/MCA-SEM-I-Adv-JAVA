package myPack;

public class Account {
	int actNo;
	String actNm;
	double actBal;
	
	public Account() {
		super();
	}
	public Account(int actNo, String actNm, double actBal) {
		super();
		this.actNo = actNo;
		this.actNm = actNm;
		this.actBal = actBal;
	}
	@Override
	public String toString() {
		return "Account [actNo=" + actNo + ", actNm=" + actNm + ", actBal=" + actBal + "]";
	}
	public int getActNo() {
		return actNo;
	}
	public void setActNo(int actNo) {
		this.actNo = actNo;
	}
	public String getActNm() {
		return actNm;
	}
	public void setActNm(String actNm) {
		this.actNm = actNm;
	}
	public double getActBal() {
		return actBal;
	}
	public void setActBal(double actBal) {
		this.actBal = actBal;
	}
}
