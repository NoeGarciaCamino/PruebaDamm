#language: es
@DEMO
Característica: Regresion Damm - Login

  Antecedentes:
    Dado que abro la aplicacion mobile

#  @PincodeNoValido
#  Esquema del escenario: Outline: caso1- Alta pincode no válido
#    Dado que busco el nuevo video "<video>"
  Esquema del escenario: Caso1- Alta pincode no válido
    Dado que registro mi establecimiento
    Cuando informo el pincode "<pincode>" invalido
    Entonces validar que aparece un mensaje de error indicando que el pincode no es valido

    Ejemplos:
      | pincode |
      | 1234    |

  Esquema del escenario: Caso2- Log in - user activo
    Dado que ya estoy registrado
    Cuando hago login con el email "<email>" y la pass "<pass>"
    Entonces validar que se accede a la home

    Ejemplos:
      | email                            | pass        |
      | automated.testing.bm+2@gmail.com | Damm2023!   |