"""
줄세우기
문제: https://www.acmicpc.net/problem/10431
"""
import sys

input = sys.stdin.readline

n = int(input())

for _ in range(n):
    p, *arr = map(int, input().split())
    res = 0

    for i in range(20):
        for j in range(i):
            if arr[i] < arr[j]:
                res+=1
    print(p, res)