package application

import domain.*
import domain.Communicator
import domain.Translator

class MainApplication (val communicator:Communicator, val translator:Translator) {


    private var plateau = createPlateau()
    private var positionWithDirection = PositionWithDirection(communicator.retrieveInitialPosition(), translator.translateDirection(communicator.retrieveInitialRowDirection()))
    //aterrizamos el coche
    private var drivingService = DrivingService()
    private val rover = placeRover(positionWithDirection)
    //recibimos las ordenes y las transformamos
    private val listOfOrders = getListOfTranslatedOrders()



    fun start() {
        drivingService.processMovementOrders(listOfOrders, rover, plateau)
        val formattedPositionWithDirection = translator.positionWithDirectiontoString(rover.positionWithDirection)
        communicator.printPositionWithDirection(formattedPositionWithDirection)
    }


    private fun getListOfTranslatedOrders() = translator.translateOrders(communicator.retrieveOrders())

    //Las pasamos a DrivingService

    fun placeRover(positionWithDirection: PositionWithDirection):Rover
    {
        println("vamos a colocar el vehiculo")
        if (plateau.isInPlateau(positionWithDirection.position))
        {
            return drivingService.landRover(positionWithDirection)
        }
        else return Rover()

    }

    private fun createPlateau() = Plateau(communicator.retrieveSizeMap())


}