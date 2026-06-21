void main() {
    String buffer=IO.readln("Digite um numero inteiro nao negativo:");
    int n=Integer.parseInt(buffer);
    int soma=SomaDigitos(n);
    IO.println(soma);
}
int SomaDigitos(int n){
    int s=0;
    int soma=0;
    while (n>0){
        s=n%10;
        n/=10;
        soma=soma+s;
    }
    return soma;
}
