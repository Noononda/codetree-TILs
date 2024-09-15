firstAge, firstGender = input().split()
secondAge, secondGender = input().split()

firstAge = int(firstAge)
secondAge = int(secondAge)

if (firstAge >= 19 and firstGender == 'M') or (secondAge >= 19 and secondGender == 'M'):
    print(1)
else:
    print(0)