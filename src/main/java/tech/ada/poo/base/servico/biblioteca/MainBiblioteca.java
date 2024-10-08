package tech.ada.poo.base.servico.biblioteca;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;
import tech.ada.poo.base.servico.biblioteca.model.Livro;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorioListImpl;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorioMapImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisica;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisicaImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceVirtual;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceVirtualImpl;

public class MainBiblioteca {

    public static void main(String[] args) {

        // instanciando interfaces de servico e injetando repositorio nelas
        BibliotecaRepositorio repositorioList = new BibliotecaRepositorioListImpl();
        BibliotecaRepositorio repositorioMap = new BibliotecaRepositorioMapImpl(); // falta impl!

        BibliotecaServiceFisica bibServiceFisica = new BibliotecaServiceFisicaImpl(repositorioList);
        BibliotecaServiceVirtual bibServiceVirtual = new BibliotecaServiceVirtualImpl(repositorioList);

        // livros
        ItemCatalogo labc = new Livro("livro abc");
        ItemCatalogo lalmanaque = new Livro("almanaque carros");

        // cadastro e consulta
        bibServiceFisica.cadastrar( labc );
        ItemCatalogo r1 = bibServiceFisica.consultar( "livro abs" );
        ItemCatalogo r2 = bibServiceFisica.consultar( "livro abc" );
        System.out.println(r1 + " "+ r2);

        // cadastro existente
        // TODO implementar cenario

        // reservar
        String titulo = r2.getTitulo();
        String reserva = bibServiceFisica.reservar(titulo);
        System.out.println( "reserva " + reserva  );

    }

    abstract class Maquina {
        void ligar() {
            throw new RuntimeException("vc precisa ligar uma maquina de verdade");
        }
    }
    class Geladeira extends Maquina {
        void ligar() {
            // ok
        }
        void ligar(String pin) { // sobrecarga
            // ok
        }

        int[] x = new int[] {1,2};
        int[] y = new int[5];
        Integer[] z = new Integer[5];
    }

}
