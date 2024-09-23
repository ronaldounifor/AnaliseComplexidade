public class App {

    public static void main(String[] args) throws Exception {
        new GerenteMatriz(
            new int[][]{
                {1, 0, 4},
                {4, 5, 7},
                {8, 9, 4}
            }
        ).procurar(7);
    }
    
}