

import java.util.Scanner;
public class DepocitarDinero {

    public static void main(String[] args){

        Scanner s =new Scanner(System.in);
        int numero;
        int clave=123;
        int respuesta;
        double saldo;
        
        

        System.out.print("bienvenido al cajero\n");
         System.out.print("ingrese el numero de tarjeta\n");
        numero=s.nextInt();
        if (clave==numero){
            System.out.print("usted ha ingresado\n");


            respuesta=despliegaMenu();
            if(respuesta ==1 ){
                depocitarsaldo();
                
            }
    
            if(respuesta == 2){
                saldoactual();
            }
            if(respuesta == 3){
                obtenersalir();
            }
           
            
        } 
        else{
            
            System.out.print("la clave es incorrecta");
    } 

   


    }
    public static int despliegaMenu(){
        int r = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.- depocitar saldo");
        System.out.println("2.- saldo actual");
        System.out.println("3.- salir");
      
        System.out.println("Opción: ");
        r = sc.nextInt();

        return r;
    }
    public static double depocitarsaldo(){
        Scanner s =new Scanner(System.in);
        int r=0;
        double cantidad=0;
        

        System.out.println("ingrese la cantidad que desea agregar a su cuenta  $ "+cantidad);
        cantidad=s.nextDouble();
        

        

        return r;
    }
    public static int saldoactual(){
        int r=0;
        double c=0;
        Scanner sc = new Scanner(System.in);

        c=c+depocitarsaldo();

        System.out.println("saldo actual=    "+c);

        

      


        return r;
    }
    public static int obtenersalir(){
        int r=0;

        System.out.println("Gracias por usar nuestro cajero...");
                      
                      System.exit(0);

        return r;
    }
    
}