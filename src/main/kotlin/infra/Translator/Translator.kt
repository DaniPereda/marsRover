package infra.Translator


class Translator(private val country:String = "USA"){

    var myDictionary:MutableMap<Char, Char> = mutableMapOf()

    fun translate (orders:String):String
    {
        if (myDictionary.isNotEmpty()) {
            var translatedOrders = ""
            var listOrders = orders.uppercase().toList()
            for (order in listOrders) {
                translatedOrders += (myDictionary.getOrDefault(order, order))

            }
            return translatedOrders
        }
        return orders
    }

    fun buildTranslationMap()
    {

        val dictionaryStorage = mapOf("USA" to arrayOf('N','E','S','W','M','L','R'), "URSS" to arrayOf('A','B','C','D','X','Y','Z'))

        var myKeys = dictionaryStorage.getOrDefault(country, dictionaryStorage.getValue("USA"))

        if(myKeys.isNotEmpty())
        {
            for ( i in 0..3){
                myDictionary[(dictionaryStorage["USA"])!![i]] = myKeys[i]
            }
            for ( i in 4..6)
            {
                myDictionary[myKeys[i]] = (dictionaryStorage["USA"])!![i]
            }
        }


    }

}