package domain


interface SettingsRepository {

    fun retrieveRoverSettings(country:String = "USA"):Settings

}
