package tech.ada.poo.base.solid.p_04_i;

public class MainEmpresa {

    interface Trabalhador {
        double salario();
        //double comissao();
    }

    interface Comissionavel {
        double comissao();
    }

    class Vendedor implements Trabalhador, Comissionavel {
        @Override public double salario() {
            return 0;
        }
        @Override public double comissao() {
            return 0;
        }
    }

    class Atendente implements Trabalhador {
        @Override public double salario() {
            return 0;
        }
    }

}
