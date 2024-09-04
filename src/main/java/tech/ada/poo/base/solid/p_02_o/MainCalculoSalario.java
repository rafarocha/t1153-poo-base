package tech.ada.poo.base.solid.p_02_o;

public class MainCalculoSalario {

    public static void main(String[] args) {

        // servico de calculo de regras .. senior e estagiario
        RegraCalculoSenior regraSenior = new RegraCalculoSenior();
        RegraCalculoEstagiario regraEstagiario = new RegraCalculoEstagiario();

        // criando funcionarios senior e estagiario
        Funcionario senior = new Funcionario(10000);
        Funcionario estagiario = new Funcionario(1000);

        // calculando salario de ambos
        regraSenior.calcularSalario(senior);
        regraEstagiario.calcularSalario(estagiario);

        // e se eu criar uma regra para gerente, o que faço? .. modifico a calculadora?
        CalculadoraSalario calculadora = new CalculadoraSalario();
        // nao! eu crio um classe para regra de gerente e uso similar abaixo
        calculadora.calcular(senior, regraSenior);

    }

}
