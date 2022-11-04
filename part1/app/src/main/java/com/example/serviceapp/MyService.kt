package com.example.serviceapp

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class MyService : Service() {

    private val binder: Binder = MyBinder()

    override fun onBind(p0: Intent?): IBinder = binder

    inner class MyBinder : Binder() {
        val service: MyService
            get() = this@MyService
    }
}