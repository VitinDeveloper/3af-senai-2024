import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Aluno aluno = new Aluno("Dalison", 1, "1234", "Desenvolvimento de Sistemas");
        aluno.fazerMatricula("Java");
        pessoas.add(aluno);
        System.out.println(pessoas.getFirst().getSenha());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getCurso());

        Professor professor = new Professor("Likas", 2, "1357", "Sistemas");
        pessoas.add(professor);

        aluno = new Aluno("Flash", 3, "2468", "React a videos de k pop");
        pessoas.add(aluno);

        professor = new Professor("Jack", pessoas.size() + 1, "0000", "Spring");
        pessoas.add(professor);

        Funcionario funcionario = new Funcionario("João", pessoas.size() + 1, "0001", "Adm", "num tem aula");
        pessoas.add(funcionario);

        Estagiario estagiario = new Estagiario("Clebin", pessoas.size() + 1, "7777", "Java", "Almoxarifado");
        pessoas.add(estagiario);

//        Aluno a = (Aluno) pessoas.getFirst();
//        System.out.println("Curso da primeira pessoa:" + a.getCurso());

        System.out.println("========================");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
            System.out.println(p.getId());
            System.out.println(p.getSenha());
            if (p instanceof Aluno) {
                Aluno a = (Aluno) p;
                System.out.println(a.getCurso());
//            }else if (p instanceof Professor){
            } else if (p.getClass() == Professor.class) {
                Professor profe = (Professor) p;
                System.out.println(profe.getArea());
            }
            System.out.println("------------------------");
        }
    }
}