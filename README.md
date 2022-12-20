# Spring-P001
Inyección de beans:

La inyección consiste en que el framework cablea los objetos, ahorrándonos tener que crearlos (operador **new**) y unirlos. 

1. Atributo: @Autowired
2. Constructor (Opción más recomendable porque facilita el testing)
	1. Si hay más de un constructor entonces necesita @Autowired
3. Método setter y @Autowired

Resolver qué Bean elegir cuando hay varios Beans candidatos (escenario avanzado):

* @Primary
* @Qualifier

Inyectar valores / propiedades:

* @Value

Escaneo de paquetes:

* @ComponentScan
