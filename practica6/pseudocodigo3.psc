Proceso Ejercicio3
	Definir ac,la Como Real;
	Definir tt Como Entero;
	ac <- 0;
	la <- 10000;
	Repetir
		Escribir '1.-tipo 1';
		Escribir '2.-tipo 2';
		Escribir '3.-tipo 3';
		Escribir '4.-tipo 3';
		Escribir '5.-salir del sistema';
		Escribir '¿ tipo de tarjeta tiene? si no es 1,2 3,  seleccione la opcion 4';
		Leer tt;
		Segun tt  Hacer
			1:
				escribir "su limite actual es ", la;
				Escribir "su nuevo aumento de credito es de 25%";
				ac<-la*1.25;
				Escribir "su credito actual es=   " , ac;
				
			2:
				escribir "su limite actual es ", la;
				Escribir "su nuevo aumento de credito es de 35%";
				ac<-la*1.35;
				Escribir "su credito actual es=   " , ac;	
				
			3:
				escribir "su limite actual es ", la;
				Escribir "su nuevo aumento de credito es de 40%";
				ac<-la*1.45;
				Escribir "su credito actual es=   " , ac;
				
			4:
				escribir "su limite actual es ", la;
				Escribir "su nuevo aumento de credito es de 50%";
				ac<-la*1.50;
				Escribir "su credito actual es=   " , ac;
			5:
				escribir "saliendo del sistema ";
				
		FinSegun
	Hasta Que tt<>5
FinProceso
