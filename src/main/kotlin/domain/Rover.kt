package domain
class Rover(var positionWithDirection:PositionWithDirection = PositionWithDirection(Position(0,0),Directions.NORTH)) {

    fun goAhead()
    {
        when(positionWithDirection.direction){
            Directions.NORTH -> goNorth()
            Directions.SOUTH -> goNorth()
            Directions.EAST -> goNorth()
            Directions.WEST -> goNorth()
        }
    }

    private fun goNorth() {
        positionWithDirection.position.y += 1
    }
    private fun goSouth() {
        positionWithDirection.position.y -= 1
    }
    private fun goEast() {
        positionWithDirection.position.x += 1
    }
    private fun goWest() {
        positionWithDirection.position.x -=1
    }

    fun turnRight()
    {
        when(positionWithDirection.direction)
        {
            Directions.NORTH -> faceEast()
            Directions.SOUTH -> faceWest()
            Directions.EAST -> faceSouth()
            Directions.WEST -> faceNorth()
        }
    }

    fun turnLeft()
    {
        when(positionWithDirection.direction)
        {
            Directions.NORTH -> faceWest()
            Directions.SOUTH -> faceEast()
            Directions.EAST -> faceNorth()
            Directions.WEST -> faceSouth()
        }
    }

    private fun faceNorth() {
        positionWithDirection.direction = Directions.NORTH
    }

    private fun faceSouth() {
        positionWithDirection.direction = Directions.SOUTH
    }

    private fun faceWest() {
        positionWithDirection.direction = Directions.WEST
    }

    private fun faceEast() {
        positionWithDirection.direction = Directions.EAST
    }



}