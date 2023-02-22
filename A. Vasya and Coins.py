t = int(input())
for i in range(t):
    a,b = map(int,input().split())
    sum = 0
    if a and not b:
        print(a+1)
    elif b and not a:
        print(1)
    elif a == 0 and b == 0:
        print(1)
    else:
        sum = a + (2*b)+1
        print(sum)
     