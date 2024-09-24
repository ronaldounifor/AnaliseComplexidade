#9. Faça uma análise detalhada do código Python abaixo e defina um bom limite assintótico Θ:
def analise_numeros(lista):#                #comps  #vezes
    soma = 0
    positivos = 0
    negativos = 0
    
    for numero in lista:   #                1       n + 1
        soma += numero
        if numero > 0:     #                1       n
            positivos += 1
        elif numero < 0:   #                1       n
            negativos += 1
            
    return soma, positivos, negativos


numeros = [1, -2, 3, -4, 5, 0, -1]
resultado = analise_numeros(numeros)
print(f'A soma dos numeros: {resultado[0]}')
print(f'Numeros positivos: {resultado[1]}')
print(f'Numeros negativos: {resultado[2]}')

#10. Prove a relação descrito no item anterior
# T(n) = n + 1 + n + n = 3n + 1 = Θ(n)

# 3n + 1 = Θ(n)

# c1*n ≤ 3n + 1 ≤ c2*n

# 3n ≤ 3n + 1 ≤ 3n + n = 4n

# c1 = 3, c2 = 4, k = 1