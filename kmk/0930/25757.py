"""
임스와 함께하는 미니게임
문제: https://www.acmicpc.net/problem/25757
"""
import sys

input = sys.stdin.readline

n, game = input().split()

n = int(n)

s = set([input().rstrip() for _ in range(n)])

if game == "Y":
    print(len(s))
elif game == "F":
    print(len(s)//2)
else:
    print(len(s)//3)