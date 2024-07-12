# Spring Boot Frameworks & Java

## Build with Maven

### Building the project

To build the project:

    mvn clean package

To build the project without tests:

    mvn clean package -DskipTests

To build the project whit a specific profile:

    mvn clean package -DskipTests -Plocal