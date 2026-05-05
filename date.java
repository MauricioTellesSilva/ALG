
void main() {
     int data,year;
     String datainf,month;
     String entrada =IO.readln("Digite a data em dd/mm/aaaa:");
     String [] partes =entrada.split("/");
     data=Integer.parseInt(partes[0]);
     month=partes[1];
     year=Integer.parseInt(partes[2]);

     switch (data) {
        case 1,21,31 -> datainf ="st";
        case 2,22 -> datainf="nd";
        case 3,23 -> datainf="rd"; 
        default -> datainf="th";
     }
     switch (month){
        case "01" -> month="January"  ;
        case "02" -> month="February"  ;
        case "03" -> month="March"  ;
        case "04" -> month="April"  ;
        case "05" -> month="May"  ;
        case "06" -> month="June"  ;
        case "07" -> month="July"  ;
        case "08" -> month="August"  ;
        case "09" -> month="September"  ;
        case "10" -> month="October"  ;
        case "11" -> month="November"  ;
        case "12" -> month="December"  ;
     }
    IO.println(month+" "+data+datainf+", "+year);

     
     
}

