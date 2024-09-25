public class App {
    public static void main(String[] args) {
        new GerenteMatriz(
            new int[][]{
                {2, 9, 5},
                {3, 2, 1},
                {2, 7, 8}
            }
        ).procurar(2);
    }
}