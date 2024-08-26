package tech.ada.poo.base.servico.biblioteca;

public interface BibliotecaServiceFisica extends BibliotecaService {

    void emprestar();
    void devolver();
    void cadastrar(ItemCatalogo item);

}
