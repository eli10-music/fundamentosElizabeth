  
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int respuesta;

        respuesta = despliegaMenu();
        //System.out.println("La respuesta fue: " + respuesta);

        if(respuesta ==1 ){
            obtenerCF();
        }

        if(respuesta == 2){
            obtenerFC();
        }
        if(respuesta == 3){
            obtenerKC();
        }
        if(respuesta == 4){
            obtenerKF();
        }
        if(respuesta == 5){
            obtenerFK();
        }
        if(respuesta == 6){
            obtenerCK();
        }

        

    }

    public static void obtenerFC(){
        double F, C;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados F: ");
        F = sc.nextDouble();

        C = (5.0/9.0)*(F-32.0);

        System.out.println("Grados C: " + C);
    }

    public static void obtenerCF(){
        double C, F;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados C: ");
        C = sc.nextDouble();

        F = (9.0/5.0)*C + 32.0;

        System.out.println("Grados F: " + F);
    }
    public static void obtenerKC(){
        double K, C;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados K: ");
        K = sc.nextDouble();

        C=K-273.15;

        System.out.println("Grados C: "+ C );
    }
    public static void obtenerKF(){
        double K, F;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados K: ");
        K = sc.nextDouble();
        F=(K-273.15)*1.8+32;

        System.out.println("Grados F: "+ F );
    }
    public static void obtenerFK(){
        double K, F;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados F: ");
        F = sc.nextFloat();
        K=(32F-32)*5/9+273.15;
        
        System.out.println("Grados K: "+ K );
    }
    public static void obtenerCK(){
        double K, C;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados C: ");
        C = sc.nextFloat();
        K=C+273.15;
        
        System.out.println("Grados K: "+ K );
    }
    public static int despliegaMenu(){
        int r = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.- C-F");
        System.out.println("2.- F-C");
        System.out.println("3.- K-C");
        System.out.println("4.- K-F");
        System.out.println("5.- F-K");
        System.out.println("6.- C-K");
        System.out.println("Opción: ");
        r = sc.nextInt();

        return r;
    }

}