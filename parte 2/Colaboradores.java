void main (){
    String buffer;
    double salario,horas,pagamento,total;
    total=0;
    int i =1;
    while (i<=3){
        buffer=IO.readln("Salario:");
        salario= Double.parseDouble(buffer);
        buffer=IO.readln("Horas trabalhadas: ");
        horas= Double.parseDouble(buffer);
        pagamento = salario *horas;
        IO.print("Pagamento: R$ " + pagamento);
        total += pagamento;
        i++;  
    }
    IO.print("Total: R$" + total);
}