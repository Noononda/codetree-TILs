threeCnt = 0
fiveCnt = 0

for i in range(0, 10):
    a = int(input())
    if a % 3 == 0 and a % 5 == 0:
        threeCnt += 1
        fiveCnt += 1
    elif a % 3 == 0:
        threeCnt += 1
    elif a % 5 == 0:
        fiveCnt += 1

print(threeCnt, end=" ")
print(fiveCnt)