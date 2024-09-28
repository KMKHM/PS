"""
등수 구하기
문제: https://www.acmicpc.net/problem/1205
"""
import sys

input = sys.stdin.readline

n, m, p = map(int, input().split())

if not n and p:
    print(1)
    sys.exit(0)

nums = list(map(int, input().split()))

if n == p and nums[-1] >= m:
    print(-1)
    sys.exit(0)


res = n + 1

for i in range(n):
    if nums[i] <= m:
        res = i + 1
        break
print(res)