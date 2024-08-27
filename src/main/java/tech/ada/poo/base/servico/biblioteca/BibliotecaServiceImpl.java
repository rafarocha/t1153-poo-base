package tech.ada.poo.base.servico.biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class BibliotecaServiceImpl {

    protected BibliotecaRepositorio repositorio;

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }
}
