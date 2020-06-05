import java.util.Scanner;

public class Distancia {
    public static void main (String[] args){

        Scanner s =new Scanner(System.in);

        int x,y;
        double resultado;

        System.out.print("escribe un numero=   ");
        x=s.nextInt();
        System.out.print("escribe otro numero=  ");
        y=s.nextInt();

        resultado=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));

        System.out.print("el resultado es=  "+resultado);

    








    }
    
}