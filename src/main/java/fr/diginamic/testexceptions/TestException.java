package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=4.1;
		double b=2.1;
		Operation ope= new Operation();
		
		try {
			
			System.out.println(ope.diviser(a, b));
			
			} catch (ArithmeticException e) {
				System.out.println(e);

			}
		
		a=0;
		try {
			
			System.out.println(ope.diviser(a, b));
			
			} catch (ArithmeticException e) {
				System.out.println(e);

			}
		
		b=0.0;
		
		try {
				
			System.out.println(ope.diviser(a, b));
			
			} catch (ArithmeticException e) {
				System.out.println(e);

			}

	}

}
