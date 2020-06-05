
import java.util.Scanner;
public class SalarioDH {

    public static void main (String[]args){
        Scanner desktop=new Scanner(System.in);
        int horas;
        int p;
        int resultado=0;
        
        System.out.print("ingresa el numero de horas    ");

        horas=desktop.nextInt();

        System.out.print("ingresa el pago por hora    ");

        p=desktop.nextInt();

         resultado=horas*p;

        System.out.println("su salario es:    "  +  resultado);

        desktop.close();
       
    }
    
}