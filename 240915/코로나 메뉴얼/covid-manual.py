aSymptom, aTemp = input().split()
bSymptom, bTemp = input().split()
cSymptom, cTemp = input().split()

aTemp = int(aTemp)
bTemp = int(bTemp)
cTemp = int(cTemp)

cnt = 0
standardTemp = 37

if aSymptom == 'Y':
    if aTemp >= standardTemp:
        cnt += 1

if bSymptom == 'Y':
    if bTemp >= standardTemp:
        cnt += 1

if cSymptom == 'Y':
    if cTemp >= standardTemp:
        cnt += 1

if cnt >= 2:
    print("E")
else:
    print("N")