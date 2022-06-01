package com.twg.setterinjection.bankapp;

public class Sbi {
	public int Accno;
	public String Name;
	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) {
		Accno = accno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	private Sbh sbh;
	public Sbh getSbh() {
		return sbh;
	}
	public void setSbh(Sbh sbh) {
		this.sbh = sbh;
	}
	public void grantAccess()
	{
		System.out.println("sss");
		sbh.access();

	}
}