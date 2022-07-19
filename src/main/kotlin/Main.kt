fun main(args: Array<String>) {
    println("WELCOME TO MARS!")

    var myRover = RoverMO()
    var roberBO = RoverBO()
    var salir = "N"
    println("-*-*--*-*-*-*-****-----*-*-******---------*-*-*-*-*-*-*-******------*-*-***-------*-*-")

    while (salir!="S") {
        println("Introduce la secuencia de comandos")
        println("Movimientos efectuados. Posición final = ${roberBO.startTrip(readLine().toString(), myRover)}")

        println("Si quieres salir pulsa la tecla 'S', para continuar pulsa INTRO")
        salir = readLine().toString()
    }
}