package tech.ada.poo.base.servico.biblioteca;

public class MainBiblioteca {

    public static void main(String[] args) {

        ItemCatalogo livroabc = new Livro("livro abc");

        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();

        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorio);
        bibServiceFisica.cadastrar( livroabc );

        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl();
        bibServiceVirtual.reservar();

    }

}
