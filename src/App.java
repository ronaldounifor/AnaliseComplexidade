public class App {
    public static void main(String[] args) throws Exception {
        int n = 500;

        Fibonacci fib = new Fibonacci(n);

        System.out.println("Calculando...");
        double resultado = fib.calcularRecTopDownPD(n);
        System.out.println(resultado);
    }
}
