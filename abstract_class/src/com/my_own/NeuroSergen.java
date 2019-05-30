package com.my_own;

public class NeuroSergen extends Fees
{
	int N_S_fees;
	
	NeuroSergen(int basicFees)
	{
		super(basicFees);
	}
	@Override
	int getRespectiveFees() 
	{
		return N_S_fees=(3*basicFees);
	}
}
