# Swap two numbers using a temporary variable
a = 10
b = 20

temp = a
a = b
b = temp

# Swap two numbers without using a temporary variable
print("a =", a)
print("b =", b)

a = 10
b = 20

a, b = b, a

print("a =", a)
print("b =", b)

# Swap two numbers using arithmetic operations user input
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

temp = a
a = b
b = temp

print("After swapping:")
print("a =", a)
print("b =", b)

# Swap two numbers without using a temporary variable user input
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

a, b = b, a

print("After swapping:")
print("a =", a)
print("b =", b)