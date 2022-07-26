

import application.DrivingServiceImpl

fun main(args: Array<String>) {

    //DUDAS: no tengo que ponerle package a esta clase?
    //El tema este de los enum Classes
    //¿Como me ayudan en lo que quiero hacer?

    var country = "URSS"
    var orders = "XYXXXX"

    println(DrivingServiceImpl().startTrip(country, orders))

}