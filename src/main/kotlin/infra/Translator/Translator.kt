package infra.Translator

import domain.ITranslator


class Translator():ITranslator{

    override fun translateOrders(country: String, orders: String): String
    {
        val translationMapOrders = DictionaryStorage().retrieveTranslationMapOrders(country)
        var translatedOrders = ""

        for(order in orders)
        {
            translatedOrders += translationMapOrders[order]
        }

        return translatedOrders
    }

    override fun translateDirection(country:String, direction:Char):Char
    {
        return DictionaryStorage().retrieveTranslationMapDirections(country).getOrDefault(direction, direction)
    }


}