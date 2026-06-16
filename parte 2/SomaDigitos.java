void main () {
    String buffer =IO.readln("Digite um numero inteiro nao negativo");
    int numero =Integer.parseInt(buffer);
    IO.print("Soma dos digitos:"+ somaDigitos(n));
}

int somaDigitos(int numero){
    int soma=0;
    while (numero>0){
        int digito = numero % 10;
        soma += digito;
        n/=10;
    }
    return soma;
}
