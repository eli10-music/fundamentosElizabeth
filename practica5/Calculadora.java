import java.util.Scanner;

public class Calculadora {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int op;
        double x, y, r,s;
        
        do{
            System.out.println("\n1.-Suma");
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicación");
            System.out.println("4.-División");
            System.out.println("5.-Salir");

            System.out.println("Selecciona una opción: ");
            op = sc.nextInt();

            switch(op){
                case 1: //suma
                        x = solicitarOperando();
                        y = solicitarOperando();
                        r = sumar(x,y);

                        System.out.println("El valor de x es: "+x);

                        imprimeResultado(r);
                        break;
                case 2: //REsta
                x = solicitarOperando();
                y = solicitarOperando();
                r = restar(x,y);

                System.out.println("El valor de x es: "+x);

                imprimeResultado(r);
                        break;
                case 3: //Multiplicación
                x = solicitarOperando();
                y = solicitarOperando();
                r = multiplicar(x,y);

                System.out.println("El valor de x es: "+x);

                imprimeResultado(r);
                        break;
                case 4: //Div.
                x = solicitarOperando();
                y = solicitarOperando();
                r = dividir(x,y);

                System.out.println("El valor de x es: "+x);

                imprimeResultado(r);
                        break;
                case 5: System.out.println("Apagando calculadora...");
                        break;
                default: 
                        System.out.println("Opción no válida");
            }
        
        }while(op != 5);

    }

    public static void imprimeResultado(double res){
        System.out.println("El resultado es: "+res);
    }

    public static double solicitarOperando(){
        double x;
        Scanner sc = new Scanner(System.in);

        System.out.print("operando = ");
        x=sc.nextDouble();

        return x;
    }


    public static double sumar( double x, double y ){
        double r;
        
        r = x+y;

        x = 1000;

        return r;
    }

    public static double restar(double x, double y){
        double r;
        
        r = x-y;

        x = 1000;

        return r;

        
    }

    public static double multiplicar(double x, double y){
        double r;
        
        r = x*y;

        x = 1000;

        return r;
        
    }

    public static double dividir(double x, double y){
        double r;
        
        r = x/y;

        x = 1000;

        return r;
        
    }


}