package pr8.calculadora;

import java.util.Scanner;

public class Teclado {
	
	Scanner sc = new Scanner(System.in);
	
	public String capturaOper() {
		String s;

		System.out.print("Operador:");
		s = sc.nextLine();
		s = sc.nextLine();
		
		return s;
	}
	
	public Complejo capturaComplejo() {
		Complejo c = new Complejo();
		double re;
		double im;
		
		System.out.print("real: ");
		re = sc.nextDouble();
		System.out.print("imaginario: ");
		im = sc.nextDouble();
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}

}
