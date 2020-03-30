# Arquetipo Spring - Simple

Arquetipo simple con Spring mediante configuracion en Java. Incluye:

- Carga de parametros de configuracion mediante archivo properties (src/main/resources/config.properties)
- Gestion de Logs con tinyLog con posibilidad de configuracion de perfiles
- Internacionalizacion de mensajes (implementado es_ES y en_EN)
- Implementacion de configuracion por perfiles (log, variables)
- Perfiles existentes: dev, prod
- Manejador AOP para excepciones

## Configuracion de lanzadores

- **Clean install**: mvn clean install -PnombreProfile
- **Run**: mvn exec:java -Dexec.mainClass="com.jrg.archetype.spring.simple.main.Main" -PnombreProfile
- **Clean install + run**: mvn clean install exec:java -Dexec.mainClass="com.jrg.archetype.spring.simple.main.Main" -PnombreProfile 

## Versiones

- Java: 1.8
- Spring: 5.2.5.RELEASE
- TinyLog: 2.0.0-RC1
- Lombok: 1.16.16

## Changelog

0.0.rc03 - Implementacion tinyLog con perfiles condifguracion
0.0.rc02 - Implementacion perfiles configuracion
0.0.rc01 - Version inicial