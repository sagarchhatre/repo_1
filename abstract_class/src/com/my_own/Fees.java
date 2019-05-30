package com.my_own;

public abstract class Fees 
{
	 int basicFees;
	 
	 Fees(int basicFees){this.basicFees=basicFees;}
	 
	 abstract int getRespectiveFees();
}
