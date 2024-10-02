public class Pesquisa {
    
    /*
     * T(n) = n + 1 + n = 2n + 1 = Θ(n)
     */
    public int pesquisar(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) // n + 1
            if(array[i] == elemento) // n
                return i;

        return -1;
    }

    public int pesquisaLinear(int[] array, int elemento) {
        return pesquisaLinear(array, elemento, 0);
    } 

    /*
     * 
     */
    private int pesquisaLinear(int[] array, int elemento, int atual) {
        if(array[atual] == elemento)
            return atual;

        return pesquisaLinear(array, elemento, atual + 1);
    }

    public int pesquisaBinaria(int[] array, int elemento) {
        return pesquisaBinaria(array, elemento, 0, array.length - 1);
    } 

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
