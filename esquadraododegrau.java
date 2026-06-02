void main() {
    String buffer = IO.readln("Entre com um inteiro não-negativo: ");
    int n = Integer.parseInt(buffer);
    if (ehDregrau(n)) {
        IO.println(n + " é um agente do esquadrão do Degrau.");
    } else {
        IO.println(n + " não é um agente do esquadrão do Degrau.");
    }

}

boolean ehDregrau(int n) {
    int soma = 0;
    int i=1;
    while (soma < n) {
        soma +=i;
        i +=1;
    }
    return soma == n;
}