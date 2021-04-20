import time

def isleapyear(year):
    return (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0)
    
seconds = int(time.time())

print(f'1970.1.1 이후 {seconds}초')
print(f'1970.1.1 이후 {seconds//(24*3600)}일')

seconds=seconds+9*3600                                      # 대한민국 시간대 9시간을 더해줌(9*60분*60초)

dayofweeks=["일","월","화","수","목","금","토"]
dayofweek = ((seconds//(24*3600))+4)%7                      #요일 구하기, 
                                                            #일 수로 환산하여 4를 더함(1970.1.1일은 목요일(4))
                                                            #하루에 해당하는 초로 나눔
                                                            #일주일(7일)의 나머지를 구함  

for y in range(1970,3000):                                  #연도 구하기 
    if(isleapyear(y)):                                      # 윤년이면 
        if(seconds<366*24*3600):                            #초가 1년부다 작게 남았으면 
            year=y                                          #year를 y로 설정  
            break                           
    else:                                                   #윤년이 아니면
        if(seconds<365*24*3600):                            #초가 1년부다 작게 남았으면 
            year=y                                          #year를 y1로 설정  
            break

    if (isleapyear(y)):                                     #윤년이면 
        seconds-=366*24*3600                                #윤년에 해당하는 초를 빼줌
    else:                                                   #윤년이 아니면  
        seconds-=365*24*3600                                #평년에 해당하는 초를 빼줌
    
    

monthlist=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ] #월별 일수 리스트 
if (isleapyear(year)):                                      #윤년이면 
    monthlist[1]=29                                         #2월을 29일로 설정 


for m in range(12):                                         #12 개월을 반복하면서
    if(seconds<monthlist[m]*24*3600):                       #남은시간이 지금 달보다 작다면  
        month=m+1                                           #month를 m+1로 월은 0부터가 아니고  1월부터이므로 m+1 
        break    
    seconds-=monthlist[m]*24*3600                           #각 개월의 날에 대한 초에대해서 빼줌 

day = (seconds // (24*3600))+1                              #일에 해당하는 초로 나눈 몫+1 = 일자. 
                                                            #day는 0이 아니고 1부터 시작하기때문에 +1)

seconds=seconds%(24*3600)                                   #시간을 구하기위해 나머지를 취함 

hour = seconds // 3600                                      #1시간에 해당하는 초로 나눈 몫이 시간
min = (seconds // 60) % 60                                  #현재 분
second = (seconds % 60)                                     #현재 초
    


print("현재시간은",year,"년", month,"월", day,"일", hour,"시", min,"분", second,"초",dayofweeks[dayofweek],"요일입니다.")
[출처] 파이썬 time으로 날짜 시간 구하기|작성자 용용