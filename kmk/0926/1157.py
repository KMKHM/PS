"""
단어 공부
문제: https://www.acmicpc.net/problem/1157
"""
from collections import Counter

s = input().rstrip()

dic = Counter()

for c in s:
    dic[c.upper()] += 1

res = sorted([[j, i] for i, j in dic.items()], reverse=True)

if len(res) == 1:
    print(res[0][1])
else:
    print("?" if res[0][0] == res[1][0] else res[0][1])