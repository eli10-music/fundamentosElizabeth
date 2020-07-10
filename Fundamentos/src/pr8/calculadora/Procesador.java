package pr8.calculadora;

public class Procesador {
	
	public Complejo sumar(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re,im;
		
		re = c1.getReal() + c2.getReal(); //(a+c)
		im = c1.getImag() + c2.getImag();  //(b+d)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}
	public Complejo restar(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re,im;
		
		re = c1.getReal() - c2.getReal(); //(a+c)
		im = c1.getImag() - c2.getImag();  //(b+d)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	

}
	public Complejo multiplicar(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re,im;
		
		re = c1.getReal() * c2.getReal(); //(a+c)
		im = c1.getImag() * c2.getImag();  //(b+d)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	

}
	public Complejo dividir(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re,im;
		
		re = c1.getReal() / c2.getReal(); //(a+c)
		im = c1.getImag() / c2.getImag();  //(b+d)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	

}
	
	
	


}