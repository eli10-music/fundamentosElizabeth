import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r;
        double area=0;
        
        System.out.print("escribe el radio=   ");
        r=sc.nextInt();

        area=Math.PI*Math.pow(r, 2);

        System.out.print("area del circulo=  "+area);





        
    }

    
}