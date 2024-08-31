package tech.ada.poo.base.ordenador.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainOrdenacaoAluno {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Roberto", 3d);
        Aluno aluno2 = new Aluno("Airton Senna", 9d);
        Aluno aluno3 = new Aluno("Airton Santos", 9d);
        Aluno aluno4 = new Aluno("Silvio", 6d);

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        // etapa 1 - comparable - ordenando dentro Aluno
        System.out.println(Arrays.toString( alunos.toArray() ) );
        Collections.sort(alunos);
        System.out.println(Arrays.toString( alunos.toArray() ) );

    }

}
