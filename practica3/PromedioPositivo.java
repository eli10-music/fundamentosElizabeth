import java.util.Scanner;

public class PromedioPositivo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=0;
        double prom=0;
        int cont=0;
        double cal;
        double suma=0;
        do{
            System.out.print("Ingrese las calificaciones:   ");
            num=sc.nextDouble();
            
            cont+=1;
            suma=num+suma;
            prom=suma/cont;
           
        }
        while(num>0);
       
            
        
       

        System.out.print("el promedio es:  "+ prom);
       System.out.print("cantidada de numeros:  "+ cont);
       System.out.print("numeros:  "+ num);

       } 
    }
        
    
    
    
