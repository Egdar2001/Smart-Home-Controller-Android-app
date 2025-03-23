def control_device(command):
    if command == "LIGHT_ON":
        print("Lights turned ON.")
    elif command == "LIGHT_OFF":
        print("Lights turned OFF.")
    elif command == "FAN_ON":
        print("Fan turned ON.")
    elif command == "FAN_OFF":
        print("Fan turned OFF.")
    elif command == "CAMERA_ON":
        print("Camera activated.")
    elif command == "CAMERA_OFF":
        print("Camera deactivated.")
    else:
        print("Unknown command received.")
