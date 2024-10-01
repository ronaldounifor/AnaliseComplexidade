def soma_recursiva(lista):
    n = len(lista)
    
    if n == 0:
        return 0
    
    elif n == 1:
        return lista[0]
    
    elif n == 2:
        return lista[0] + lista[1]
    
    parte1 = lista[:n//3]
    parte2 = lista[n//3:2*n//3]
    parte3 = lista[2*n//3:]
    
    return soma_recursiva(parte1) + soma_recursiva(parte2) + soma_recursiva(parte3)

# Exemplo de uso
lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]
resultado = soma_recursiva(lista)
print(f"A soma dos elementos da lista é: {resultado}")
