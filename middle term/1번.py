radius = int(input("케익의 반지름을 입력하세요: "))
height = int(input("케익의 높이를 입력하세요: "))
degree = int(input("케익의 각도를 입력하세요: "))

pi = 3.14

#호의 길이
length = 2* pi * radius * degree / 360

# v = 1/2 * 반지름 * 호의 길이 * 높이
volume = 1/2*radius*length*height
# v = 1/2 * 반지름의 제곱 * 각도/360 * 높이
volume = pi*radius*radius*degree/360 * height

#소수점 자리수 3자리까지 출력
print("케익의 부피는 {0:0.3f}입니다".format(volume))