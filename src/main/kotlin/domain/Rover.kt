package domain

data class Rover(var x:Int = 0,
        var y:Int = 0,
        var facing:Int = 0) {

        private val size = 10
        private val numDirections = 4
        fun turnLeft()
        {
                facing = (facing + 3)%numDirections
        }

        fun turnRight()
        {
                facing = (facing +1)%numDirections
        }

        fun move(){
                when (facing){
                        0 -> moveN()
                        1 -> moveE()
                        2 -> moveS()
                        3 -> moveW()

                }
        }

        private fun moveN(){
                y = ((y + 1)%size)
        }
        private fun moveS(){
                y = ((y + 9)%size)
        }
        private fun moveW(){
                x = ((x + 9)%size)
        }
        private fun moveE(){
                x = ((x + 1)%size)
        }


}

