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

