classRoomCnt = 0
hallWayCnt = 0
restRoomCnt = 0

n = int(input())

for i in range(1, n + 1):
    if i % 2 == 0 and i % 3 == 0 and i % 12 == 0:
        restRoomCnt += 1
    elif i % 2 == 0 and i % 3 == 0:
        hallWayCnt += 1
    elif i % 2 == 0 and i % 12 == 0:
        restRoomCnt += 1
    elif i % 3 == 0 and i % 12 == 0:
        restRoomCnt += 1
    elif i % 2 == 0:
        classRoomCnt += 1
    elif i % 3 == 0:
        hallWayCnt += 1
    elif i % 12 == 0:
        restRoomCnt += 1

print(classRoomCnt, hallWayCnt, restRoomCnt)