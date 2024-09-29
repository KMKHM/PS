str = input().upper()

letter= {}
for i in str:
	if i not in letter:
		letter[i]=1
	else:
		letter[i]+=1

max_count = max(letter.values())
max_letters = [key for key, value in letter.items() if value == max_count]

if len(max_letters) > 1:
	print('?')
else:
	print(max_letters[0])


	