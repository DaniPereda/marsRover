package domain

data class Plateau(val size:Size=Size(10,10)) {
    fun isInPlateau(position:Position):Boolean
    {
        if (isXCoordenateOK(position) && isYCoordenateOK(position)) {
            return true
        }
        else throw java.lang.RuntimeException("Coordenadas Fuera de Plateau")
    }

    private fun isXCoordenateOK(position: Position) = position.x >= 0 && position.x < size.height

    private fun isYCoordenateOK(position: Position) = position.y >= 0 && position.y < size.height
}