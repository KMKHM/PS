"""
올림픽
문제: https://www.acmicpc.net/problem/8979
"""
import sys

input = sys.stdin.readline

n, k = map(int, input().split())

nums, dic = [], dict()

for _ in range(n):
    p, *arr = map(int, input().split())
    nums.append(arr)
    dic[p] = arr

nums.sort(key=lambda x: (-x[0], -x[1], -x[2]))

print(nums.index(dic[k]) + 1)