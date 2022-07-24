package domain

data class Rover(var x:Int = 0,
        var y:Int = 0,
        var facing:Int = 0) {

        fun turnLeft()
        {
                facing = (facing + 3)%4
        }

        fun turnRight()
        {
                facing = (facing +1)%4
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
                y = ((y + 1)%10)
        }
        private fun moveS(){
                y = ((y + 9)%10)
        }
        private fun moveW(){
                x = ((x + 9)%10)
        }
        private fun moveE(){
                x = ((x + 1)%10)
        }

        fun getNSEW() = arrayOf("N", "E", "S", "W")[facing]

}

