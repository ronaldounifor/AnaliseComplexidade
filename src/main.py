def sum_elements(arr):
    n = len(arr)

    if n == 0:
        return 0
    elif n == 1:
        return arr[0]
    
    mid = n // 2
    left_sum = sum_elements(arr[:mid])
    right_sum = sum_elements(arr[mid:])
    
    return left_sum + right_sum

arr = [1, 2, 3, 4, 5]
result = sum_elements(arr)
print(result)

# T(n) = 2T(n/2) + 1

# a = 2
# b = 2

# n^(log_b(a)) = n^(log_2(2)) = n

#  n       vs        1

# CASO 1: 1 = O(n^0,9) p/ε = 0,1
# CASO 2: 1 = Θ(n)
# CASO 3: 1 = Ω(n^1,1) p/ε = 0,1

# Θ(n)