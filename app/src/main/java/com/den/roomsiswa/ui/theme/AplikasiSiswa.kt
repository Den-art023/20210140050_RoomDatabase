package com.den.roomsiswa.ui.theme

import android.app.Application
import com.den.roomsiswa.repositori.ContainerApp
import com.den.roomsiswa.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}