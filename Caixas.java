

void main() {
     String entrada;
     entrada =IO.readln("Digite a quatidade de caixas:");
     Double quantidade = Double.parseDouble(entrada);
     entrada =IO.readln("Digite o custo por m²:");
     Double custo_m2 =Double.parseDouble(entrada);
     entrada =IO.readln("Digite a altura (m):");
     Double altura = Double.parseDouble(entrada);
     entrada =IO.readln("Digite a largura (m):");
     Double largura = Double.parseDouble(entrada);
     entrada =IO.readln("Digite a profundidade (m):");
     Double comprimento = Double.parseDouble(entrada);
     double area=((comprimento*largura)*2)+((altura*largura)*2)+((altura*comprimento)*2);
     double volume=altura*largura*comprimento;
     IO.println("o custo por pela produção é:"+(quantidade*(custo_m2*area)));
     IO.println("A area da caixa é:"+area+"m²"+"  O volume da caixa é:"+volume+"m³");
}

