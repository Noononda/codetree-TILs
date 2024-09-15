middle, final = input().split()

middle  = int(middle)
final = int(final)

if middle >= 90:
    if final >=95:
        print(100000)
    elif 90 <= final and final < 95:
        print(50000)
else:
    print(0)