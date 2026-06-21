void main (){
    String buffer=IO.readln("Entre com o n maximo: ");
    int nm=Integer.parseInt(buffer);
    imprimePascal(nm);
}
void imprimePascal(int nm){
    for (int n=0; n<=nm;n++){
        for (int k=0;k<=n;k++){
            IO.println(coeficienteBinominal(n, k)+" ");
        }
        IO.println();
    }
}
int coeficienteBinominal(int n, int k){
    return potencialFatorial(n,k)/potencialFatorial(k,k);
}
int potencialFatorial(int base, int expoente){
    int resultado=1;
    while (expoente>0){
        resultado *=base;
        base -=1;
        expoente-=1;
    }
    return resultado;
}