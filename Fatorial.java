void main() {
    String buffer=IO.readln("Digite um numero inteiro:");
    int n=Integer.parseInt(buffer);
    int fat=1;
    while(n>1){
      fat *= n;
      n--;
    }
    IO.println("Fatorial: "+fat);
}
