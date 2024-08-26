package tech.ada.poo.base.servico.biblioteca;

public abstract class ItemCatalogo {

    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
