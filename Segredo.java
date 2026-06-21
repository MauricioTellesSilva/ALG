import java.util.Random;

void main() {
    Random rnd= new Random();
    String buffer="";
    int segredo= rnd.nextInt(1,100), tentativa=0, i=0;
    boolean acertou=false;
    while (!acertou){
        i++;
        buffer=IO.readln("Digite um numero inteiro de 1 a 100: ");
        tentativa=Integer.parseInt(buffer);
        if (tentativa > segredo);{
            IO.println("O numero e menor");
        }
        if (tentativa < segredo) {
            IO.println("O numero e maior");
        }
        else  {
            acertou=true;
        }
    }
    IO.println("Voce acertou em "+i+" tentativas");
}
