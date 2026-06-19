void main() {
    double[]potenciasdedois=constroiProgressaogeometrica(1.0,2.0,5);
    for (int i=0; i<potenciasdedois.lenght; i++){
        IO.println(potenciasdedois[i]);
    }
}
double [] constroiProgressaogeometrica(double inicio, double razao, int numElementos){
    double[] pg = new double[numElementos];
    pg[0]=inicio;
    for (int i =1;i<numElementos; i++){
        pg[i] =razao *pg[i-1];  
    }
    return pg;
}