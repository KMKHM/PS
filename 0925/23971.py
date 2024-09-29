#Zoac4

H, W, N, M = map(int, input().split())

# 세로로 (N + 1) 간격으로 몇 명 앉을 수 있는지 계산
row_count = (H // (N + 1)) + (1 if H % (N + 1) > 0 else 0)

# 가로로 (M + 1) 간격으로 몇 명 앉을 수 있는지 계산
col_count = (W // (M + 1)) + (1 if W % (M + 1) > 0 else 0)

# 최대 수용 가능한 인원은 row_count * col_count
max_people = row_count * col_count

# 결과 출력
print(max_people)