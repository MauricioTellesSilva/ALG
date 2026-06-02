void main (){
    Random rnd = new Random();
    int segredo = rnd.nextInt(1,101);
    String buffer = IO.readln("Entre com seu palpite (1 a 100): "); 
    int n = Integer.parseInt(buffer);
    int i=1;
    do {
        if (n < segredo) {
            IO.println("O número é maior que " + n + ". Tente novamente.");
            i+=1;
        } 
        else {
            IO.println("O número é menor que " + n + ". Tente novamente.");
            i+=1;
        }
        buffer = IO.readln("Entre com seu palpite (1 a 100): ");
        n = Integer.parseInt(buffer);
    } while (n != segredo);

    IO.println("Parabéns! Você acertou com "+i+" tentativas!");

}