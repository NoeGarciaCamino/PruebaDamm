#language: es
@DEMO
Característica: Regresion Damm - Settings

  Antecedentes:
    Dado que abro la aplicacion mobile

  Esquema del escenario: Caso3- Cambio contraseña
    Dado que ya estoy registrado
    Cuando hago login con el email "<email>" y la pass "<pass>"
    Y validar que se accede a la home
    Y cambio la pass antigua "<pass>" por la pass nueva "<passNueva>"
    Entonces hago logout y login con el email "<email>" y la pass nueva "<passNueva>"

    Ejemplos:
      | email                            | pass        | passNueva |
      | automated.testing.bm+2@gmail.com | Damm2023!   | Damm2024! |