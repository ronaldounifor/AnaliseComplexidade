import random

def adivinha_numero(): #                                                    #comps  #vezes
    n = int(input("Numero max: "))
    numero_secreto = random.randint(1, n)
    tentativas = 0
    print("Bem-vindo ao jogo de adivinhação!")
    print(f"Tente adivinhar o número entre 1 e {n}.")

    while True:
        try:
            palpite = int(input("Seu palpite: "))
            tentativas += 1
            
            if palpite < 1 or palpite > n:    #                             2       n
                print(f"Por favor, escolha um número entre 1 e {n}.")
                continue

            if palpite < numero_secreto:         #                          1       n
                print("Muito baixo! Tente novamente.")
            elif palpite > numero_secreto:      #                           1       n
                print("Muito alto! Tente novamente.")
            else:
                print(f"Acertou {numero_secreto} em {tentativas}.")
                break
        except ValueError:
            print("Por favor, insira um número válido.")

if __name__ == "__main__":
    adivinha_numero()


# T(n) = 2n + n + n = 4n = Θ(n)

# 4n = Θ(n)

# 4n ≤ 4n ≤ 4n

# c1 = 4, c2 = 4, k = 1