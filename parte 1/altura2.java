import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Digite sua altura em metros:");
    Double metros = sc.nextDouble();
    long pes= Math.round((((metros*100)/2.54)/12));
    long pol= Math.round(((metros*100)/2.54)-(pes*12));
    IO.println("Digite sua altura em pés + polegadas:"+pes+"'"+pol+'"');
    sc.close();  
}