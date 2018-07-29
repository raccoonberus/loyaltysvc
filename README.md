# loyalty svc

### How to run

* Create **~/.loyaltysvc/datasource.properties** with content like this:

    ```
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.datasource.url=jdbc:postgresql://localhost:25532/loyalty_svc
    spring.datasource.username=root
    spring.datasource.password=12345678
    ```
* Open terminal in project dir and run

    ```
    mvn clean package -DskipTests=true
    java -jar target/loyaltysvc-1.0-SNAPSHOT.jar
    ```
    
    or check commands in **bin/run-war.sh** - it helps you run app with tomcat.

### General information

* **Generator strategy** - define rules for code identifier concatenation.
* **Code type** - determines the name and lifetime for codes.