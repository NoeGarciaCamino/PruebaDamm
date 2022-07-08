#language: es
@DEMO
Característica: Regresion Damm - Bar Tools

  Antecedentes:
    Dado que abro la aplicacion mobile
    Y que ya estoy registrado
    Entonces hago login con el email y la pass
    Y validar que se accede a la home

  Escenario: Caso8- Flag Consumos
    Dado que accedo al menu de configuración
    Cuando desactivo el flag de consumo
    Y activo el flag de consumo
    Entonces entro al consumo desde el menu lateral


  Escenario: Caso9- Flag Promociones
    Dado que accedo al menu de configuración
    Cuando desactivo el flag de promociones
    Y activo el flag de promociones
    Entonces entro a promociones desde el menu lateral