package application
import domain.*

import domain.PositionWithDirection

class DrivingService {

    fun landRover(positionWithDirection: PositionWithDirection):Rover
    {
        return Rover(positionWithDirection)
    }

    fun processMovementOrders(orders:List<Orders>, rover:Rover, plateau:Plateau)
    {
        for(order in orders)
        {
                rover.executeOrder(order)
                isInMap(plateau, rover)

        }
    }

    private fun isInMap(plateau: Plateau, rover: Rover) =
        plateau.isInPlateau(rover.positionWithDirection.position)
}