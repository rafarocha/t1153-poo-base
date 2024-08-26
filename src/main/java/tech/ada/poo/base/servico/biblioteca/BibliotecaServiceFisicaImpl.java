package tech.ada.poo.base.servico.biblioteca;

public class BibliotecaServiceFisicaImpl
    extends BibliotecaServiceImpl
        implements BibliotecaServiceFisica {

    private BibliotecaRepositorio repositorio;

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void reservar() {
        System.out.println("reservar");
    }

    @Override
    public void consultar() {
        System.out.println("consultar");
    }

    @Override
    public void emprestar() {
        System.out.println("emprestar");
    }

    @Override
    public void devolver() {
        System.out.println("devolver");
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        this.repositorio.cadastrar(item);
        System.out.println( "item " + item +  " cadastrado!" );
    }

}
