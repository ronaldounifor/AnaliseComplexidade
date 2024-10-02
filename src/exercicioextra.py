def combina(n):
    if n <= 1:
        return 1

    combinacoes = combina(n // 2) + combina(n // 2)

    for i in range(n):
        for j in range(n):
            print(f"i: {i}, j: {j}")

    return combinacoes

n = 8
resultado = combina(n)
print(f"O resultado para n={n} é {resultado}")
