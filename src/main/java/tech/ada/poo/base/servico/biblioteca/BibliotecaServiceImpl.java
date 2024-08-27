package tech.ada.poo.base.servico.biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class BibliotecaServiceImpl {

    protected BibliotecaRepositorio repositorio; // interface tá?

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean consultar(String titulo) {
        return repositorio.consultar(titulo);
    }

}
