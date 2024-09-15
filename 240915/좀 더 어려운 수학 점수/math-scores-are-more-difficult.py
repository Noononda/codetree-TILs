aMath, aEnglish = input().split()
bMath, bEnglish = input().split()

aMath = int(aMath)
aEnglish = int(aEnglish)

bMath = int(bMath)
bEnglish = int(bEnglish)

if aMath > bMath:
    print("A")
elif bMath > aMath:
    print("B")
elif aMath == bMath:
    if aEnglish > bEnglish:
        print("A")
    else:
        print("B")