package com.my_own;

public class Orthopedic extends Fees
{
	int O_P_fees;
	Orthopedic(int basicFees) 
	{
		super(basicFees);
	}

	@Override
	int getRespectiveFees() 
	{
		return O_P_fees=(2*basicFees);
	}
}
