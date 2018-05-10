package ru.com.rh.servicetest

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class NotStickyService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        Log.d("NOT_STICKY", "IM CREATED!!")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("NOT_STICKY", "IM STARTED!!")
        return START_NOT_STICKY
    }
    override fun onDestroy() {
        Log.d("NOT_STICKY", "IM DESTROYED!!")
        super.onDestroy()
    }

}
