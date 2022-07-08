#language: es
@DEMO
Característica: Regresion Damm - Settings

  Antecedentes:
    Dado que abro la aplicacion
    Y que ya estoy registrado
    Entonces hago login con el email y la pass
    Y validar que se accede a la home

  Escenario: Caso3- Cambio contraseña
    Dado que accedo al menu de configuración
    Cuando cambio la pass antigua por la pass nueva
    Entonces hago logout y login con el email y la pass


  Escenario: Caso4- Cambio de idioma
    Dado que accedo al menu de configuración
    Cuando accedo a idiomas
    Entonces cambio el idioma de la aplicación
    Y reestablezco el idioma por defecto