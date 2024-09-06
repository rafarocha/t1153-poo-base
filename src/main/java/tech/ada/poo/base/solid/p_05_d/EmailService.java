package tech.ada.poo.base.solid.p_05_d;

import tech.ada.poo.base.ordenador.comparator.Aluno;

public class EmailService implements ComunicacaoService {

    // this.emailService.send(aluno.getEmail());
//    public void send(String email) {
//
//    }

    @Override
    public void send(Aluno aluno, String mensagem) {
        System.out.println("enviando para "
            + aluno.getEmail()
            + " a msg email "
            + mensagem);
    }
}
