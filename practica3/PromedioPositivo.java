import java.util.Scanner;

public class PromedioPositivo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=0;
        double prom=0;
        int cont=0;
        double suma=0;
        
        do{
            System.out.print("Ingrese las calificaciones:   ");
            num=sc.nextDouble();

            if(num>0){
                suma=num+suma;
                cont+=1;
                prom=suma/cont;
            }
               
        }
        while(num>0);
       
      
        System.out.print("el promedio es:  "+ prom);
      
       

       } 
    }
        
    
    
    
