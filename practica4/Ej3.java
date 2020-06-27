import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n1,n2;

        System.out.print("escribe un numero=  ");
        n1=sc.nextInt();
        System.out.print("escribe un numero=  ");
        n2=sc.nextInt();

        if(n1>n2){
            System.out.print("el mayor es el numero 1");
            
           
        } else if(n1==n2){
                
                    System.out.print("el mayor es el numero 1");
            } else{
                System.out.print("el mayor es el numero 2");
            }

           
    }

    
    
}