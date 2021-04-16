import random 

print("동전던지기 게임을 시작합니다.")

result = random.randrange(2)

if result == 1:
    print("앞면입니다")
else:
    print("뒷면입니다.")

print(result)