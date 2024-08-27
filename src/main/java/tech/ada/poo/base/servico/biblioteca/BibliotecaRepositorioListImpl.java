package tech.ada.poo.base.servico.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {

    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    @Override
    public void cadastrar(ItemCatalogo item) {
        itens.add(item);
    }

    @Override
    public boolean consultar(ItemCatalogo item) {
        if (this.itens == null || itens.isEmpty()) return false;
        for () {

        }
    }


}
