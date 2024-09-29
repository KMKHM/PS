import sys
# 여러 줄 input 받을 때 시간 초과 방지 위해서 필요
input = sys.stdin.readline 

count =int(input())
S=set()

for i in range(count):
	command = input().split()

	cal= command[0]
    # 명령어 뒤에 숫자가 붙지 않을 경우를 대비
	if len(command) >1:
		num= int(command[1])

	if cal == 'add':			
		S.add(num)
	elif cal == 'check':
		if num in S:
			print(1)
		else:
			print(0)
	elif cal == 'remove':
		S.discard(num)
	elif cal == 'toggle':
		if num in S:
			S.remove(num)
		else:
			S.add(num)
	elif cal == 'all':
		S=set(range(1,21))
	elif cal == 'empty':
		S.clear()