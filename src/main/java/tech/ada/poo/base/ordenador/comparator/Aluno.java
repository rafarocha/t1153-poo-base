package tech.ada.poo.base.ordenador.comparator;

import jdk.jshell.spi.ExecutionControl;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private Double nota;

    private String email;

    private String telefone;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno(String nome, Double nota, String email, String telefone) {
        this(nome, nota);
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
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
