import java.util.Scanner;
public class GradosCF {
    public static void main (String[] args){

        
        Scanner desktop=new Scanner(System.in);
        int c;
        double resultado;

        System.out.println("ingresa grados centigrados=");
        c=desktop.nextInt();
        
        resultado=(c*1.8)+32;
        System.out.println("GRADOS FARENHEIT="+ resultado);


    }
    
}