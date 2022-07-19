package application

interface ConfigService {
    fun setParameters(country: String): domain.Settings
}