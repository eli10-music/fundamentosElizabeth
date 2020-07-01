Proceso Ejercicio5
	Definir n,cn,v,t1,t2,t3,tt Como Real;
	Definir a,b,c Como Entero;
	Escribir 'ingreza el numero de ventas';
	Leer n;
	a <- 0;
	b <- 0;
	c <- 0;
	v <- 0;
	cn <- 0;
	t3 <- 0;
	t2 <- 0;
	t1 <- 0;
	tt <- 0;
	Mientras cn<n Hacer
		Escribir 'monto de la venta';
		Leer v;
		Si v>1000 Entonces
			a <- a+1;
			t1 <- t1+v;
		SiNo
			Si v>500 Entonces
				b <- b+1;
				t2 <- t2+v;
			SiNo
				c <- c+1;
				t3 <- t3+v;
			FinSi
		FinSi
		tt <- tt+v;
		cn <- cn+1;
	FinMientras
	Escribir 'las ventas  '  ,  a  ,  ' y el total de ventas 1 es:   ',t1;
	Escribir 'las ventas  '  ,  b  ,  '  y el total de ventas 2 es:   ',t2;
	Escribir 'las ventas   ' ,c   , ' y el total de ventas 3 es:   ',t3;
	Escribir 'el total de ventas es:   ',tt;
FinProceso
