#몇 단을 출력할지 N 입력
N = input()

for i in range(1, 10):
    print("{} * {} = {}".format(int(N),i,int(N)*i))

    #range (a,b) a 이상 b 미만 반복