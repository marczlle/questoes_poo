public class CachorroGrande extends Cachorro {

    public CachorroGrande(String nome) {
        super(nome);
    }

    @Override
    public void cumprimentar() {
        System.out.println("Auão");
    }

    @Override
    public void cumprimentar(Cachorro outro) {
        System.out.println("Auuuuão");
    }

    public void cumprimentar(CachorroGrande outro) {
        System.out.println("Auuuuuuuuão");
    }
}
