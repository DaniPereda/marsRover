package application

import domain.Rover
import domain.SettingsRepository
import domain.Settings
import application.ConfigService
import infra.database.SettingsRepositoryInMemory

class DrivingServiceImpl:DrivingService {



    override fun startTrip(countryKey:String, orders:String): String{
        var settings = retrieveSettings(countryKey)

        var rover = Rover(settings=settings)

        var listOrders = orders.toList()
        for (order in listOrders){
            when(order.uppercaseChar()){
                rover.settings.move   -> go(rover)
                rover.settings.left -> turnRight(rover)
                rover.settings.right -> turnLeft(rover)
            }
        }
        return getRoverPosition(rover)
    }

    private fun getRoverPosition(rover: Rover) =
        "${rover.x}:${rover.y}:${arrayOf(rover.settings.nord, rover.settings.east, rover.settings.south, rover.settings.west)[rover.facing]}"

    private fun retrieveSettings(countryKey:String): Settings = SettingsRepositoryInMemory().retrieveRoverSettings(countryKey)

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