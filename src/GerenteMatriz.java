public class GerenteMatriz {
    private int[][] matriz;

    public GerenteMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Análise de complexidade de tempo para o método procurar
     * 
     * T(n) = n + 1 + n² + n + n² = 2n² + 2n + 1 = O(n²)
     * 
     * 2n² + 2n + 1 = O(n²)
     * 
     * 2n² + 2n + 1 ≤ c*n²
     * 2n² + 2n + 1 ≤ 2n² + 2n² + 1n² = 5n²
     * 
     * c = 5, k = 1
     */
    public void procurar(int elemento) { //                                                         #comps  #vezes
        for (int linha = 0; linha < matriz.length; linha++) //                                      1       n + 1
            for (int coluna = 0; coluna < matriz.length; coluna++) //                               1       n(n + 1) = n² + n
                if(elemento == matriz[linha][coluna]) //                                            1       n*n = n²
                    System.out.println("Achei na linha " + (linha+1) + " e coluna "+(coluna+1));
    }

    /**
     * Análise de complexidade de tempo do melhor caso para o método procurarUm
     * 
     * T(n) = 1 + 1 + 1 = 3 = Ω(1)
     * 
     * 3 = Ω(1)
     * 
     * 3 ≥ c*1
     * 3 ≥ 3*1
     * 
     * c = 3, k = 1
     */
    public void procurarUm(int elemento) { //                                                     #comps  #vezes
        for (int linha = 0; linha < matriz.length; linha++) //                                    1       1
            for (int coluna = 0; coluna < matriz.length; coluna++) //                             1       1
                if(elemento == matriz[linha][coluna]) { //                                        1       1
                    System.out.println("Achei na linha " + (linha+1) + " e coluna "+(coluna+1));
                    return;
                }
    }
}
