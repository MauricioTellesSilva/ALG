void main(){
    String buffer="";
    int capamax=400,capasem=0, capadia=0;
    boolean transbordou=false;
    for(int i =0;i<7;i++){
        buffer=IO.readln("Entre com a quantidade de chuva no dia "+(i+1)+" em litros: ");
        capadia=Integer.parseInt(buffer);
        capasem=capadia+capasem;
        if (capasem>=capamax){
            transbordou=true;
            IO.println("O reservatorio vazou no dia "+(i+1));
            break;
        }
    }
    if (!transbordou){
        IO.println("O reservatorio nao transbordou. Espaco livre: "+(capamax-capasem));
    }
        
}
