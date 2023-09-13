#시간을 H, 분을 M으로 입력
H , M= input().split(" ")

# 1시간 = 60분으로 계산해서 TIME(분) 정의 
TIME = ( 60 * int(H) ) + int(M)

#입력한 시간에서 -45분 
ALARM_TIME = TIME - 45

# 시간은 60으로 나눈 몫, 분은 60으로 나눈 나머지
H = ALARM_TIME // 60
M = ALARM_TIME % 60


# 만약 자정을 지날 경우 ::= 날짜는 상관 없음으로 24시간을 PLUS 해줌
if H < 0:
    H += 24

print("{} {}".format(H,M))