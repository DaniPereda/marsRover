package application
import domain.Settings

import domain.SettingsRepository

class ConfigServiceImpl(private val settingsInMemory: SettingsRepository):ConfigService
    {
    override fun setParameters(country: String):Settings {
        return settingsInMemory.retrieveRoverSettings(country)
    }
}