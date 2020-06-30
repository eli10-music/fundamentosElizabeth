import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
       int ah=0,mes=0,ca=0;

      

       for(int i=1; i<=12;i++){


        System.out.println("cuanto va a ahorrar este mes    "+i);
        ca=sc.nextInt();

        ah=ah+ca;
        mes=mes+1;
        System.out.println("el ahorro hasta el mes:    "+mes+   "    es de =   "+ah);



       }

       

       System.out.println("el total del ahorro anual es de =   "+ah);


    
    






    }
    
}