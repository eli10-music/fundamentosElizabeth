import java.util.Scanner;
public class CakculadoraNueva {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int op;
do{
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multiplicacion");
        System.out.println("4.-Dividion");
        System.out.println("5.-Salir");

        
        System.out.print("Selecciona una opcion");
        op= sc.nextInt();
        switch(op){
            case 1: //suma
                    sumar();
                    break;
            case 2: //resta
                    restar();
                    break;
            case 3: //multiplicacion
                    multiplicar();
                    break;
            case 4: //division
                    dividir();
                    break;
            case 5: //sapagar calculadora
                    System.out.println("apagando calculadora");
                    break;

            default:
            System.out.println("opcion no valida");
            
        }
     
}while(op !=5);
}
public static double solicitarOperando(){
    
}
public static void sumar(){
    double a, b, r=0;
    Scanner sc=new Scanner(System.in);

    System.out.println("escribe un numero=   ");
    a= sc.nextDouble();
    System.out.println("escribe un numero=   ");
    b= sc.nextDouble();
    r=a+b;
    System.out.println("resultado=   "+ r);
 


}
public static void restar(){

}
public static void multiplicar(){

}
public static void dividir(){

}


}
