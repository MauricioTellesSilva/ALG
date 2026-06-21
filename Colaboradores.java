void main() {
    String buffer;
    double salario,horas,pagamento,total;
    total=0;
    int i=1;
    while(i<=3){
      buffer=IO.readln("Digite o salario:");
      salario=Double.parseDouble(buffer);
      buffer=IO.readln("Digite as horas trabalhadas");
      horas=Double.parseDouble(buffer);
      pagamento=salario*horas;
      total= total+pagamento;
    }
    IO.println("total pago:"+total);
}
