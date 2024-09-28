"""
비밀번호 발음하기
문제: https://www.acmicpc.net/problem/4659
"""
import sys

input = sys.stdin.readline

v = "aeiou"
c = "bcdfghjklmnpqrstvwxyz"

while 1:
    s, flag = input().rstrip(), False

    if s == "end":
        break

    for i in v:
        if i in s:
            flag = True
            break

    if not flag:
        print("<" + s + ">" + " is not acceptable.")
        continue

    if len(s) >= 3:
        for i in range(0, len(s)-2):
            if (s[i] in v and s[i + 1] in v and s[i + 2] in v) or (s[i] in c and s[i + 1] in c and s[i + 2] in c):
                flag = False
                break

    if not flag:
        print("<" + s + ">" + " is not acceptable.")
        continue

    for i in v+c:
        if i*2 in s and i*2 not in ["oo", "ee"]:
            flag = False
            break

    if not flag:
        print("<" + s + ">" + " is not acceptable.")
        continue

    print("<" + s + ">" + " is acceptable.")