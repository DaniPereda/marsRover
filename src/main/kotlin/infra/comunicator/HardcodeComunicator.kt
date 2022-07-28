package infra.comunicator

import domain.Communicator
import domain.Position
import domain.Size

class HardcodeComunicator() : Communicator {
    override fun retrieveOrders(): String {
        return "MMMLMMRM"
    }

    override fun retrieveInitialPosition(): Position {

        return Position(5, 5)
    }

    override fun retrieveInitialRowDirection(): Char {
        println("Please, Enter the rover facing direction ")
        return 'S'
    }



    override fun retrieveSizeMap(): Size {

        return Size(10, 10)
    }

    override fun printPositionWithDirection(formattedPositionWithDirection: String) {
        println("the final position is  $formattedPositionWithDirection")
    }
}