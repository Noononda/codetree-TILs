c, n = input().split()

n = int(n)
i = 1

if c == 'A':
    while i <= n:
        print(i, end=" ")
        i += 1
elif c == 'D':
    while i <= n:
        print(n, end=" ")
        n -= 1