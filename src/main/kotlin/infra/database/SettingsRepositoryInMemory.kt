package infra.database

import domain.SettingsRepository
import domain.Settings

class SettingsRepositoryInMemory:SettingsRepository {
    private val dbSettings = mapOf("USA" to arrayOf('N','E','S','W','M','L','R'), "URSS" to arrayOf('A','C','B','D','X','Y','Z'))

    override fun retrieveRoverSettings(country:String):Settings
    {
        val arraySettings = dbSettings.getOrDefault(country, arrayOf('N','E','S','W','M','L','R'))

        return Settings(arraySettings[0],
            arraySettings[1],
            arraySettings[2],
            arraySettings[3],
            arraySettings[4],
            arraySettings[5],
            arraySettings[6])
    }


}