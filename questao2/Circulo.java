class Circulo implements ObjetoGeometrico {
    private double raio;

    public Circulo(double raio) {
        this.radius = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circle[raio=" + radio + "]";
    }
}

