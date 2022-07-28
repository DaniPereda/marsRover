package infra.comunicator

import domain.Communicator
import domain.Position
import domain.Size

class ConsoleComunicator() : Communicator {
    override fun retrieveOrders(): String {
        println("Indique las ordenes a ejecutar")
        return readLine().toString()
    }

    override fun retrieveInitialPosition(): Position {
        println("Welcome to the landing rover comunicator")
        println("Please, enter X value")
        val x = readLine()!!.toInt()
        println("Please, enter Y value")
        val y = readLine()!!.toInt()

        return Position(x, y)
    }

    override fun retrieveInitialRowDirection(): String {
        println("Please, Enter the rover facing direction (N-S-E-W)")
        return readLine().toString()
    }



    override fun retrieveSizeMap(): Size {

    }
}