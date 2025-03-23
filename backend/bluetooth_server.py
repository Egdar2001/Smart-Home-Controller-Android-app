import asyncio
from bleak import BleakScanner, BleakClient

async def scan_devices():
    print("Scanning for Bluetooth devices...")
    devices = await BleakScanner.discover()
    for device in devices:
        print(f"Found device: {device.name} - {device.address}")

async def connect_device(address):
    async with BleakClient(address) as client:
        print(f"Connected to {address}")
        # Add logic to send commands for controlling lights, fans, etc.

if __name__ == "__main__":
    asyncio.run(scan_devices())
