import java.util.Scanner;

public class SolEcuacion {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int a;
        int b;
        int c;
        double x1;
        double x2;


        double sol1, sol2;

        System.out.print("ingersa el numero a=  ");
        a=s.nextInt();

        System.out.print("ingersa el numero b=  ");
        b=s.nextInt();

        System.out.print("ingersa el numero c=  ");
        c=s.nextInt();


//        x= Math.sqrt(a+b+c);
x1=(-b+Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a);
x2=(-b-Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a);
        
        
        /*sol1=-b+y/2*a;*/
        
        System.out.print("x1="+x1);

        System.out.print("x2="+x2);
        

    

    }
    
    
}