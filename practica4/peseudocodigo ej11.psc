Algoritmo Ej11
	
	Definir n,x,perfecto Como Entero
	leer n
	x=2
	mientras x<=n Hacer
		si n mod x==0 Entonces
		perfecto=perfecto+(n/x)
	FinSi
	x=x+1;
	
FinMientras
si perfecto==n Entonces 
	Escribir "el numero es perfecto"
SiNo
	Escribir "el numero no es perfecto"
FinSi
	
	
	
	
FinAlgoritmo
