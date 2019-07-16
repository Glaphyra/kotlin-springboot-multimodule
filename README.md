# Kotlin + Spring Boot + Gradle multimodule project

Proyecto base con múltiples módulos con Kotlin, Spring Boot, gradle y Thymeleaf.

- El proyecto *web* es para los controladores y los htmls. Se utiliza Thymeleaf para la vista y se cargan las propiedades con *application.yml*.
- En el proyecto *connection* se carga un *wsdl* externo al que se hacen peticiones.

Para generar las clases se utiliza *wsdl2java* y para arrancar el proyecto *bootRun*, entrando en localhost