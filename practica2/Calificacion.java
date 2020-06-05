import java.util.Scanner;

public class Calificacion {

    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        double c;
        System.out.print("escribe la calificacion:   ");
        c=s.nextDouble();

        if(c>0 && c<= 6){
            System.out.print(" tienes: NA");

        }
        if(c>=6 && c< 7.5){
            System.out.print(" tienes: B");

        }
        if(c>=7.5 && c<= 10){
            System.out.print(" tienes: MB");

        }


    







    }
    
}