void main () {
    String buffer =IO.readln("Digite o Ph minimo: ");
    Double Phmn=Double.parseDouble(buffer);
    buffer =IO.readln("Digite o Ph maximo: ");
    Double Phmax=Double.parseDouble(buffer);
    buffer =IO.readln("Digite o numero de medicoes: ");
    int md=Integer.parseInt(buffer);
    int i=0;
    int frmd=0;
    Double interacao=0.0;
    while (md>i){
        buffer=IO.readln("Digite a medicao "+i+" :");
        interacao=Double.parseDouble(buffer);
        if (interacao>Phmax){
            frmd+=1;
        } else if (interacao<Phmn){
            frmd+=1;
        } 
        i++;
    }
    IO.println("Medicoes fora da faixa: "+frmd);
}