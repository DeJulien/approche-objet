package fr.diginamic.testexceptions;

public class Operation {
	
	public double diviser(double a,double b) throws ArithmeticException, RuntimeException
	{
		
		if(b==0)
		{
			throw new ArithmeticException("On ne peu divisé par 0");
		}
		double calcule=a/b;
		if(calcule==0)
		{
			throw new RuntimeException();
		}
		
		
		return calcule;
	}

}
