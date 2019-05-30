package com.aspbtet.applicantion;

public abstract class ApplicationData 
{
	
	String applName;				//PROPERTIES
	String rollNo;
	public int totalMarksSecured;
	public final int MAX_MARKS=200;
	
	public ApplicationData(){}		//DEFAULT
	
	public ApplicationData(String name,String no,int totalMarks)	//OVERLOADED
	{
		applName = name;
		rollNo = no;
		totalMarksSecured = totalMarks;
	}
	
	public abstract boolean getResults();	//INCOMPLETE METHOD

}
