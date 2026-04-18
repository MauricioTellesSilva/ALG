void main() {
    String entrada;
    Double altura;
    IO.println("Digite sua altura em pés + polegadas:");
     entrada =IO.readln("Digite a altura em pés:");
     Double pes = Double.parseDouble(entrada);
     altura = ((pes*12)*2.54);
     entrada =IO.readln("Digite a altura em polegadas:");
     Double pol = Double.parseDouble(entrada);
     altura += (pol*2.54);
     altura /= 100;
     IO.println("Sua altura: "+altura+"m");




    
}