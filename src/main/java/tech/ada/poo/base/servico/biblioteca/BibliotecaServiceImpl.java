package tech.ada.poo.base.servico.biblioteca;

public class BibliotecaServiceImpl implements BibliotecaService {
    @Override public void reservar() {
        System.out.println("reservar");
    }

    @Override public void emprestar() {
        System.out.println("emprestar");
    }

    @Override public void devolver() {
        System.out.println("devolver");
    }

    @Override public void consultar() {
        System.out.println("consultar");
    }

}
