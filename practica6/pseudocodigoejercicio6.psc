SubProceso imprimeResultado(res)
	Escribir 'el resultado es :',res;
FinSubProceso

SubProceso h <- solicitarOperando()
	Definir x,h Como Real;
	Escribir 'operando= ';
	Leer x;
	h <- x; // retorna el doble
FinSubProceso

SubProceso l <- suma (x,z)
	Definir r Como Real;
	r <- x+z;
	x <- 1000;
FinSubProceso

SubProceso l <- resta (x,z)
	Definir r Como Real;
	r <- x-z;
	x <- 1000;
	l <- r;
FinSubProceso

SubProceso l <- multiplicacion (x,z)
	Definir r Como Real;
	r <- x*z;
	x <- 1000;
	l <- r;
FinSubProceso

SubProceso l <- division (x,z)
	Definir r Como Real;
	r <- x/z;
	x <- 1000;
	l <- r;
FinSubProceso

SubProceso l <- factorial (x)
	r <- 1;
	Para i<-1 Hasta x Hacer
		r <- r*i;
	FinPara
	l <- r;
FinSubProceso

SubProceso l <- combinacion (x,z)
	Definir r,q,w,t Como Real;
	q <- factorial(x);
	w <- factorial(z);
	t <- factorial(x-z);
	r <- q/(w*(t));
	l <- r;
FinSubProceso

SubProceso l <- exponente(x)
	Definir r,q,w,t Como Real;
	r <- 1;
	Para i<-1 Hasta 50 Hacer
		q <- x^i;
		w <- factorial(i);
		z <- q/w;
		r <- r+z;
		l <- r;
	FinPara
FinSubProceso

Proceso Ejercicio6
	Definir op Como Entero;
	Definir x,z,r, l Como Real;
	Repetir
		Escribir '1.-suma';
		Escribir '2.-resta';
		Escribir '3.-multiplicacion';
		Escribir '4.-division';
		Escribir '5.-factorial';
		Escribir '6.-combinaciones';
		Escribir '7.-exp(x)';
		Escribir '8.-Salir';
		Escribir 'selecciona una opcion:  ';
		Leer op;
		Segun op  Hacer
			1:
				x <- solicitarOperando();
				l <- suma(x,z);
				Escribir 'el valor de x es ',x;
				imprimeResultado(l);
			2:
				x <- solicitarOperando();
				z <- solicitarOperando();
				l <- resta(x,z);
				Escribir 'el valor de x es ',x;
				imprimeResultado(l);
			3:
				x <- solicitarOperando();
				z <- solicitarOperando();
				l <- multiplicacion(x,z);
				Escribir 'el valor de x es ',x;
				imprimeResultado(l);
			4:
				x <- solicitarOperando();
				z <- solicitarOperando();
				l <- division(x,z);
				Escribir 'el valor de x es ',x;
				imprimeResultado(l);
			5:
				x <- solicitarOperando();
				l <- factorial(x);
				Escribir 'el valor de x es ',x;
				imprimeResultado(l);
			6:
				x <- solicitarOperando();
				z <- solicitarOperando();
				l <- combinacion(x,z);
				Escribir 'el valor de x es ',x;
				imprimeResultado(l);
			7:
				x <- solicitarOperando();
				l <- exponente(x);
				Escribir 'el valor de x es ',x;
				imprimeResultado(r);
		FinSegun
		Escribir 'Presione enter para continuar';
		Esperar Tecla;
	Hasta Que op=8
FinProceso
