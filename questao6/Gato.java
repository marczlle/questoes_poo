public class Gato extends Animal {
    
    public Gato(String nome) {
        super(nome);
    }
    
    @Override
    public void cumprimentar() {
        System.out.println("Miau");
    }
}
