void main() {
    String buffer = IO.readln("Entre com a operação: ");
    String[] partes = buffer.split(" ");
    double x = Double.parseDouble(partes[0]);
    String operador = partes[1];
    double y = Double.parseDouble(partes[2]);

    if (operador.equals("/") && y == 0.0) {
        throw new RuntimeException("Divisão por zero");
    }

    double resultado = switch (operador) {
        case "+" -> x + y;
        case "-" -> x - y;
        case "*" -> x * y;
        case "/" -> x / y;
        default -> throw new RuntimeException("Operador inválido: " + operador);
    };

    IO.println("Resultado: " + resultado);
}
