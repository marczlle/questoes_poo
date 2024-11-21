public class ResizableCirculo extends Circulo implements Resizable {
  public ResizableCirculo(double raio) {
    super(raio);
}

  @Override
public void redimensionar(int porcentagem) {
    raio = raio * (1 + porcentagem / 100.0);
}
  
@Override
public String toString() {
    return "CirculoRedimensionavel[raio=" + raio + "]";
}}
