Proceso Ejercicio2
	Definir n,tarjeta,hamburguesa,x Como Entero;
	Definir total Como Real;
	total <- 0;
	Escribir 'cuantas hamburguesas desea comprar';
	Leer n;
	Para x<-1 Hasta n Hacer
		Escribir 'selecciona el numero de tipo de hamburguesa';
		Escribir '     1.-s SEncilla $20.00';
		Escribir '     2.-d doble $25.00';
		Escribir '     3.-s triple $28.00';
		Leer hamburguesa;
		Segun hamburguesa  Hacer
			1:
				total <- total+20;
			2:
				total <- total+25;
			3:
				total <- total+28;
			De Otro Modo:
				Escribir 'ese numero no existe en el menu';
		FinSegun
	FinPara
	Escribir 'elige el tipo de pago';
	Escribir '    1.-Efectivo';
	Escribir '    2.-tarjeta de credito o debito';
	Leer tarjeta;
	Segun tarjeta  Hacer
		1:
			Escribir 'el total a pagar es de',total,'pesos';
		2:
			total <- total+(total*0.5);
			Escribir 'el total a pagar es de:  ',total,'  pesos';
		De Otro Modo:
			Escribir 'elije un numero correcto';
	FinSegun
FinProceso
