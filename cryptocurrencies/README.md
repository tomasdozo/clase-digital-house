# Crypto Monedas


## Imagen de Docker
Se encuentra creado el archivo Dockerfile para la creacion de una imagen del servidor.

### Creación de la imagen
En un terminal ubicado en la raiz del proyecto correr el comando:

` docker build --tag cryptocurrencies:latest . `

### Creación de un container y ejecución
Posteriormente a haber creado la imagen del servidor se podra crear un contenedor y levantarlo con el siguiente comando:

` docker run --name CryptoMonedas -p 8002:8002 cryptocurrencies:latest `

De esta manera se creará y correra un contenedor de la imagen `cryptocurrencies` con el nombre `CryptoMonedas`
