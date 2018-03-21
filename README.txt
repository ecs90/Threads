CUANTOS CONSUMIDORES SE NECESITAN PARA QUE EL STOCK LLEGUE A 0?

Un unico consumidor es suficiente en una relacion 1:1. Mientras mas consumidores hallan en relacion a productores, mas rapido podria llegar a decrecer el stock y mas rapidamente se llegaria a 0, pero se corre el riego de llegar a un stock negativo dado a que por la velocidad en la que trabajan los procesos se podrian ejecutar dos consumidores en paralelo. Por lo que, lo mas beneficioso seria un unico consumidor

POR QUE LOS BLOQUES SYNCHRONIZED DEBEN SERLO?

Si no ponemos los Synchronized los valores del contador no se corresponderian a aumento y decremento del stock. Al printear la salida de los elementos vemos que con Synchronized aumentan y disminuyen en orden, mientras que sin este los valores respetan cuando entro por un lado y cuando salen por el otro, pero entre ellos no hay "sincronia". Por eso deben ser asi, para mantener efectivamente la relacion de aumento y disminucion del stock

EXPLICAR RECURSO COMPARTIDO

Un recurso compartido es un componente de la computadora que puede ser accedido por mas de un proceso a la vez. Se dice compartido porque lo pueden usar ambos en simultaneo

EXPLICAR LAS 3 FORMAS DE INSTANCIAR UN THREAD

1) La clase que queremos que trabaje como hilo la hacemos heredar de thread, de esta forma tiene todos los metodos de su clase padre.

2) Implementamos la interfaz Runneable en nuestra clase que queremos que se comporte como un thread y sobreescribimos el metodo run() para que adquiera el comportamiento de Thread

3) Realizamos una clase anonima que utilice el constructor de Thread, al cual le pasamos Runneable y sobreescribimos el metodo run. (
Thread thread = new Thread(new Runnable() {@Override public void run() {etc}}});
)