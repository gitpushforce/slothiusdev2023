FROM amazoncorretto:17.0.8-alpine3.18
# deja q el puerto 8081 se pueda ver desde fuera
# ( para q cuando se haga docker run se use -p {puerto q quiere q se vea desde fuera}:8081 )
EXPOSE 8081
# crea una variable con la direccion del archivo jar,
# ya q estoy poniendo el jar en la misma carpeta q Docker, el valor es ./archivo.jar
ARG JAR_FILE=./slothiusdev.jar
# anade el archivo jar dentro del contenedor y lo pone de nombre app.jar
ADD ${JAR_FILE} app.jar
# executa el archivo jar dentro del contenedor
ENTRYPOINT ["java","-jar","app.jar","-Xms8m","-Xmx25m"]