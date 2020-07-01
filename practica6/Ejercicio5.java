import java.util.Scanner;

import javafx.scene.layout.VBox;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double cn=0,v=0,t1=0,t2=0,t3=0,tt=0;
        int a=0,b=0,c=0, n;

        System.out.print("ingreza el numero de ventas=   ");
        n=sc.nextInt();

        while(cn<n){
            System.out.println("ingreza el monto de la venta=  ");
            v=sc.nextDouble();

            if(v>1000){
                a=a+1;
                t1=t1+v;
            }else{
        if(v>500){
            b=b+1;
            t2=t2+v;
        }else{
            c=c+1;
            t3=t3+v;
        
        }
                }
                tt=tt+v;
                cn=cn+1;
            }

            System.out.println("las ventas mayores a $1000 son  "+a+  "   y el total   "+t1);
            System.out.println("las ventas mayores a $500.00 pero menores o iguales a $1000.00 son   "   +b+  "    y el total   "+t2);
            System.out.println("las ventas menores o iguales a $500.00 son    "  +c+  "   y el total   "+t3);
            System.out.println("el total de ventas es=    "+tt);


        }



    
    }

    
