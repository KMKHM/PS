"""
덩치
문제: https://www.acmicpc.net/problem/7568
"""
import sys

input = sys.stdin.readline

n = int(input())

res, tmp = [1] * n, 0

nums = [list(map(int, input().split())) for i in range(n)]

for i in range(n):
    for j in range(n):
        if nums[i][0] < nums[j][0] and nums[i][1] < nums[j][1]:
            res[i] += 1

print(*res)