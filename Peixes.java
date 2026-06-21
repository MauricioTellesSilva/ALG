void main () {
    String buffer =IO.readln("Digite o Ph minimo: ");
    Double Phmn=Double.parseDouble(buffer);
    buffer =IO.readln("Digite o Ph maximo: ");
    Double Phmax=Double.parseDouble(buffer);
    buffer =IO.readln("Digite o numero de medicoes: ");
    int md=Integer.parseInt(buffer);
    int i=1;
    int frmd=0;
    int interacao=0;
    while (md>i){
        buffer=IO.readln("Digite a medicao "+i+" :");
        interacao=Integer.parseInt(buffer);
        if (interacao>Phmax){

        } else if (interacao<Phmn){

        } else {
            
        }
    }


}