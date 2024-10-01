public class App {
    public static void main(String[] args) throws Exception {
        int resultado = new Pesquisa().pesquisaBinaria(new int[] {2, 3, 5, 7, 9}, 3);

        System.out.println("Achou na posicao " + resultado);




        // new GerenteMatriz(
        //     new int[][]{
        //         {1, 2, 3},
        //         {2, 5, 7},
        //         {8, 9, 3}
        //     }
        // ).procurarUm(2);
    }
}
