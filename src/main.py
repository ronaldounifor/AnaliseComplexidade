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