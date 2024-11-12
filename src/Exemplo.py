def multiplicar_matrizes(A, B):
    n = len(A)
   
    if n == 1:
        return [[A[0][0] * B[0][0]]]

    m = n // 2
    A11 = [row[:m] for row in A[:m]]
    A12 = [row[m:] for row in A[:m]]
    A21 = [row[:m] for row in A[m:]]
    A22 = [row[m:] for row in A[m:]]
   
    B11 = [row[:m] for row in B[:m]]
    B12 = [row[m:] for row in B[:m]]
    B21 = [row[:m] for row in B[m:]]
    B22 = [row[m:] for row in B[m:]]

    C11 = somar_matrizes(multiplicar_matrizes(A11, B11), multiplicar_matrizes(A12, B21))
    C12 = somar_matrizes(multiplicar_matrizes(A11, B12), multiplicar_matrizes(A12, B22))
    C21 = somar_matrizes(multiplicar_matrizes(A21, B11), multiplicar_matrizes(A22, B21))
    C22 = somar_matrizes(multiplicar_matrizes(A21, B12), multiplicar_matrizes(A22, B22))

    return combinar_matrizes(C11, C12, C21, C22)

def somar_matrizes(A, B):
    return [[A[i][j] + B[i][j] for j in range(len(A))] for i in range(len(A))]

def combinar_matrizes(C11, C12, C21, C22):
    n = len(C11)
    C = [[0] * (2 * n) for _ in range(2 * n)]
   
    for i in range(n):
        for j in range(n):
            C[i][j] = C11[i][j]
            C[i][j + n] = C12[i][j]
            C[i + n][j] = C21[i][j]
            C[i + n][j + n] = C22[i][j]

    return C

A = [[1, 2], [3, 4]]
B = [[5, 6], [7, 8]]
resultado = multiplicar_matrizes(A, B)

print("Resultado da multiplicação de matrizes:")
for linha in resultado:
    print(linha)