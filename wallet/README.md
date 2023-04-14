# Billetera


## Imagen de Docker
Se encuentra creado el archivo Dockerfile para la creacion de una imagen del servidor.

### Creación de la imagen
En un terminal ubicado en la raiz del proyecto correr el comando:

` docker build --tag wallet:latest . `

### Creación de un container y ejecución
Posteriormente a haber creado la imagen del servidor se podra crear un contenedor y levantarlo con el siguiente comando:

` docker run --name Billetera -p 8001:8001 walet:latest `

De esta manera se creará y correra un contenedor de la imagen `wallet` con el nombre `Billetera`
