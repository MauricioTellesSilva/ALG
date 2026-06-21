void main(){
    String buffer= IO.readln("Digite o angulo: ");
    int angulo=Integer.parseInt(buffer);
    int voltas=angulo/360;
    angulo=angulo-(voltas*360);
    int dir=angulo/45;
    String Ndir= "";
    switch(dir) {
        case 0:
            Ndir="N";
        break;
        case 1:
            Ndir="NE";
        break;
        case 2:
            Ndir="E";
        break;
        case 3:
            Ndir="SE";
        break;
        case 4:
            Ndir="S";
        break;
        case 5:
            Ndir="SW";
        break;
        case 6:
            Ndir="W";
        break;
        case 7:
            Ndir="NW";
        break;
        default:
            break;
    }
    IO.println(Ndir);
}
