import java.util.Scanner;

public class ElMayor {

    public static void main (String[] args){

    Scanner s =new Scanner(System.in);
    int x, y, z ;

    System.out.print("ingresa un numero=  ");
    x=s.nextInt();
    System.out.print("ingresa un numero=  ");
    y=s.nextInt();
    System.out.print("ingresa un numero=  ");
    z=s.nextInt();

    if(x>y && x>z){
      System.out.print("el mayor es:"+x);
    }
    if(y>x && y>z){
        System.out.print("el mayor es:"+y);
      }
      if(z>y && z>x){
        System.out.print("el mayor es:"+z);
      }
  
  


    }   
}