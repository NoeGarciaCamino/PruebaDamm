#language: es
@DEMO
Característica: Regresion Damm - Settings

  Antecedentes:
    Dado que abro la aplicacion mobile

  Esquema del escenario: Caso3- Cambio contraseña
    Dado que ya estoy registrado
    Cuando hago login con el email y la pass
    Y validar que se accede a la home
    Y cambio la pass antigua por la pass nueva "<passNueva>"
    Entonces hago logout y login con el email y la pass nueva "<passNueva>"

    Ejemplos:
      | passNueva |
      | Damm2024! |