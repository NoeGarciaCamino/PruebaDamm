#language: es
  #Hola
@DEMO
Característica: Regresion Damm - Bar Manager

Antecedentes:
Dado que abro la aplicacion mobile

Esquema del escenario: Caso4- Cambio establecimiento
  Dado que ya estoy registrado
  Cuando hago login con el email "<email>" y la pass "<pass>"
  Y validar que se accede a la home
  Entonces cambio de establecimiento

  Ejemplos:
    | email                            | pass        |
    | automated.testing.bm+2@gmail.com | Damm2023!   |