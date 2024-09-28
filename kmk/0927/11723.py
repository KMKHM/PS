"""
집합의 표현
문제: https://www.acmicpc.net/problem/11723
"""
import sys

input = sys.stdin.readline

s = set()

for _ in range(int(input())):
    op = list(input().split())

    if len(op) == 1:
        s = set() if op[0] == "empty" else set(i for i in range(1, 21))
    else:
        num = int(op[1])
        if op[0] == "add":
            s.add(num)
        elif op[0] == "remove":
            if num in s:
                s.remove(num)
        elif op[0] == "toggle":
            if num in s:
                s.remove(num)
            else:
                s.add(num)
        else:
            print(1 if num in s else 0)