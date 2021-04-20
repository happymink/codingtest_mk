my_string = input("평문을 입력하세요: ")
length = len(my_string) # 문자열의 길이 측정
reverse_string = '' #역 문자열 생성

#역 문자열을 저장
for char in my_string:
    reverse_string = char + reverse_string

# 문자열의 길이 n 이 홀수일 경우 중간지점을 n+1로 설정
if length % 2  == 1: #홀수
    middle = int(length / 2) + 1

print("처음에 있는 글자: ",my_string[0])
print("중간에 있는 글자: ",my_string[middle-1])
print("마지막에 있는 글자: ",my_string[length-1])
print("거꾸로 암호문: ",reverse_string)