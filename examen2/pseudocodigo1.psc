Algoritmo Problema1
	Definir h,d,areacir,areatri Como Real
	Definir altura,areatotaltri Como Real
	Definir areatotalcir,sumaarea,cateto,r Como Real
	Escribir 'ecribe la medida del diametro=  '
	Leer d
	Escribir 'escribe la medida de la hipotenusa'
	Leer h
	r <- d/2
	cateto <- (h^2)+(r^2)
	altura <- rc(cateto)
	areatri <- (r*altura)/2
	areatotaltri <- areatri*2
	areacir <- PI*r^2
	areatotalcir <- areacir/2
	sumaarea <- areatotaltri+areatotalcir
	Escribir 'el area total es=   ',sumaarea
FinAlgoritmo
