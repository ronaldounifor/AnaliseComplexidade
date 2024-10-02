public class App {
    public static void main(String[] args) {
        int resultado = new Pesquisa().pesquisaBinaria(new int[]{2, 3, 5, 9}, 2);
        
        System.out.println("Achei na posicao "+resultado);
    }
}