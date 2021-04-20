import math
import sys
import turtle as t


a = float(input("계수 a:"))
b = float(input("계수 b:"))
c = float(input("계수 c:"))


#1 추가 기능 구현 부분 
# 최고차항 (2차)계수가 0일 경우 프로그램을 종료 
if a==0:
    print("a == 0 이차 방정식이 아닙니다.")
    sys.exit()



# 2차 함수의 계수 모두 부호까지 포함해서 출력
print("2차 함수 {:0.1f}*x^2 {:+0.1f}x {:+0.1f}".format(a,b,c))

D = b*b-4*a*c

if D > 0:
    x1 = (-b+math.sqrt(D))/(2*a)  ## sqrt(D) = √b*b-4*a*c
    x2 = (-b-math.sqrt(D))/(2*a)
    print("2개의 실근이 있습니다: {0:0.2f} 와 {1:0.2f}".format(x1,x2))
if D == 0:
    x = -b/(2*a)
    print("하나의 실근이 있습니다: {0:0.1f}".format(x))
if D < 0:
    print("실근이 존재하지 않습니다.")


##### 추가 구현 부분 #####
# 1. a가 0일 때 프로그램 종료
# 2. turtle 모듈을 사용해서 그래프 그리기

# x축과 y축 범위 설정
x_min = -50
x_max = +50

y_min = -50
y_max = +50

# 함수가 그려질 간격
space = 0.1

# 그릴 그래프를  func_list 리스트에 저장
func_list = ["y = a*x*x+b*x+c"]

# 거북이 그래픽 창의 범위, 거북이의 속도 및 펜 크기 설정
t.setworldcoordinates(x_min,y_min,x_max,y_max)
t.speed(0)
t.pensize(2)

#x축과 y축을 그리는 명령 , up()함수는 펜 그리기 시작, goto(x,y)함수는 x -> y 로 이동 ,down()함수는 펜 그리기 종료
t.up()
t.goto(x_min,0)
t.down()
t.goto(x_max,0)

t.up()
t.goto(0,y_min)
t.down()
t.goto(0,y_max)

#그래프의 색상을 red 색으로 설정
t.color("red")

# x가 x_max 보다 작거나 같을 때까지 그래프 그리기
for func in func_list:
    x= x_min
    exec(func)
    t.up()
    t.goto(x,y)
    t.down()
    while x<x_max:
        x=x+space
        exec(func)
        t.goto(x,y)
