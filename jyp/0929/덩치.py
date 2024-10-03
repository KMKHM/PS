import sys
# sys.stdin = open("input.txt")
# input = sys.stdin.readline

N = int(input())

#~ N = 50으로 상당히 작으니 완탐으로 탐색
people_list = []
for _ in range(N):
    weight, height = map(int, input().split())
    people_list.append((weight, height))

#~ STEP1. 순회하면서 각각 뽑음

for people in people_list:
    target_w, target_h = people
    rank = 1
    for i in range(len(people_list)):
        if people_list[i][0] > target_w and people_list[i][1] > target_h :
                rank+=1
    print(rank, end=" ")