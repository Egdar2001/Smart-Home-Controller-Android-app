from bluetooth_server import start_bluetooth_server
from device_control import control_device

client_socket, server_socket = start_bluetooth_server()

try:
    while True:
        data = client_socket.recv(1024).decode("utf-8")
        if not data:
            break
        print(f"Received: {data}")
        control_device(data)
except KeyboardInterrupt:
    print("Server shutting down.")
finally:
    client_socket.close()
    server_socket.close()
