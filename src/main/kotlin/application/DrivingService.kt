package application
import domain.*

import domain.PositionWithDirection

class DrivingService {

    private var plateau = Plateau()
    private var rover = Rover()

    fun processMovementOrders(orders:List<Orders>):PositionWithDirection
    {
        for(order in orders)
        {
                rover.executeOrder(order)
                isInMap(plateau, rover)
        }
        return rover.positionWithDirection
    }

    private fun isInMap(plateau: Plateau, rover: Rover) =
        plateau.isInPlateau(rover.positionWithDirection.position)

    fun createPlateau(size:Size){
        plateau = Plateau(size)
    }

    fun placeRover(positionWithDirection: PositionWithDirection)
    {
        if (plateau.isInPlateau(positionWithDirection.position)) {
            rover = Rover(positionWithDirection)
        }

    }

}