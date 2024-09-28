import sys

input = sys.stdin.readline

n = int(input())

dx, dy = (1, -1, 0, 0), (0, 0, 1, -1)

board = [list(input().rstrip()) for _ in range(n)]

tmp = True

hx, hy = 0, 0

# 왼팔 오른팔 허리 왼쪽다리 오른쪽다리
a, b, c, d, e = 0, 0, 0, 1, 1
# 심장
for i in range(n):
    if not tmp:
        break
    for j in range(n):
        if board[i][j] == "*":
            flag = True
            for k in range(4):
                nx, ny = i + dx[k], j + dy[k]
                if 0<=nx<n and 0<=ny<n and not board[nx][ny] == "*":
                    flag = False
                    break
            if flag:
                tmp = False
                hx, hy = i, j
                rhx, rhy = i, j
                lhx, lhy = i, j
                down_x, down_y = i, j


                while lhy > 0:
                    lhy -= 1
                    if board[lhx][lhy] == "*":
                        a += 1
                    else:
                        break
                while rhy < n-1:
                    rhy += 1
                    if board[rhx][rhy] == "*":
                        b += 1
                    else:
                        break

                while down_x < n-1:
                    down_x += 1
                    if board[down_x][down_y] == "*":
                        c += 1
                    else:
                        break

                rfx, rfy = down_x, down_y-1
                lfx, lfy = down_x, down_y+1

                while rfx < n-1:
                    rfx += 1
                    if board[rfx][rfy] == "*":
                        d += 1
                    else:
                        break

                while lfx < n-1:
                    lfx += 1
                    if board[lfx][lfy] == "*":
                        e += 1
                    else:
                        break


                break

print(hx+1, hy+1)
print(a, b, c, d, e)