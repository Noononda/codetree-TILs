n = int(input())

if n >= 3000:
    print("book")
elif 1000 <= n and n < 3000:
    print("mask")
elif 500 <= n and n < 1000:
    print("pen")
else:
    print("no")