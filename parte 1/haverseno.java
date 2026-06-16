void main() {
    double d,r,h1,h2,o1,o2;
    String buffer = IO.readln("Entre com a lat e lon do ponto 1: ");
    String[] partes = buffer.split(" ");
    double lat1 = Double.parseDouble(partes[0]);
    double lon1 = Double.parseDouble(partes[1]);
    String buffer = IO.readln("Entre com a lat e lon do ponto 2: ");
    String[] partes = buffer.split(" ");
    double lat2 = Double.parseDouble(partes[0]);
    double lon2 = Double.parseDouble(partes[1]);

    r = 6371.0; // raio da Terra em km

    h1 = Math.toRadians(lat1);
    h2 = Math.toRadians(lat2);
    o1 = Math.toRadians(lon1);
    o2 = Math.toRadians(lon2);
    d= (r*2)*Math.arcsin(Math.sqrt(Math.hav(h2-h1)+Math.cos(h1)*Math.cos(h2)*hav(o2-o1)));
    

    IO.println("Resultado: " + d + " km");
}
