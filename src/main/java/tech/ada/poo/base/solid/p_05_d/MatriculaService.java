package tech.ada.poo.base.solid.p_05_d;

import tech.ada.poo.base.ordenador.comparator.Aluno;

import java.util.ArrayList;
import java.util.List;

public class MatriculaService {

    private List<ComunicacaoService> listaServicosComunicacao;

    public MatriculaService(ComunicacaoService ... comunicacoes) { // varargs
        this.listaServicosComunicacao =
            new ArrayList<ComunicacaoService>();

        for (ComunicacaoService servico: comunicacoes) {
            this.listaServicosComunicacao.add(servico);
        }
    }
    public void realizarMatricula(Aluno aluno) {

        /*
        toda logica, regra e validacao da matricula aqui!
         */
        // ...

        // ultima etapa - avisar!
        // apos ter realizado a matricula com SUCESSO - enviar notificacao
        for (ComunicacaoService servico: this.listaServicosComunicacao) {
            servico.send(aluno, "enviando matr");
        }

        // fallback - microservicos para tornar resiliente
    }

}
