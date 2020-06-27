import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int cont=0;
        int num;

        int pares=0;
        int impares=0;

        while(cont<=9){
            System.out.print("leer numero=  ");
            num=sc.nextInt();
            if(num%2==0){
                pares=pares+1;

            }else{
                impares=impares+1;
            }
            cont+=1;
            
        }
        System.out.println("hay=     "+pares+"pares" );
            System.out.println("hay=    "+impares+"impares");

       
    }
    
}