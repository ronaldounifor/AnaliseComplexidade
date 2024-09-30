public class Pesquisa {

    public void pesquisar(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == elemento)
                System.out.println("Achei na posicao "+i);
        }
    }

    /**
     * T(n) = T(n - 1) + c = cn = Θ(n)
     */
    public void pesquisarLinear(int[] array, int elemento, int atual) {
        if(array[atual] == elemento)
            System.out.println("Achei na posicao "+atual);
        else
            pesquisarLinear(array, elemento, atual + 1);
    }

    /**
     * T(n) = T(n/2) + 1
     * 
     * a = 1
     * b = 2
     * 
     * n^(log_b(a)) = n^(log_2(1)) = n^0 = 1
     * 
     * 1    vs    1
     * 
     * CASO 2: 1 = Θ(1)
     * 
     * Θ(lg n)
     */
    public void pesquisaBinaria(int[] array, int elemento, int inicio, int fim) {
        if(inicio == fim) {
            System.out.println("Achei na posicao "+inicio);
            return;
        }

        int meio = (int) Math.floor((double) (inicio + fim) / 2);

        if(elemento <= array[meio]) {
            pesquisaBinaria(array, elemento, inicio, meio);
        } else {
            pesquisaBinaria(array, elemento, meio + 1, fim);
        }

    }
}
