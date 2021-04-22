# 작성일 : 2021 04 22
# 작성자 : 20174176 이민균
# 문제 5 : 주민등록번호 분석

import time
import sys
from datetime import datetime

#현재 연도, 월, 일 을 가져온다
year = datetime.today().year
month = datetime.today().month
day = datetime.today().day

#입력한 정보를 저장할 출생 연도, 월, 일 초기화
bir_year = ''
bir_month = ''
bir_day = ''

name = input("이름을 입력하세요: ")
front_num , back_num = input("주민등록번호를 입력하세요: ").split("-") # '-'기호 기준으로 분리하여 앞,뒤 따로 저장
gender = ''
age = 0
born = ''
print("**************************")

#주민번호 검사
if len(front_num) != 6 or len(back_num) != 7:
    print("주민번호가 형식에 맞지 않습니다.다시 입력하세요")
    sys.exit()

#입력한 정보가 숫자인지 판별
for i in range(len(front_num)):
    if front_num[i].isdigit() == False:
        print("주민번호는 숫자만 입력하세요")
        sys.exit()
#입력한 정보가 숫자인지 판별 #2
for i in range(len(back_num)):
    if back_num[i].isdigit() == False:
        print("주민번호는 숫자만 입력하세요")
        sys.exit()

# 성별을 구하는 조건문
if back_num[0] in ['9','1','3','5','7']:
    gender = '남자'
elif back_num[0] in ['0','2','4','6','8']:
    gender = '여자'

#나이를 구하는 조건문

#생년월일을 계산하기 쉽게 (19xx, 20xx) 4자리로 변환
if front_num[0:2] < '21':
    bir_year = int("20"+front_num[0:2])
    bir_month = int(front_num[2:4])
    bir_day = int(front_num[4:])
else:
    bir_year = int("19"+front_num[0:2])
    bir_month =int(front_num[2:4])
    bir_day = int(front_num[4:])

#생일이 지났을 경우와 지나지 않았을 경우
if month > bir_month :
    age=year-bir_year
elif month == bir_month :
    if day >=  bir_day:
        age=year-bir_year
    elif day < bir_day:
        age=year-bir_year-1
elif month < bir_month :
    age=year-bir_year-1

# 지역을 구하는 조건문
if back_num[1:3] <= '08':
    born = '서울'
elif back_num[1:3] <= '12':
    born = '부산'
elif back_num[1:3] <= '15':
    born = '인천'
elif back_num[1:3] <= '25':
    born = '경기도'
elif back_num[1:3] <= '34':
    born = '강원도'
elif back_num[1:3] <= '39':
    born = '충북'
elif back_num[1:3] <= '47':
    born = '충남'
elif back_num[1:3] <= '54':
    born = '전북'
elif back_num[1:3] <= '56':
    born = '전남'
elif back_num[1:3] <= '90':
    born = '경상도'
else:
    born = '외국'


print("{}님은 현재 만{}세,".format(name,age))
print("{}이며 {}에서 태어나셨군요".format(gender,born))
