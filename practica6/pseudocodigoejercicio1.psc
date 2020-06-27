Algoritmo Ejercicio1
	Definir a,b,c,at,ar,atotal,precio Como Real
	Definir costo Como Real
	Escribir "escribe el valor del lado a"
	Leer a
	Escribir "escribe el valor del lado b"
	Leer b
	Escribir "escribe el valor del lado c"
	Leer c
	Escribir "¿cuanto cuesta el metro cuadrado?"
	at = b*(a-c)/2
	Leer precio
	ar = c*b
	atotal = at+ar
	costo = atotal*precio
	Escribir  "area total= ", atotal
	Escribir  "costo total del terreno=$",costo,".00"
FinAlgoritmo
