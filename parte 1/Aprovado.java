
import java.util.Scanner;

void main() {
    boolean aprovado=false;
    Scanner sc = new Scanner(System.in);

    IO.println("Digite a nota da p1 e r1: ");
    Double p1 = sc.nextDouble();
    Double r1 = sc.nextDouble();

    IO.println("Digite a nota da p2 e r2: ");
    Double p2 = sc.nextDouble();
    Double r2 = sc.nextDouble();

    IO.println("Digite a nota da p3 e r3: ");
    Double p3 = sc.nextDouble();
    Double r3 = sc.nextDouble();

    IO.println("Digite sua frequencia (em %):");
    int frequencia = sc.nextInt();
    p1 = Math.max(p1,r1);
    p2 = Math.max(p2,r2);
    p3 = Math.max(p3,r3);

    Double media =(p1+p2+p3)/3;
    long mediar = Math.round(media);

    if (mediar >=6 && frequencia>=75 ) {
      aprovado=true;  
    }

    IO.println("Media:"+media);
    IO.println("Media aredondada:"+mediar);
    IO.println("Aprovado:"+aprovado);
    

    sc.close();  
}
