package application

import domain.*
import domain.Communicator
import infra.comunicator.ConsoleComunicator


class mainApplication {

    //var plateau:Plateau = createLand(10, 10)
    var communicator:Communicator = ConsoleComunicator()
    var drivingService = DrivingService()
    var plateau = createPlateau()

    private fun createPlateau() = Plateau(communicator.retrieveSizeMap())

    var positionWithDirection = PositionWithDirection()



    //aterrizamos el coche
    var rover = placeRover(positionWithDirection)


    //recibimos las ordenes

    var rowOrders =


    //Las transformamos

    //Las pasamos a DrivingService

    private fun createLand(width:Int, height:Int):Plateau = Plateau(Size(width, height))

    private fun placeRover(positionWithDirection: PositionWithDirection):Rover
    {
        if (plateau.isInPlateau(positionWithDirection.position))
        {
            return = drivingService.landRover(positionWithDirection)
        }

    }


}