Algoritmo Ej12
	Definir np Como Entero
	Definir numerosp Como Caracter
	Definir n Como Entero
	Definir suma Como Entero
	n <- 1
	suma <- 0
	np <- 1
	numerosp=""
	
	Mientras np<7 Hacer
		Para x=1 Hasta n Con Paso 1 Hacer 
			si n MOD x=0 
				suma=suma+x;
				
			FinSi

		FinPara
		
		si suma=n
			np=np+1;
			numerosp=numerosp+suma+",";
			suma=0;
		FinSi
	FinMientras
FinAlgoritmo
