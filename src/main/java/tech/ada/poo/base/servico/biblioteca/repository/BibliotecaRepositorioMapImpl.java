package tech.ada.poo.base.servico.biblioteca.repository;

import tech.ada.poo.base.marketplace.CRUDRepositorio;
import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibliotecaRepositorioMapImpl implements BibliotecaRepositorio {

    private Map<String, ItemCatalogo> mapa =
        new HashMap<String, ItemCatalogo>();


    @Override
    public ItemCatalogo cadastrar(ItemCatalogo item) {
        return null;
    }

    @Override
    public ItemCatalogo consultar(String titulo) {
        return null;
    }

    @Override
    public ItemCatalogo atualizar(ItemCatalogo item) {
        return null;
    }
}
