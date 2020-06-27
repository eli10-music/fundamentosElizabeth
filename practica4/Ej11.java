import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n,x;
        int perfecto=0;
        x=2;
        

        System.out.println("escribe un numero");
        n=sc.nextInt();

        while(x<=n){
            if(n % x==0){
                
                perfecto=(n/x)+perfecto;


            }
            x=x+1;
        }
        if(perfecto==n){
            System.out.println("es perfecto");

            

        }else {System.out.print("el numero no es perfecto");}


        
        
    }
}