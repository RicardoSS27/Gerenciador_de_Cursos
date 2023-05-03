import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java" , "Paulo Silveira");
//        List<Aula> aulas = javaColecoes.getAulas();
//        aulas.add(new Aula("Trabalhando com ArrayList" , 21));

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList" , 21));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
