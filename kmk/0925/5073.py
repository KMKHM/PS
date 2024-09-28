"""
삼각형과 세 변
문제: https://www.acmicpc.net/problem/5073
"""
import sys

input = sys.stdin.readline

while True:
    nums = sorted(map(int, input().split()))

    if sum(nums) == 0:
        sys.exit(0)

    if nums[0] + nums[1] <= nums[2]:
        print("Invalid")
        continue

    if nums[0] == nums[1] and nums[1] == nums[2]:
        print("Equilateral")
        continue

    if nums[0] == nums[1] or nums[1] == nums[2] or nums[0] == nums[2]:
        print("Isosceles")
        continue

    if nums[0] != nums[1] and nums[1] != nums[2] or nums[0] != nums[2]:
        print("Scalene")
        continue