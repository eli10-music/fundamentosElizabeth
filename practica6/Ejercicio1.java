
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,at,ar,atotal,precio;
        double costo;
        
        


        System.out.println("Ingreza el valor del lado a== ");
        a=sc.nextDouble();
        System.out.println("Ingreza el valor del lado b== ");
        b=sc.nextDouble();
        System.out.println("Ingreza el valor del lado c== ");
        c=sc.nextDouble();
        System.out.println("¿cuanto cuesta el metro cuadrado?      ");
        precio=sc.nextDouble();

        at=b*(a-c)/2;

        ar=c*b;

        atotal=at+ar;

        costo=atotal*precio;

        System.out.println("el area del terreno es de    "+atotal+" y el costo total del terreno es de $"+costo);
        





        



    }
    
    
}