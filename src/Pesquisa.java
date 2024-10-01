public class Pesquisa {
    
    public int pesquisar(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++)
            if(elemento == array[i])
                return i;
        
        return -1;
    }

    public int pesquisaL(int[] array, int elemento) { 
        return pesquisaLinear(array, elemento, 0);
    }

    /*
     * T(n) = T(n-1) + c
     * 
     * T(n) = cn = Θ(n)
     */
    private int pesquisaLinear(int[] array, int elemento, int atual) { 
        if(array[atual] == elemento)
            return atual;
        
        return pesquisaLinear(array, elemento, atual + 1);
    }

    public int pesquisaBinaria(int[] array, int elemento) {
        return pesquisaBinaria(array, elemento, 0, array.length - 1);
    }

    /*
     * T(n) = 1 * T(n/2) + c
     *      = T(n/2) + 1
     * 
     * n^log_b(a)   vs  1
     * n^log_2(1)
     * n^0
     * 1            vs  1
     * 
     * CASO 2: 1 = Θ(1)
     * 
     * Θ(lgn)
     */
    private int pesquisaBinaria(int[] array, int elemento, int inicio, int fim) {
        if(inicio == fim)
            return inicio;

        int meio = (inicio + fim) / 2;

        if(elemento <= array[meio])
            return pesquisaBinaria(array, elemento, inicio, meio);
        else
            return pesquisaBinaria(array, elemento, meio + 1, fim);
    }
}