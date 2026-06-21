void main () {
    String buffer=IO.readln("Entre com numeros separados por espaco: ");
    String[] partes=buffer.split(" ");
    int[] numeros=new int[partes.length];
    for (int i=0; i<numeros.length;i++){
        numeros[i]=Integer.parseInt(partes[i]);
        IO.println("Numero da posicao "+i+" :"+numeros[i]);
    } 
}
