
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    double altura =0;
    IO.println("Digite sua altura em pés + polegadas:");
    Double pes = sc.nextDouble();
    Double pol = sc.nextDouble();
    altura += ((pes*12)*2.54);
    altura += (pol*2.54);
    altura /= 100;
    IO.println("Sua altura: "+altura+"m");
    sc.close();  
}