package exercitando.metodos;

/**
 * Criar uma aplicação que calcula a área dos 3 quadriláteros
 * notáveis: quadrado, retângulo e trapézio.
 *
 * Use sobrecarga.
 * */

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício Quadrilátero");
        CalculoArea.area(3);
        CalculoArea.area(5d,5d);
        CalculoArea.area(7,8,9);
        CalculoArea.area(5f,5f);
    }
}
