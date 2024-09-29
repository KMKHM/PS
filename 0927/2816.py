channels=[]
control =''

arrow=0

N = int(input())
for i in range(N):
	channel=input().strip()
	channels.append(channel)


first_idx= channels.index('KBS1')
second_idx= channels.index('KBS2')

for _ in range(first_idx):
    control += '1'
    arrow += 1
for _ in range(first_idx):
    control += '4'
    channels[arrow], channels[arrow - 1] = channels[arrow - 1], channels[arrow]
    arrow -= 1
    
second_idx = channels.index('KBS2')
for _ in range(second_idx - arrow):
    control += '1'
    arrow += 1
for _ in range(second_idx - 1):
    control += '4'
    # KBS2를 한 칸씩 위로 옮김
    channels[arrow], channels[arrow - 1] = channels[arrow - 1], channels[arrow]
    arrow -= 1

print(control)
