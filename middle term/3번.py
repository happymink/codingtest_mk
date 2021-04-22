# 작성일 : 2021 04 22
# 작성자 : 20174176 이민균
# 문제 3 : 현재시간 출력 프로그램

import time
seconds = int(time.time())
seconds=seconds+9*3600   # 대한민국 시간대 9시간을 더해줌(9*60분*60초)

denver_sec = seconds - 15*3600 # 덴버 시간은 한국 시간 -15시간

seconds=seconds%(24*3600) # 시간을 구하기 위해 나머지 처리
denver_sec = denver_sec%(24*3600)
denver_hour = denver_sec // 3600
hour = seconds // 3600                  #1시간에 해당하는 초로 나눈 몫이 시간
denver_min = (denver_sec // 60) % 60  
min = (seconds // 60) % 60                #현재 분
print("현재 서울 시간: {0:02d}시 {1:02d}분".format(hour,min))
print("현재 콜로라도 덴버 시간: {0:02d}시 {1:02d}분".format(denver_hour,denver_min))
