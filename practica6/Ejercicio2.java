import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,tarjeta,hamburguesa,x;
        double total=0;

        System.out.println("cuanta hamburguesas quieres");
        n=sc.nextInt();

        for(x=1;x<=n;x++){
            System.out.println("selecciona el numero de tipo de hamburguesa");
            System.out.println("   1.-sencilla $20.00 ");
            System.out.println("   2.-doble $25.00 ");
            System.out.println("   3.-triple $28.00 ");
            hamburguesa=sc.nextInt();

            switch(hamburguesa){
                case 1:
                total=total+20;
                break;

                case 2:
                total=total+25;
                break;

                case 3:
                total=total+28;
                break;

                

            }
          

           


        }
        System.out.println("elige el tipo de pago");
        System.out.println("    1.-Efectivo");
        System.out.println("    2.-Tarjeta de debito o credito");
        tarjeta=sc.nextInt();

        switch(tarjeta){
            case 1:
            System.out.println("el total a pagar es de   "+total+"  pesos");
            break;
            case 2:

            total=total+(total*0.5);
            System.out.println("el total a pagar es de  "+ total+"  pesos");
            break;

            


        }



        
    }
    
}