# App Engine Flexible & Spring Boot Frameworks & Java

## Build with Maven

### Building the project

To build the project:

    mvn clean package

To build the project without tests:

    mvn clean package -DskipTests

To build the project whit a specific profile:

    mvn clean package -DskipTests -Plocal   
    
### Spring Boot configurations

Para ejecutar el proyecto localmente es necesario autenticarse ante GCLOUD, para poder acceder al Datastore desde el ambiente local:

    gcloud beta auth application-default login

Para ejecutar el proyecto localmente :

    mvn spring-boot:run

Para desplegar el proyecto en App Engine [develop]:

    mvn appengine:deploy

Para desplegar el proyecto en App Engine [sandbox]:

    mvn appengine:deploy -Dapp.stage.appEngineDirectory=src/main/appengine/sandbox

Para desplegar el proyecto en App Engine [production]:

    mvn appengine:deploy -Dapp.stage.appEngineDirectory=src/main/appengine/production
