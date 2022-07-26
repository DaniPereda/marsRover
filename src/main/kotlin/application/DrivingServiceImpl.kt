package application
import infra.Translator.Translator

import domain.*

class DrivingServiceImpl:DrivingService {

    override fun startTrip(country:String, orders:String): String{
        val translator = Translator()
        var translatedOrders = translator.translateOrders(country, orders)

        var rover = Rover()

        for (order in translatedOrders){
            when(order){
                Orders.MOVE.defaultValue  -> rover.move()
                Orders.LEFT.defaultValue -> rover.turnLeft()
                Orders.RIGHT.defaultValue -> rover.turnRight()
            }
        }

        return getRoverPosition(country, rover)    }

    private fun getRoverPosition(country:String, rover: Rover):String{

        val direction = getNSEW(rover)
        val translatedDirection = Translator().translateDirection(country, direction)
        return "${rover.x}:${rover.y}:$translatedDirection"

    }



    private fun getNSEW(rover: Rover) = arrayOf(Directions.NORTH.defaultValue, Directions.EAST.defaultValue, Directions.SOUTH.defaultValue, Directions.WEST.defaultValue)[rover.facing]




}