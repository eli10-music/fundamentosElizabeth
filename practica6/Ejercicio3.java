import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ac=0;
        double la=10000;
        int tt;



       


do{  

    System.out.println("\n1.-tipo 1");
    System.out.println("2.-tipo 2");
    System.out.println("3.-tipo 3");
    System.out.println("4.-tipo 4");
    System.out.println("5.-salir");
    

   

    System.out.println("¿que tipo de tarjeta tiene? si no es 1,2 3,  seleccione la opcion 4");
    tt=sc.nextInt();



        switch(tt){
            case 1:


             System.out.println("su limite actual es   "+la);
            System.out.println("su nuevo aumento de credito es del 25%");
        

            ac=la*1.25;
            System.out.println("su credito actual es =  "+ac);

            break;
            case 2:
            System.out.println("su limite actual es   "+la);
            System.out.println("su nuevo aumento de credito es del 35%");
            ac=la*1.35;
            System.out.println("su credito actual es =  "+ac);
            

            break;
            
            case 3:
            System.out.println("su limite actual es   "+la);
            System.out.println("su nuevo aumento de credito es del 40%");
            ac=la*1.40;
            System.out.println("su credito actual es =  "+ac);
            

            break;

            case 4:
            System.out.println("su limite actual es   "+la);
            System.out.println("su nuevo aumento de credito es del 50%");
            ac=la*1.5;
            System.out.println("su credito actual es =  "+ac);
            

            break;

            case 5:
            System.out.println("saliendo  del sistema");

             break;

        }

    }while(tt!=5);

    }
    
}