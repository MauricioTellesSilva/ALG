void main() {
    String[] HorariosPartida={"8:00","9:43","11:19","12:47","14:00","15:45","19:00","21:45"};
    String[] HorariosChegada={"10:16","11:52","13:31","15:00","16:08","17:55","21:20","23:58"};
    int cntvoos=HorariosPartida.length;
    IO.println("Hoje temos "+cntvoos+" voos disponveis");
    String buffer=IO.readln("Digite o horario atual (HH:MM): ");
    String[] buffersepa=buffer.split(":");
    int HorarioDigitado=Integer.parseInt(buffersepa[0]);
    HorarioDigitado*=60;    
    HorarioDigitado+=Integer.parseInt(buffersepa[1]);
    String HorariosJuni;
    String [] HorariosSepi;
    int Horariosi=0;
    boolean VooEncontrado=false;
        for (int i=0;i<HorariosChegada.length;i++){
            HorariosJuni=HorariosPartida[i];
            HorariosSepi=HorariosJuni.split(":");
            Horariosi=Integer.parseInt(HorariosSepi[0]);
            Horariosi*=60;
            Horariosi+=Integer.parseInt(HorariosSepi[1]);
            if (HorarioDigitado<Horariosi){
                IO.println("Proxima partida: " + HorariosPartida[i]); 
                IO.println("Horario de chegada: " + HorariosChegada[i]);
                VooEncontrado=true; 
                break;
            }
        }
        if (!VooEncontrado){
            IO.println("Não há mais voos disponíveis hoje");
        }



}

