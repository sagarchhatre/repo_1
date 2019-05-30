package com.my_own;

public class DempHospDomain 
{
	public static void main(String[] args) 
	{
		Fees f=new NeuroSergen(500);
		int a=f.getRespectiveFees();
		System.out.println(a);
		
		Fees f1=new Orthopedic(500);
		int b=f1.getRespectiveFees();
		System.out.println(b);
		
		Fees f2=new Physician(500);
		int c=f2.getRespectiveFees();
		System.out.println(c);
	}
}
