package domain


interface ITranslator {

    fun translateOrders(country:String, orders:String):String

    fun translateDirection(country:String, direction:Char):Char


}