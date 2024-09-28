"""
ZOAC 4
문제: https://www.acmicpc.net/problem/23971
"""
w, h, n, m = map(int, input().split())

r, c = (w-1) // (n+1) + 1, (h-1) // (m+1) + 1

print(r*c)