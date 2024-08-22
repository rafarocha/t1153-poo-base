package tech.ada.poo.base.servico;

import tech.ada.poo.base.servico.elementos.Audio;

import java.io.File;

public interface InterfaceServicoArquivo {

    String CONFIG_SERVICO = "valor-x";

    void compactar(File file);
    void compactar(Audio audio);

}
