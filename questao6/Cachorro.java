public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void cumprimentar() {
        System.out.println("Au au");
    }
  
    public void cumprimentar(Cachorro outro) {
        System.out.println("Auuuuuu");
    }
}
