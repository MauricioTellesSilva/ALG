void main() {
    String buffer=IO.readln("digite o numero de itens:");
    int itens=Integer.parseInt(buffer);
    int[] quantidades = new int [itens];
    double[] precos= new double [itens];
    for (int i=0; i<=(itens-1); i++){
      buffer= IO.readln("Quantidade do item "+(i+1)+":");
      quantidades[i] =Integer.parseInt(buffer);
      buffer= IO.readln("preco do item "+(i+1)+":");
      precos[i] =Double.parseDouble(buffer);
    }
    buffer = IO.readln("Entre com o desconto: ");
    double desconto= Double.parseDouble(buffer);
    double[] subtotais=calculaSubtotais(quantidades, precos);
    double total= obtemSomaTotal(subtotais, desconto);
    IO.println("o valor total:"+total);
}

double[] calculaSubtotais(int[] quantidades, double[] precos){
      double[] subtotais = new double[quantidades.length];
      for (int i=0; i<subtotais.length; i++){
        subtotais[i]=quantidades[i]*precos[i];
      }
      return subtotais;
}


double obtemSomaTotal(double[] valores, double desconto){
    double soma=0.0;
    for (int i=0; i<valores.length; i++){
        soma+=valores[i];
      }
    return soma * (1-desconto/100.0);
}