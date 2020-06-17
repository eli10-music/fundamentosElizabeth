import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        int a,b,c;
        int res;

        Scanner sc = new Scanner(System.in);


        System.out.print("   ESCRIBE TRES NUMEROS  \n");
        System.out.print("a=   ");
        a=sc.nextInt();
        System.out.print("b=   ");
        b=sc.nextInt();
        System.out.print("c=   ");
        c=sc.nextInt();

        if(b+c>a){
        }
        if(c+a>b){

        }
            
        if(a+b>c){
            System.out.print("es un triangulo");
        }
        else{
            System.out.print("no es un triangulo");
        }





        
    }
    
}