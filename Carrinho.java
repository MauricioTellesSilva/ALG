void main() {
    String buffer=IO.readln("Digite o numero de itens: ");
    int Narray=Integer.parseInt(buffer);
    int [] QuantItem=new int[Narray];
    Double[] ValorItem=new Double[Narray];
    Double[] SubtItem=new Double[Narray];
    Double Vtotal=0.0;
    for (int i=0;i<QuantItem.length;i++){
        buffer=IO.readln("Digite a quantidade do item "+(i+1)+" :");
        QuantItem[i]=Integer.parseInt(buffer);
        buffer=IO.readln("Digite o preco do item "+(i+1)+" :");
        ValorItem[i]=Double.parseDouble(buffer);
    }
    SubtItem=CalculaSubt(QuantItem, ValorItem, SubtItem);
    buffer=IO.readln("Digite o desconto: ");
    int desconto=Integer.parseInt(buffer);
    Vtotal=obetemTotalAposDesconto(SubtItem, desconto);
    IO.println("Total : R$"+Vtotal);

}
Double[] CalculaSubt(int[] QuantItem, Double[] ValorItem, Double[] SubtItem){
    for(int i=0;i<QuantItem.length;i++){
        SubtItem[i]=ValorItem[i]*QuantItem[i];
    }
    return SubtItem;
}
Double obetemTotalAposDesconto(Double[] subtotais, double desconto){
    Double total=0.0;
    for(int i=0;i<subtotais.length;i++){
        total +=subtotais[i];
    }
    total*=1-desconto/100;
    return total;
}
