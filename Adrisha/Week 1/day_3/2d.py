rows = 3
cols = 3
matrix = []
for i in range(rows):
    row = []
    for j in range(cols):
        num = int(input())
        row.append(num)
    matrix.append(row)
print("Matrix:")
for row in matrix:
    print(row)
