import java.util.Random;

void main() {
    Random rnd = new Random();
    int[] histograma = new int[13];
    String buffer = IO.readln("Entre com o número de rolagens");
    int numrolagens = Integer.parseInt(buffer);
    for (int i = 0; i <= numrolagens; i++) {
        int dado1 = rnd.nextInt(1, 7);
        int dado2 = rnd.nextInt(1, 7);
        int soma = dado1 + dado2;
        histograma[soma] += 1;
    }
    for (int soma = 2; soma <= 12; soma++) {
        IO.println(String.format("%2d", soma) + ":" + (100.0 * histograma[soma] / numrolagens) + "%");
    }
}