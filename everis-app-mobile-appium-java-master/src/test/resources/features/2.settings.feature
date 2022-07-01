#language: es
@DEMO
Característica: Regresion Damm - Settings

  Antecedentes:
    Dado que abro la aplicacion mobile

  Escenario: Caso3- Cambio contraseña
    Dado que ya estoy registrado
    Cuando hago login con el email y la pass
    Y validar que se accede a la home
    Y cambio la pass antigua por la pass nueva
    Entonces hago logout y login con el email y la pass nueva
