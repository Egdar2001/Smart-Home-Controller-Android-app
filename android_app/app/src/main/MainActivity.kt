package com.example.smarthome

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val bluetoothClient = BluetoothClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.lightOnButton).setOnClickListener {
            bluetoothClient.sendCommand("LIGHT_ON")
        }
        findViewById<Button>(R.id.lightOffButton).setOnClickListener {
            bluetoothClient.sendCommand("LIGHT_OFF")
        }
        findViewById<Button>(R.id.fanOnButton).setOnClickListener {
            bluetoothClient.sendCommand("FAN_ON")
        }
        findViewById<Button>(R.id.fanOffButton).setOnClickListener {
            bluetoothClient.sendCommand("FAN_OFF")
        }
        findViewById<Button>(R.id.cameraOnButton).setOnClickListener {
            bluetoothClient.sendCommand("CAMERA_ON")
        }
        findViewById<Button>(R.id.cameraOffButton).setOnClickListener {
            bluetoothClient.sendCommand("CAMERA_OFF")
        }
    }
}
