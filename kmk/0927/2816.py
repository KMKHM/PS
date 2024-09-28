"""
디지털 티비
문제: https://www.acmicpc.net/problem/2816
"""
import sys

input = sys.stdin.readline

n = int(input())

s = [input().rstrip() for _ in range(n)]


idx1, idx2 = s.index('KBS1'), s.index('KBS2')

print(idx1 * "1" + idx1 * "4" + idx2 * "1" + (idx2-1) * "4" if idx1 < idx2 else idx1 * "1" + idx1 * "4" + (idx2+1) * "1" + idx2 * "4")