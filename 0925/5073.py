while True:
    A, B, C = map(int, input().split())

    # 종료 조건
    if A == 0 and B == 0 and C == 0:
        break

    # 세 변을 오름차순으로 정렬
    sides = sorted([A, B, C])

    # 삼각형 조건: 가장 긴 변의 길이 <= 나머지 두 변의 길이의 합
    if sides[0] + sides[1] <= sides[2]:
        print("Invalid")
    else:
        # 세 변의 길이가 모두 같은 경우
        if A == B == C:
            print("Equilateral")
        # 두 변의 길이만 같은 경우
        elif A == B or B == C or A == C:
            print("Isosceles")
        # 세 변의 길이가 모두 다른 경우
        else:
            print("Scalene")