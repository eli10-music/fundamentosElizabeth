import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float a,b,c;
        float suma,prom;
        

        System.out.print("ingresa el numero=  ");
        a=sc.nextFloat();
        System.out.print("ingresa el numero=  ");
        b=sc.nextFloat();
        System.out.print("ingresa el numero=  ");
        c=sc.nextFloat();

        suma=a+b+c;

        prom=suma/3;

        System.out.print("el promedio es=  "+prom);








    }
    
}