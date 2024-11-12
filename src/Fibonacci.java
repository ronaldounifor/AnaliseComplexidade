public class Fibonacci {

    private double[] valores;

    public Fibonacci(int indice) {
        this.valores = new double[indice + 1];
    }

    public double calcularRecTopDown(int indice) {
        if(indice < 2) return indice;
        
        return calcularRecTopDown(indice - 1) + calcularRecTopDown(indice - 2);
    }

    public double calcularRecTopDownPD(int indice) {
        
        if(indice < 2) {
            valores[indice] = indice;
            return indice; 
        }
        
        if(valores[indice - 1] == 0) { 
            valores[indice - 1] = calcularRecTopDownPD(indice - 1);
        }
        
        if(valores[indice - 2] == 0) {
            valores[indice - 2] = calcularRecTopDownPD(indice - 2);
        }

        return valores[indice - 1] + valores[indice - 2];
    }

    private double calcularIteBottomUp(int indice) {
        if(indice < 2) return indice;
        
        int anterior = 0;
        System.out.println("Calculando o Fib(0)");
        int atual = 1;
        System.out.println("Calculando o Fib(1)");
        int resultado = 0;

        for (int i = 2; i <= indice; i++) {
            System.out.println("Calculando o Fib("+i+")");
            resultado = atual + anterior;
            anterior = atual;
            atual = resultado;
        }
        
        return atual;
    }
}
