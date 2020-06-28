import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        int totalTienda=0;
        int totalSucursal=0;
        int cantidadTiendas;
        int ventaEmpleado;
        int cantidadEmpleados=0;
        int totalEempresa=0;
        int cantidadsucursales;
         
        System.out.print("ingreza el numero de sucursales    ");
        cantidadsucursales=sc.nextInt();


 
        
        // proceso
        for (int i = 1; i <= cantidadsucursales; i++) {
        System.out.println("ingreza el numero de tiendas en la ciudad     "+ i);
        totalTienda=sc.nextInt();

            totalSucursal = 0;

            for (int j = 1; j <= totalTienda; j++) {
            System.out.println("Ingresa el numero de empleados de la tienda " + j + " de la sucursal " + i);
            cantidadEmpleados=sc.nextInt();
               
                totalTienda = 0;

                for (int k = 1; k <= cantidadEmpleados; k++) {
                    System.out.println("Ingresa la venta del empleado     "+k );
                    ventaEmpleado = sc.nextInt();
                   
                    totalTienda =totalTienda+ ventaEmpleado;
                }
                totalSucursal =totalSucursal+ totalTienda;
    
    }
   totalEempresa= totalEempresa + totalSucursal;






    
    }
System.out.println("Venta Total " + totalSucursal);

}}