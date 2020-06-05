import java.util.Scanner;

public class Circulo {

    public static void main (String[] args ){

    Scanner s =new Scanner(System.in);
    double r, a;

    System.out.print(" escribe el radio del circulo =    ");
    r= s.nextDouble();

    a=Math.pow(r,2)*Math.PI;

    System.out.print("el area del circulo es=    "+ a);


    }
}