package application

import domain.Rover
import java.util.*

class DrivingServiceImpl:DrivingService {

    override fun startTrip(orders:String): String{
        var rover = Rover()

        var listOrders = orders.toList()
        for (order in listOrders){
            when(order){
                'M'   -> go(rover)
                'L' -> turnRight(rover)
                'R' -> turnLeft(rover)
            }
        }
        return getRoverPosition(rover)
    }

    private fun getRoverPosition(rover: Rover) =
        "${rover.x}:${rover.y}:${arrayOf("N", "E", "S", "W")[rover.facing]}"

    private fun turnLeft(rover: Rover)
    {
        rover.facing = (rover.facing + 3)%4
    }

    private fun turnRight(rover: Rover)
    {
        rover.facing = (rover.facing +1)%4
    }

    private fun go(rover: Rover){
        when (rover.facing){
            0 -> moveN(rover)
            1 -> moveE(rover)
            2 -> moveS(rover)
            3 -> moveW(rover)

        }
    }

    private fun moveN(rover: Rover){
        rover.y = ((rover.y + 1)%10)
    }
    private fun moveS(rover: Rover){
        rover.y = ((rover.y + 9)%10)
    }
    private fun moveW(rover: Rover){
        rover.x = ((rover.x + 9)%10)
    }
    private fun moveE(rover: Rover){
        rover.x = ((rover.x + 1)%10)
    }

}