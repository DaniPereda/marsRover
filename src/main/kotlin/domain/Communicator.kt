package domain

interface Communicator {
    fun retrieveOrders():String

    fun retrieveInitialPosition():Position

    fun retrieveInitialRowDirection():String

    fun retrieveSizeMap():Size
}