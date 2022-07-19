import kotlin.contracts.ReturnsNotNull

class RoverBO:IRover {
    private val facingList:Array<Char> = arrayOf('N','E','S','W')

    override fun startTrip(route: String, roverMO: RoverMO): String {
        var listOrders = route.toList()
        for (order in listOrders){
            when(order){
                'M', 'm' -> go(roverMO)
                'L', 'l' -> turnLeft(roverMO)
                'R', 'r' -> turnRight(roverMO)
            }
            //print(showFacing(roverMO.getFacing()))
            //println(roverMO.getPosition())
        }
        return roverMO.getPosition()
    }

    private fun turnLeft(roverMO: RoverMO) = roverMO.setFacing((roverMO.getFacing() + 3)%4)

    private fun turnRight(roverMO: RoverMO) = roverMO.setFacing((roverMO.getFacing() + 1)%4)

    private fun go(roverMO: RoverMO){
        when (roverMO.getFacing()){
            0 -> moveN(roverMO)
            1 -> moveE(roverMO)
            2 -> moveS(roverMO)
            3 -> moveW(roverMO)

        }
    }

    fun showFacing(orientationInt:Int):Char = facingList[orientationInt]

    private fun moveN(roverMO: RoverMO){
        var y = roverMO.getY()
        roverMO.setY((y + 1)%10)
    }
    private fun moveS(roverMO: RoverMO){
        var y = roverMO.getY()
        roverMO.setY((y + 9)%10)
    }
    private fun moveW(roverMO: RoverMO){
        var x = roverMO.getX()
        roverMO.setX((x + 9)%10)
    }
    private fun moveE(roverMO: RoverMO){
        var x = roverMO.getX()
        roverMO.setX((x + 1)%10)
    }






}