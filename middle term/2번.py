import math

a = float(input("계수 a:"))
b = float(input("계수 b:"))
c = float(input("계수 c:"))



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

