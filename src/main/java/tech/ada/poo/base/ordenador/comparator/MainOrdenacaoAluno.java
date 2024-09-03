package tech.ada.poo.base.ordenador.comparator;

import java.util.*;

public class MainOrdenacaoAluno {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Roberto", 3d);
        Aluno aluno2 = new Aluno("Airton Senna", 8.9d);
        Aluno aluno3 = new Aluno("Airton Santos", 9d);
        Aluno aluno4 = new Aluno("Silvio", 6d);

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        // etapa 1 - comparable - ordenando dentro da classe aluno Aluno
        System.out.println(Arrays.toString( alunos.toArray() ) );
        Collections.sort(alunos);
        System.out.println(Arrays.toString( alunos.toArray() ) );

        // etapa 2 - ordenando por nome e nota
        System.out.println("--- com comparator");
        System.out.println(Arrays.toString( alunos.toArray() ) );
        Collections.sort(alunos, new Comparator<Aluno>() { // instancia interna anonima - inner class
            @Override // padrao template method - teste unitario
            public int compare(Aluno esquerda, Aluno direita) {
                // Nome -> nota
                int comparador = esquerda.getNome().compareTo(direita.getNome());
                if (comparador == 0){
                    return esquerda.getNota().compareTo(direita.getNota());
                }
                return comparador;
            }
        });
        System.out.println(Arrays.toString( alunos.toArray() ) );

    }

}
