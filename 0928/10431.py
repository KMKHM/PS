N = int(input().strip())

for _ in range(N):
	data = list(map(int, input().strip().split())) 
  T = data[0]  
  students = data[1:]
  
  foot = 0
  
  result = []
  
	for student in students:
        position = 0
        while position < len(result) and result[position] < student:
            position += 1
        
        result.insert(position, student)
        
        foot += len(result) - position - 1

    print(T, foot)