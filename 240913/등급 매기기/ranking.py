examPoint = int(input())

if examPoint >= 90:
    print("A")
elif 80 <= examPoint and examPoint < 90:
    print("B")
elif 70 <= examPoint and examPoint < 80:
    print("C")
elif 60 <= examPoint and examPoint < 70:
    print("D")
else:
    print("F")