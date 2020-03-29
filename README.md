# Arquetipo Spring - Simple

Arquetipo simple con Spring mediante configuracion en Java. Incluye:

- Carga de parametros de configuracion mediante archivo properties (src/main/resources/config.properties)
- Gestion de Logs con Log4j2 (src/main/resources/log4j2.properties)
- Internacionalizacion de mensajes (implementado es_ES y en_EN)
- Implementacion de configuracion por perfiles (log, variables)
- Perfiles existentes: dev, prod

## Configuracion de lanzadores

- **Clean install**: mvn clean install -P<nombreProfile>
- **Run**: mvn exec:java -Dexec.mainClass="com.jrg.archetype.spring.simple.main.Main" -P<nombreProfile>

## Versiones

- Java: 1.8
- Spring: 5.2.5.RELEASE
- Log4j2: 2.8.2
- Lombok: 1.16.16

## Changelog

0.0.rc02 - Implementacion perfiles configuracion
0.0.rc01 - Version inicial