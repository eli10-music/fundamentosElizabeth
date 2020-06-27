import java.util.Scanner;

public class Ej10 {
   



    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese primer numero:");
        a=teclado.nextInt();
        System.out.println("Ingrese segundo numero:");
        b=teclado.nextInt();
        
        while(a != b)
            if(a>b)
                a= a-b;
            else
                b= b -a;
        
        System.out.println("El MCD es:" +a);
        
    
    
}
    
}