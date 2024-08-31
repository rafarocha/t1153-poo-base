package tech.ada.poo.base.ordenador.comparator;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private Double nota;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }


    @Override
    public int compareTo(Aluno aluno) { // estou recebendo - parametro aluno
        // etapa 1 - ordenar por nota e depois por nome
        // quando uso comparable, eu preciso usar o this

        // aluno1 (this), aluno2(aluno), aluno3
        int compareToNota = this.nota.compareTo(aluno.nota); // -1 0 1

        if (compareToNota == 0) {
            return (-1) * this.nome.compareTo(aluno.nome);
        }

        return (-1) * compareToNota;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.nota;
    }
}
