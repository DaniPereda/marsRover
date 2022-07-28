
import application.DrivingServiceImpl

fun main(args: Array<String>) {

    var country = "URSS"
    var orders = "XYXXXX"



    println(DrivingServiceImpl().startTrip(country, orders))

}