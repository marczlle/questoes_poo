package teste;

public Circulo(double raio) {
    this.raio = raio;
}

@Override
public double obterPerimetro() {
    return 2 * Math.PI * raio;
}

@Override
public double obterArea() {
    return Math.PI * raio * raio;
}

@Override
public String toString() {
    return "Circulo[raio=" + raio + "]";
}
