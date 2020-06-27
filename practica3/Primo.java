import java.util.Scanner;

public class Primo {
  
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n;
        int residuo=1;

        System.out.println("Escribe un numero=   ");
        n=sc.nextInt();
        if(n>1){
            do{
                residuo= n%n-1;


            }while(residuo!=0);

            System.out.println(" no es primo");

        }else{System.out.println("es primo");}


        
    }
    
}