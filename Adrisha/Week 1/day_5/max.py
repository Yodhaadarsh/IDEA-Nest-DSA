def max_ele(a):
    m = a[0]

    for x in a:
        if x > m:
            m = x
    return m

a = [12, 45, 8, 67, 23]
print(max_ele(a))
