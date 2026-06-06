#square pattern 
for i in range(5):
    for j in range(5):
        print("*", end=" ")
    print()
#right angle triangle pattern
for i in range(5):
    for j in range(i+1):
        print("*", end=" ")
    print() 
#inverted right angle triangle pattern
for i in range(5):
    for j in range(5-i):
        print("*", end=" ")
    print()
#pyramid pattern
for i in range(5):
    for j in range(5-i):
        print(" ", end=" ")
    for k in range(i+1):
        print("*", end=" ")
    print()
#inverted pyramid pattern
for i in range(5):
    for j in range(i):
        print(" ", end=" ")
    for k in range(5-i):
        print("*", end=" ")
    print()
#diamond pattern
for i in range(5):
    for j in range(5-i):
        print(" ", end=" ")
    for k in range(i+1):
        print("*", end=" ")
    print()
for i in range(4):
    for j in range(i+1):
        print(" ", end=" ")
    for k in range(4-i):
        print("*", end=" ")
    print() 
#floyd's triangle pattern
num = 1

for i in range(1, 6):
    for j in range(i):
        print(num, end=" ")
        num += 1
    print()
