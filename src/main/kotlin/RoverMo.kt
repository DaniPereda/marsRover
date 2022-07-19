class RoverMO {

    private var mode:String = "USA"

    fun setMode(myMode:String){
        mode = myMode
    }
    private var x:Int = 0
    private var y:Int = 0
    private var facing:Int = 0

    fun getX():Int = x
    fun getY():Int = y
    fun setX(myX:Int){
        x = myX
    }
    fun setY(myY:Int){
        y = myY
    }


    fun getPosition(): String {
        return x.toString() + ":" + y.toString() + ":" + RoverBO().showFacing(getFacing())
    }

    fun setFacing(orientation: Int) {
        facing = orientation
    }

    fun getFacing():Int = facing
}