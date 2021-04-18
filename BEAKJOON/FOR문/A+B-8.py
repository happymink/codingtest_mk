import sys
Num = int(input())

for i in range(1,Num+1):
    A,B = map(int,sys.stdin.readline().split())
    print("Case #{}: {} + {} = {}".format(i,A,B,A+B))