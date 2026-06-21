void main(){
    String buffer="";
    int capamax=400,capasem=0, capadia=0;
    for(int i =0;i>7;i++){
        buffer=IO.readln("Entre com a quantidade de chuva no dia "+i+" em litros: ");
        capadia=Integer.parseInt(buffer);
        capasem=capadia+capasem;
        if (capasem>=capamax){
            IO.println("O reservatorio vazou no dia "+i);
            break;
        }
    }    
}
