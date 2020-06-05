import java.util.Scanner;

public class NumMayores {
    public static void main (String[] args){

        Scanner n=new Scanner(System.in);
        int n1,n2,n3,uno,dos, tres;

        System.out.print("escribe un numero");
        n1=n.nextInt();
        System.out.print("escribe un numero");
        n2=n.nextInt();
        System.out.print("escribe un numero");
        n3=n.nextInt();

        if(n1>n2 && n1>n3 && n2>n3){

            uno=(n1*n2)+n3;
            System.out.println("el resultado es"  +uno);
        }
        if(n2>n1 && n2>n3 && n1>n3){

            dos=(n1*n2)+n3;
            System.out.println("el resultado es"  +dos);
        }
        if(n3>n1 && n3>n2 && n2>n1){

            dos=(n3*n2)+n1;
            System.out.println("el resultado es"  +dos);
        }









    }
    
}