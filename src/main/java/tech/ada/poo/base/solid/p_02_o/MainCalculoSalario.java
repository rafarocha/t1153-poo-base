package tech.ada.poo.base.solid.p_02_o;

public class MainCalculoSalario {

    public static void main(String[] args) {

        // servico de calculo de regras .. senior e estagiario
        RegraCalculoSenior regraSenior = new RegraCalculoSenior();
        RegraCalculoEstagiario regraEstagiario = new RegraCalculoEstagiario();

        // criando funcionarios senior e estagiario
        Funcionario senior = new Funcionario(10000);
        Funcionario estagiario = new Funcionario(10000);

        // calculando salario de ambos
        regraSenior.calcularSalario(senior);
        regraEstagiario.calcularSalario(estagiario);

        // ----------------------------------------------------
        // calculando salario estagiario

        // tratando ... fazendo a calculadora calcular
        // calculadora
        CalculadoraSalario calculadora = new CalculadoraSalario();
        calculadora.calcular(senior, regraSenior);


    }

}
