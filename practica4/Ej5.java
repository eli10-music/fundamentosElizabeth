import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
 
        Scanner sc= new Scanner(System.in); 

        float n;
        int cont=0;
        float prom=0;
        float sum=0;

        for(int i=1; i<=10; i++){
            System.out.println("ingresa los numeros");
            n=sc.nextFloat();
            cont+=i;
            sum=cont+n;

        }

        prom=sum/cont;
        System.out.println("El promedio es=   "+prom);



    


        
    }
    
}