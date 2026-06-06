def print_n(n):
    if n== 0:
        return

    print_n(n-1)
    print(n)

n = int(input("Enter n"))
print_n(n)
