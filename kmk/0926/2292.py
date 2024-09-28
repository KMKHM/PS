"""
벌집
문제: https://www.acmicpc.net/problem/2292
"""

n = int(input())

cur, cnt = 1, 6

ans = 1

while cur<n:
    cur += cnt
    cnt += 6
    ans += 1

print(ans)