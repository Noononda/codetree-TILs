aMath, aEnglish = input().split()
bMath, bEnglish = input().split()

aMath = int(aMath)
aEnglish = int(aEnglish)

bMath = int(bMath)
bEnglish = int(bEnglish)

if aMath > bMath and aEnglish > bEnglish:
    print(1)
else:
    print(0)