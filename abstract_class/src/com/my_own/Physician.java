package com.my_own;

public class Physician extends Fees
{
	int P_fees;

	Physician(int basicFees)
	{
		super(basicFees);
	}

	@Override
	int getRespectiveFees() 
	{
		return P_fees=(1*basicFees);
	}	
}
