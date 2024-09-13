n = int(input())

passPoint = 80

if n >= passPoint:
    print("pass")
else:
    print("{} more score".format(passPoint - n))