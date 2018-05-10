package ru.com.rh.servicetest

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class StickyService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        Log.d("STICKY", "IM CREATED!!")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("STICKY", "IM STARTED!!")
        return START_STICKY
    }

    override fun onDestroy() {
        Log.d("STICKY", "IM DESTROYED!!")
        super.onDestroy()
    }
}
