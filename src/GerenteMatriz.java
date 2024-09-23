public class GerenteMatriz {
    private int[][] matriz;

    public GerenteMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Análise de complexidade do método procurar:
     * 
     * T(n) = n + 1 + n² + n + n² = 2n² + 2n + 1 = O(n²)
     * 
     * 
     * 2n² + 2n + 1 = O(n²)
     * 2n² + 2n + 1 ≤ c*n²
     * 2n² + 2n + 1 ≤ 2n² + 2n² + n² = 5n²
     * 
     * c=5, k=1
     * 
     * @param elemento
     */
    public void procurar(int elemento) {  //                                                    #comps      #vezes
        System.out.println("Vamos procurar ["+elemento+"] na matriz acima:");//                 0
        for (int linha = 0; linha < matriz.length; linha++)//                                   1           n + 1
            for (int coluna = 0; coluna < matriz[linha].length; coluna++)//                     1           n(n+1) = n² + n
                if(matriz[linha][coluna] == elemento)//                                         1           n²
                    System.out.println("Achei na linha "+(linha+1)+" e coluna "+(coluna+1));//  0
    }
}