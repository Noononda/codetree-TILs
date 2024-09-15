n = int(input())

for i in range(n, 101):
    if 90 <= i:
        print("A", end=" ")
    elif 80 <= i and i < 90:
        print("B", end=" ")
    elif 70 <= i and i < 80:
        print("C", end=" ")
    elif 60 <= i and i < 70:
        print("D", end=" ")
    else:
        print("F", end=" ")