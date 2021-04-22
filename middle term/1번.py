# 작성일 : 2021 04 22
# 작성자 : 20174176 이민균
# 문제 1 : 케익 부피 계산
radius = int(input("케익의 반지름을 입력하세요: "))
height = int(input("케익의 높이를 입력하세요: "))
degree = int(input("케익의 각도를 입력하세요: "))

pi = 3.14
#입력받을 각도를 라디안으로 변환
degree = degree * pi/180
#호의 길이 (rθ)
length =   radius * degree 

# v = 1/2 * 반지름 * 호의 길이 * 높이
volume = 1/2*radius*length*height
# v = 1/2 * 반지름의 제곱 * 각도 * 높이
#volume = 1/2*radius*radius*degree * height

#소수점 자리수 3자리까지 출력
print("케익의 부피는 {0:0.3f}입니다".format(volume))