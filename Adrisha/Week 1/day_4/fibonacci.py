def fibonacci(num):
    if num <= 1:
        return num
    else:
        return fibonacci(num-1) + fibonacci(num-2)
n = 6
print("fibonacci series:")

for i in range(n):
    print(fibonacci(i), end=" ")
