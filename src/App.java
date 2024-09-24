public class App {
    public static void main(String[] args) throws Exception {
        new GerenteMatriz(
            new int[][]{
                {1, 2, 3},
                {2, 5, 7},
                {8, 9, 3}
            }
        ).procurarUm(2);
    }
}
