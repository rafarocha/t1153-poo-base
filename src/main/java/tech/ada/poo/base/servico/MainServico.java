package tech.ada.poo.base.servico;

import tech.ada.poo.base.servico.elementos.Audio;
import tech.ada.poo.base.servico.elementos.Fluxo;

import java.io.File;

public class MainServico {

    public static void main(String[] args) {
        System.out.println(InterfaceServicoArquivo.CONFIG_SERVICO);

        ServicoArquivoFluxoImpl servicoArquivoFluxo = new ServicoArquivoFluxoImpl();
        servicoArquivoFluxo.compactar( new File("arquivo.txt") );
        servicoArquivoFluxo.compactar( new Audio());
        servicoArquivoFluxo.compactar( new Fluxo() );

    }

}
