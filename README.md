# DAMM

## Principales tecnologías

* Java + SpringBoot + Appium + Cucumber + TestNG + maven


## Estructura maven

El proyecto se compone de dos módulos maven:

* everis-app-mobile-appium-java-master
* everis-lib-mobile-appium-java-master


## Allure report

Se pueden encontrar los archivos de Allure en la ruta: `target/allure-results`

Esta configurado con un plugin que descarga e inicia el servidor local de Allure para visualizar el reporte.
Simplemente hay que ejecutar el comando:

``` shell
mvn allure:serve
```

Este otro comando genera una carpeta con archivos HTML y CSS, entre otros, para poder visualizarlo sin el servidor activo:

``` shell
mvn allure:report
```

