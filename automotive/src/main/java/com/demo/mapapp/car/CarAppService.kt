package com.demo.mapapp.car

import androidx.car.app.CarAppService
import androidx.car.app.validation.HostValidator
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI

@ExperimentalPreviewMapboxNavigationAPI
class CarAppService : CarAppService() {
    override fun createHostValidator() = HostValidator.ALLOW_ALL_HOSTS_VALIDATOR

    override fun onCreateSession() = CarSession()
}
