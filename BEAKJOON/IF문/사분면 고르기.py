#점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오

X = input()
Y = input()

X = int(X)
Y = int(Y)


# 1사분면 조건  X > 0 and Y > 0
# 2사분면 조건  X < 0 and Y > 0
# 3사분면 조건  X < 0 and Y < 0
# 4사분면 조건  X > 0 and Y < 0 

if X > 0 and Y > 0:
    print("1")
elif X < 0 and Y > 0:
    print("2")
elif X < 0 and Y < 0:
    print("3")
elif X > 0 and Y < 0:
    print("4")
