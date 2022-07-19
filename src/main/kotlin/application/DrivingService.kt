package application

import domain.SettingsRepository
import application.ConfigService
import domain.Rover
import domain.Settings

interface DrivingService {

    fun startTrip(CountryKey:String, orders:String):String


}