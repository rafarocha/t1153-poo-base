package tech.ada.poo.base.solid.p_05_d;

import tech.ada.poo.base.ordenador.comparator.Aluno;

public class MainMatricula {

    public static void main(String ... args) {

        // formas de aviso
        EmailService emailService = new EmailService();
        WhatsappService whatsappService = new WhatsappService();
        SmsService smsService = new SmsService();

        // aluno
        Aluno aluno = new Aluno("Roberto Carlos",
            10., "roberto.carlos@rc.com", "8399999999");

        // aqui o X da questao !!!
        MatriculaService matriculaService =
            new MatriculaService(emailService, whatsappService, smsService);

        // fazer
        matriculaService.realizarMatricula(aluno);

    }

    // injecao de dependencia
    // inversao de controle

}
