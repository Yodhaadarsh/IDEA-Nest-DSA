def search(a, t):
    for x in a:
        if x == t:
            return True
    return False
a = [10,20,30,40,50]

print(search(a,30))
