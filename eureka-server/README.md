# Servidor Eureka


## Imagen de Docker
Se encuentra creado el archivo Dockerfile para la creacion de una imagen del servidor.

### Creación de la imagen
En un terminal ubicado en la raiz del proyecto correr el comando:

` docker build --tag eureka-server:latest . `

### Creación de un container y ejecución
Posteriormente a haber creado la imagen del servidor se podra crear un contenedor y levantarlo con el siguiente comando:

` docker run --name ServidorEureka -p 8761:8761 eureka-server:latest `

De esta manera se creará y correra un contenedor de la imagen `eureka-server` con el nombre `ServidorEureka`
