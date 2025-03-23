package com.example.smarthome

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import java.io.OutputStream
import java.util.UUID

class BluetoothClient {
    private val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()
    private val deviceAddress = "XX:XX:XX:XX:XX:XX" // Replace with Python server Bluetooth address
    private val uuid: UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")

    fun sendCommand(command: String) {
        val device: BluetoothDevice? = bluetoothAdapter?.getRemoteDevice(deviceAddress)
        val socket: BluetoothSocket? = device?.createRfcommSocketToServiceRecord(uuid)

        try {
            socket?.connect()
            val outputStream: OutputStream = socket!!.outputStream
            outputStream.write(command.toByteArray())
            outputStream.flush()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            socket?.close()
        }
    }
}
