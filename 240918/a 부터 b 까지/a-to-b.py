a, b = input().split()

a = int(a)
b = int(b)

while b >= a:
    if a % 2 != 0:
        print(a, end=" ")
        a *= 2
    else:
        print(a, end=" ")
        a += 3