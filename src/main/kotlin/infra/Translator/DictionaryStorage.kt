package infra.Translator

import domain.Directions
import domain.Orders

class DictionaryStorage {

    private val DEF_COUNTRY = "USA"
    private val storage = mapOf(
        DEF_COUNTRY to arrayOf(
            Directions.NORTH.defaultValue,
            Directions.EAST.defaultValue,
            Directions.SOUTH.defaultValue,
            Directions.WEST.defaultValue,
            Orders.MOVE.defaultValue,
            Orders.LEFT.defaultValue,
            Orders.RIGHT.defaultValue
        ),
        "URSS" to arrayOf('A', 'C', 'B', 'D', 'X', 'Y', 'Z'),
        "SPAIN" to arrayOf('N', 'E', 'S', 'O', 'M', 'I', 'D'),
        "CAT" to arrayOf('N', 'E', 'S', 'O', 'M', 'E', 'D'))


 /*   fun retireveArrayOrders(country:String):Array<Char>{
        var arrayOrders:Array<Char> = arrayOf()

        for (i in 0..2){
            arrayOrders[i] = storage["USA"]!!.elementAt(i+4)
        }

        return arrayOrders
    }

    fun retireveArrayDirections(country:String):Array<Char>{
        var arrayDirections:Array<Char> = arrayOf()
        for (i in 0..3){
            arrayDirections[i] = storage["USA"]!!.elementAt(i)
        }
        return arrayDirections
    }*/

    fun retrieveTranslationMapOrders(country:String):Map<Char, Char>
    {
        val arrayDefault = storage.getOrDefault(DEF_COUNTRY, arrayOf())
        val arrayToTranslate = storage.getOrDefault(country ,storage[DEF_COUNTRY])
        var ordersTranslationMap = mutableMapOf<Char,Char>()
        if (arrayToTranslate != null && arrayDefault != null) {
            for (i in 4..6){

                ordersTranslationMap[arrayToTranslate.elementAt(i)] = arrayDefault.elementAt(i)
            }
        }
        return ordersTranslationMap.toMap()
    }

    fun retrieveTranslationMapDirections(country:String):Map<Char, Char>
    {
        val arrayDefault = storage.getOrDefault(DEF_COUNTRY, arrayOf())
        val arrayToTranslate = storage.getOrDefault(country ,storage[DEF_COUNTRY])
        var directionsTranslationMap = mutableMapOf<Char,Char>()
        if (arrayToTranslate != null && arrayDefault != null) {
            for (i in 0..3){

                directionsTranslationMap[arrayDefault.elementAt(i)] = arrayToTranslate.elementAt(i)
            }
        }
        return directionsTranslationMap.toMap()
    }


}