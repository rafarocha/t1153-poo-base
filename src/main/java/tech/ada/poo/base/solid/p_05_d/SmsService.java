package tech.ada.poo.base.solid.p_05_d;

import tech.ada.poo.base.ordenador.comparator.Aluno;

public class SmsService implements ComunicacaoService {
    @Override
    public void send(Aluno aluno, String mensagem) {
        System.out.println("enviando para "
            + aluno.getTelefone()
            + " a msg SMS "
            + mensagem);
    }
}
