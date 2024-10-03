import sys
# sys.stdin = open("input.txt")
# input = sys.stdin.readline

class myClass():
    def __init__(self, idx, gold, silver, bronze):
        self.idx = idx
        self.gold = gold
        self.silver = silver
        self.bronze = bronze
        
    def __repr__(self):
        return f"Idx: {self.idx}, Gold: {self.gold}, Silver: {self.silver}, Bronze: {self.bronze}"
    def __eq__(self, other):
        return (self.gold == other.gold and
                self.silver == other.silver and
                self.bronze == other.bronze)

N, target = map(int, input().split())

my_class_list = []
for _ in range(N):
    idx, gold, silver, bronze = map(int, input().split())
    my_class_list.append(
        myClass(
            idx=idx, 
            gold=gold, 
            silver=silver,
            bronze=bronze)
        )
    
#~ STEP2. 정렬 
my_class_list.sort(
    key=lambda x: 
        (-x.gold, -x.silver, -x.bronze)
        )

#~ STEP3. 순회하면서 rank 설정
rank = 1
pre = my_class_list[0]

for i in range(len(my_class_list)):
    #~ 같으면 넘어감
    if pre != my_class_list[i]:
        rank = i+1 
        pre = my_class_list[i]
    if target == my_class_list[i].idx:
        print(rank)