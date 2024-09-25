public class App {
    public static void main(String[] args) {
        new GerenteMatriz(
            new int[][]{
                {3, 2, 1},
                {2, 9, 5},
                {2, 7, 8}
            }
        ).procurarUm(3);
    }
}