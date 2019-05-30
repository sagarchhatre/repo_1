package com.aspbtet.officeauto;

import com.aspbtet.applicantion.ApplicationData;

public class OfficeAutomation extends ApplicationData 
{
	
		public OfficeAutomation(){}   //CONSTRUCTOR
		
		public OfficeAutomation(String name,String id,int tot)//OVERLOADED
		{
		    super(name,id,tot);
	    }
		
		public boolean getResults()		// USER DEFINED METHOD
		{
			float per = (totalMarksSecured *100 )/MAX_MARKS;
			if(Math.round(per) < 60 )						// let's keep the pass percentage as 60
			return false;
			return true;
	    }
}
