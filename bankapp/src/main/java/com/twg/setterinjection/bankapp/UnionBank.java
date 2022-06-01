package com.twg.setterinjection.bankapp;

public class UnionBank {
	private String Name;
	private long Accno;
	public UnionBank(String name, long accno) {
		Name = name;
		Accno = accno;
		System.out.println("Account holder :"+Name);
		System.out.println("Acc number : "+Accno);
	}
	
}
