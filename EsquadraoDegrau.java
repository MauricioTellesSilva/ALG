void main() {
    String buffer=IO.readln("Digite um numero inteiro:");
    int n=Integer.parseInt(buffer);
    if (ehdegrau(n)){
        IO.println("O numero "+n+" e integrante do esquadrao do degrau");
    } else {
        IO.println("O numero "+n+" e nao integrante do esquadrao do degrau");
    }
}

boolean ehdegrau (int n){
    int i = 1, soma = 0;
    while (soma < n) {
        soma += i;
        i++;
    }
    return soma == n;
}