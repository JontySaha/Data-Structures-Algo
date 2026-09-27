seat_type=input("Enter seat type : ")

match seat_type:
    case "luxury":
        print("Luxury")
    case "sleeper":
        print("sleeper")
    case _:
        print("Invalid seat")
    