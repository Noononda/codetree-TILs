N = int(input())

for i in range (0, N):
    a = int(input())

    if a % 2 != 0:
        if a % 3 == 0:
            print (a)