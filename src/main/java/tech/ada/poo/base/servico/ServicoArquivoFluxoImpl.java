package tech.ada.poo.base.servico;

import tech.ada.poo.base.servico.elementos.Audio;
import tech.ada.poo.base.servico.elementos.Fluxo;

import java.io.File;

public class ServicoArquivoFluxoImpl implements InterfaceServicoArquivo, InterfaceServicoStream {

    @Override
    public void compactar(File file) {
        System.out.println("compactando o arquivo");
    }

    @Override
    public void compactar(Audio audio) {
        System.out.println("compactando audio");
    }

    @Override
    public void compactar(Fluxo fluxo) {
        System.out.println("compactando fluxo de dados");
    }
}
