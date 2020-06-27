Algoritmo Ej12
	Definir np Como Entero
	Definir numerosp Como Caracter
	Definir n Como Entero
	Definir suma Como Entero
	
	n <- 1
	suma <- 0
	np <- 1
	numerosp <- ''
	Mientras np<7 Hacer
		
		Para x<-1 Hasta n Hacer
			Si n MOD x=0 Entonces
				suma <- suma+x
			FinSi
		FinPara
		Si suma=n Entonces
			np <- np+1
			
			suma <- 0
		SiNo
			Si suma=0 Entonces
			
			FinSi
		FinSi
	FinMientras
	
	escribir "numeros perfectos",+numerosp;
FinAlgoritmo
