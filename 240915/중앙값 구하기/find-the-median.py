a, b, c = input().split()

a = int(a)
b = int(b)
c = int(c)

if a > b:
    if a > c:
        if c > b:
            print(c)
        else:
            print(b)
    elif a < c:
        print(a)
elif b > a:
    if b > c:
        if a > c:
            print(a)
        else:
            print(c)
    elif b < c:
        print(b)
elif c > b:
    if c > a:
        if b > a:
            print(b)
        else:
            print(a)
    elif c < a:
        print(c)