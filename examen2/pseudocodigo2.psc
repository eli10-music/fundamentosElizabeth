Algoritmo Problema2
	Definir totaltienda Como Entero
	Definir totalsucursal Como Entero
	Definir cantidadtiendas Como Entero
	Definir ventaempleado Como Entero
	Definir cantidadempleados Como Entero
	Definir totalempresa Como Entero
	Definir i,j,k,f Como Entero
	
	
	Escribir  "ingreza el numero de sucursales"
	Leer cantidadtiendas
	
	Para i<-1 Hasta cantidadtiendas  Con Paso 1 Hacer
		
		Escribir  "ingreza el numero de tiendas en la ciudad",i
		Leer totaltienda
		totalsucursal=0;
		
		Para j<-1 Hasta cantidadtiendas  Con Paso 1 Hacer
			
			Escribir  "ingreza el numero de empleados de la tienda",j,"de la sucursal",i;
			Leer cantidadempleados
			totaltienda=0
			Para k<-1 Hasta cantidadempleados  Con Paso 1 Hacer
				
				Escribir  "ingreza la venta del empleado ", k;
				Leer ventaempleado
				totaltienda=totaltienda+ventaempleado;
			
				
			FinPara
			
			
			totalsucursal=totalsucursal+totaltienda;
			
			
		FinPara
		totalempresa=totalempresa+totalsucursal
		
		
		
	
	
	FinPara
	
	
	Escribir "venta total    ",  totalsucursal
FinAlgoritmo
