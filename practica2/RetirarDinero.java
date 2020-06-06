import java.util.Scanner;
public class RetirarDinero{
    
    public static void main(String[] args){

        Scanner s =new Scanner(System.in);
        int numero;
        int clave=123;
        int respuesta;
        

        System.out.print("bienvenido al cajero\n");
         System.out.print("ingrese el numero de tarjeta\n");
        numero=s.nextInt();
        if (clave==numero){
            System.out.print("usted ha ingresado\n");


            respuesta=despliegaMenu();
            if(respuesta ==1 ){
                obtenersaldo();
                
            }
    
            if(respuesta == 2){
                obtenerretirar();
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

        System.out.println("1.- consultar saldo");
        System.out.println("2.- retirar dinero");
        System.out.println("3.- salir");
      
        System.out.println("Opción: ");
        r = sc.nextInt();

        return r;
    }
    public static int obtenersaldo(){

        int r=0;
        int s=1000000;

        System.out.println("su saldo es=   $ "+s);

        s=s-obtenerretirar();

        

        return r;
    }
    public static int obtenerretirar(){
        int r=0;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.println("que cantidad va a retirar=    ");
        c=sc.nextInt();

        System.out.println("su operacion se ha realizado con exito");


        return r;
    }
    public static int obtenersalir(){
        int r=0;

        System.out.println("Gracias por usar nuestro cajero...");
                      
                      System.exit(0);

        return r;
    }





}
