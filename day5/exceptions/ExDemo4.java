package com.insight.day5.exceptions;

//

public class ExDemo4 {

	
	public static void main(String[] args)// throws DepositException
	{
	
		
		int a=1999;
	   
			try {
				if(a<1000)
					throw new DepositException("Minimum deposit is 1000/-");
				else
					System.out.println(" Done");
			} catch (DepositException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
	}

}
