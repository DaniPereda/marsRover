package application
import infra.Translator.Translator

import domain.Rover
import java.util.*

class DrivingServiceImpl:DrivingService {

    override fun startTrip(country:String, orders:String): String{


        var translator = Translator(country)
        translator.buildTranslationMap()

        var rover = Rover()

        var listOrders = translator.translate(orders).toList()

        for (order in listOrders){
            when(order){
                'M'   -> rover.move()
                'L' -> rover.turnRight()
                'R' -> rover.turnLeft()
            }
        }
        return getRoverPosition(rover)
    }

    private fun getRoverPosition(rover: Rover) =
        "${rover.x}:${rover.y}:${rover.getNSEW()}"




}