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

  Escenario: CasoPrueba- Cambio de email
    Dado que accedo al menu de configuración
    Y accedo al email
##  ##### Esta hecho para que le añada/quite un punto antes de la arroba @
##  ##### Quiza cambiar tactica en ReadProperties por +numero, por ejemplo +10@
    Cuando cambio el email antiguo por el nuevo email
    Y recibo y valido el email
    Entonces hago logout y login con el email y la pass