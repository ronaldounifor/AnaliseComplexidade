
# Análise de complexidade de analise_numeros
# T(n) = n + 1 + n + n = 3n + 1 = O(n)
#
# 3n + 1 = O(n)
# 3n + 1 ≤ 3n + n = 4n
#
# c = 4, k = 1
def analise_numeros(lista):#                #comps  #vezes
    soma = 0
    positivos = 0
    negativos = 0
    
    for numero in lista:#                   1       n + 1
        soma += numero
        if numero > 0:#                     1       n
            positivos += 1
        elif numero < 0:#                   1       n
            negativos += 1
            
    return soma, positivos, negativos

# Exemplo de uso
numeros = [1, -2, 3, -4, 5, 0, -1]
resultado = analise_numeros(numeros)
print(f'A soma dos numeros: {resultado[0]}')
print(f'Numeros positivos: {resultado[1]}')
print(f'Numeros negativos: {resultado[2]}')