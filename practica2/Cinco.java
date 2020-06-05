
import java.util.Scanner;
public class Cinco {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        int t;
        int d;
        int v;

        System.out.println("ingrese la distancia");
        t=s.nextInt();

        System.out.println("ingrese la tiempo");
        d=s.nextInt();
        
        v=d/t;

        System.out.println("la velocidad "+ v);

        s.close();


        

        





    }

    
}