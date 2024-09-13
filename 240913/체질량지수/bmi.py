h, w = input().split()

h = int(h)
w = int(w)

b = (10000 * w) // (h * h)

if b >= 25:
    print(b)
    print("Obesity")
else:
    print(b)