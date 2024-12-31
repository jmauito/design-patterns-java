# design-patterns
Ejercicios de aplicación de los patrones de diseño

## Description
Ejemplos de la aplicación de los Patrones de diseño que voy explorando y aprendiendo a través de diferentes fuentes. Según voy estudiando algún patrón en particular pongo su ejemplo aquí.

## Organización del proyecto
El lenguaje utilizado es Java 17.

Encontrará un paquete por cada patrón estudiado. Estos paquetes tendrán otro paquete llamado ```main``` en donde estará un
ejecutable del ejemplo y un paquete que encapsula el patrón.
Además, en el paquete ```test``` se implementa una clase de pruebas para cada patrón de diseño.

## Patrones 

### Singleton
El objetivo del patrón singleton es tener solo una instancia de un objeto durante todo el tiempo de ejecución.

#### Caso de uso
Como usuario, quiero que el nombre de mi empresa y mi correo electrónico esté disponible para todas las 
interfaces de mi sistema.

Se decide levantar una clase Company de tipo Singleton, es decir, no importa cuántas veces se 
instancie la clase, siempre devolverá la misma Compañía. Así, siempre se tendrá "a la mano" la información de la compañia 
y se evita el riesgo de que sus datos cambien por error.

#### Fuente de la información:
Este ejemplo se desarrolló luego de analizar el siguiente vídeo del Máster en Ingeniería Web de la Universidad Politécnica de 
Madrid:
https://youtu.be/PZ_fM3qCkc4?si=YzaJb1smXYVPG4ik&t=4518

### Composite
El objetivo es crear estructuras en árbol. En una estructura de árbol se tienen dos tipos de nodos: la hoja que tiene un 
valor final y que ya no tiene hijos, y, el compuesto (yo le llamo rama) que tiene hijos. El problema aquí es que todos 
son nodos, pero tienen diferentes responsabilidades.

#### Caso de uso
Se necesita crear una calculadora de expresiones aritméticas agrupadas por paréntesis, por ejemplo, una calculadora para 
resolver: (((5+8)-3)*2)/4 = 5

Se utiliza el patrón composite para crear una estructura en árbol en donde se puedan agrupar operaciones y los números a
operar.

#### Fuente de la información
El ejemplo y la información sobre el patrón fueron obtenidos del siguiente vídeo del Máster en Ingeniería Web de la 
Universidad Politécnica de Madrid:
https://youtu.be/6cMsvs_PkSI?si=romXcFU3WJoRFear

### Builder
Su objetivo es reemplazar constructores con demasiados parámetros o demasiados constructores. Además, permite evitar el 
acoplamiento secuencial.

#### Caso de uso
Tenemos una clase Article que tiene las siguientes propiedades: id que es obligatorio, lista de teléfonos de contacto, 
referencias, descripción, precio al por menor, stock, tags y precio al por mayor.
Solo el campo id es obligatorio, por lo tanto, un constructor con todos las propiedades resultaría en un método con exceso
de parámetros que obliga al usuario de la clase a conocer de memoria el orden de los parámetros, a esto se lo llama acoplamiento
secuencial. Otra solución sería crear una serie de constructores, pero, la combinación de posibles valores a registrar sería gigante.

Es aquí en donde el patrón builder nos ofrece una solución. Con este patrón se pueden encadenar métodos de la clase que
a la manera de setters registran los valores a las propiedades. Por lo tanto, se crea una clase Builder que nos permita
construir el objeto con las propiedades que necesitemos y en el orden que más nos convenga. Los Builder también pueden 
tener propiedades obligatorias pero no es común. Además si muchas propiedades son obligatorias, se pierde el objetivo del
Builder.

Los Builders son muy útiles al momento de los test, pues nos permiten poblar solo las propiedades que son necesarias para
las pruebas. Así como lo demuestran los ejemplos planteados en este proyecto.

La clase Builder puede ser una clase independiente o puede ser un elemento de la clase. En el ejemplo, el Builder está 
embebido en la clase. Considero que, aunque es un poco extraño tener una clase dentro de otra clase, permite generar el 
builder como un propio elemento de la clase y su sintaxis para usarlo queda muy bien, al estilo Lombok.

#### Fuente de información
El ejemplo y la información fueron obtenidos del siguiente vídeo del Máster en Ingeniería Web de la Universidad Politécnica
de Madrid: https://youtu.be/mWxB7at5lzo?si=T4EFW8pTlfLb4aBa

### Patrón Decorator
Permite extender la lógica a una clase sin tocar la clase. Es una alternativa a la herencia, porque si tienes muchas 
combinaciones, el árbol de herencia crece demasiado.

Imagina que tienes tres entidades: X,Y,Z que se pueden combinar entre ellas. Una solución sería crear una clase abstracta 
base y luego crearíamos las clases para cada entidad, a continuación deberíamos crear unas subclases con todas las 
combinaciones posibles. En total unas once clases.

Para estos casos, utilizamos el patrón decorador en donde, una clase A puede ser "envuelta" por una clase B, así la clase 
B podría "decorar" las propiedades y métodos de la clase A agregando más funcionalidades. Si esta clase B, a su vez puede 
ser "envuelta" por otra clase C, se pueden agregar más funcionalidades. En el ejemplo anterior, para obtener todas las 
combinaciones posibles solo necesitaríamos cinco clases.

#### Caso de uso
Se necesita crear un sistema de venta de automóviles. A los automóviles se les puede agregar los extras que el comprador 
pida. Al final, el sistema deberá mostrar el auto con la descripción de todos los extras agregados y el precio final.
Los resultados esperados son los siguientes:

- Solo el auto que cuesta 14000: Chevrolet Aveo Value: 14000.0
- El auto con un GPS que cuesta 100: Chevrolet Aveo + GPS. Value: 14100.0
- El auto con un GPS (valor: 100), un Radio (valor 300): Chevrolet Aveo + GPS + Radio with Bluetooth. Value: 14400.0
- El auto con un GPS (100), Radio(300) y sistema EDS(500): Chevrolet Aveo + GPS + Radio with Bluetooth + EDS. Value: 14900.0

Utilizaremos el patrón decorador para crear el auto base, utilizaremos un decorador para agregar los extras. Los objetos
decoradores podrán agregar a su descripción, la descripción del componente que envuelven y sumar su valor con el valor de
su componente. Así se obtendrá el resultado esperado.

#### Fuente de información
La información sobre el patrón y el ejemplo propuesto fue obtenido del siguiente vídeo del Máster en Ingeniería Web de la 
Universidad Politécnica de Madrid: https://youtu.be/RlWT2rNDnUA?si=gHcDYvM-Rvr6Z2iJ&t=462

### Patrón State
El objetivo es permitir que un objeto cambie su comportamiento cada vez que cambie su estado interno. El objeto cambia 
según los estados. El cliente solo ve al contexto que es la clase pública. El cliente llama a los métodos, pero el comportamiento
de los métodos cambia según el estado en el que se encuentra el objeto. ¡El polimorfismo en toda su expresión!

#### Caso de uso
Se busca implementar todos los estados de una conexión TCP y simular todos los cambios de estado que son posibles.
Ejemplo: al crear una conexión, el estado es CLOSED, al ejecutar el método open, la conexión pasa al estado READY.
Desde el estado READY podemos enviar mensajes, detener el flujo de mensajes, cerrar la conexión.

Si desde el estado READY enviamos un mensaje, el estado cambiará a WAITING hasta que el mensaje sea entregado completamente,
en este estado, podemos detener el envío de paquetes lo que haría que el objeto cambie su estado a STOPPED, desde el
estado STOPPED, podemos iniciar nuevamente la comunicación lo que hará que el objeto vuelva al estado READY.

Como vemos, hay muchas maneras diferentes de comportamiento del objeto, pero, este comportamiento depende del estado del mismo.

Aquí es óptimo utilizar el patrón State, en donde crearemos una clase de Contexto que será visible por el cliente que tiene
como propiedad una clase Estado que guarda el estado actual del objeto. Esta clase Contexto permitirá al cliente ejecutar 
métodos, pero el método cambiará según el estado que se tenga.
Los estados heredan de una clase abstracta que garantiza que todos los estados compartan los mismos métodos.

#### Fuente de información
La información y el ejemplo están disponibles en el siguiente vídeo del Máster de Ingeniería Web de la Universidad Politécnica
de Madrid: https://www.youtube.com/watch?v=gYWnOskeED4 

### Patrón Facade
El patrón fachada tiene como objetivo no exponer lógica compleja de los sistemas, sino, crear una interfaz única que 
muestre solo las funciones necesarias para la aplicación a desarrollar. Es decir, si tenemos unos servicios muy complejos 
que son necesarios para realizar una operación, podemos crear una fachada que solo utilice los métodos o realice las 
operaciones que son necesarias dentro de nuestra aplicación.

#### Caso de uso
Se necesita integrar la lectura de unos archivos XML en la nueva aplicación. 

Técnicamente, la solución es agregar una librería de terceros, para el ejemplo se utilizó JAXB. Pero esta librería tiene
muchas más funcionalidades además de la lectura de un XML. Al necesitar únicamente la lectura del XML, se creó una clase 
XMLReader que es la fachada de todo el conjunto de clases de JAXB. Además, se agregó un a excepción personalizada para 
identificar los errores que provengan de la lectura del XML.

Siempre se debe utilizar una fachada cuando se utiliza una librería de terceros porque solo se utilizan ciertas funcionalidades
de estas librerías y no todas. Al crear nuestra fachada, el análisis de la librería se la realizará una sola vez y las
implementaciones de la misma quedarán disponibles en métodos que estén alineados al dominio propio de la aplicación. 
Además, gracias a la fachada la librería puede ser reemplazada más fácilmente que si la utilizáramos directamente en 
nuestro código.

#### Fuente de información
La información analizada está disponible en el siguiente vídeo del Máster de Ingeniería Web de la Universidad Politécnica
de Madrid: https://youtu.be/iV2nYhUi9cQ?si=FlokZKjzVEYBHzCa&t=555

### Patrón Abstract Factory
Su objetivo es crear una fábrica de objetos agrupados que se relacionan de alguna manera.

#### Caso de uso
En un banco se quiere crear tres tipos de cuenta, cada uno con su tasa de interés,
su tarjeta de débito con saldo y una tarjeta de crédito con su saldo y su monto máximo.
Para este caso se creará una fábrica para cada tipo de paquetes de cuenta y con ellos
crearemos los tres objetos, uno para la cuenta, otro para la tarjeta de débito y otro 
para la tarjeta de crédito.

#### Fuente de información
Tanto la información como el ejemplo se lo tomó del siguiente vídeo del Máster en Ingeniería
Web de la Universidad de Madrid: https://www.youtube.com/watch?v=iV2nYhUi9cQ&t=888s 

