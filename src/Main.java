import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descriçao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.InscreverBootcamp(bootcamp);
        devJose.progredir();
        System.out.println("Conteudo Inscritos" + devJose.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + devJose.getConteudosConcluidos());
        System.out.println("Xp: " + devJose.calcularTotalXp());
        System.out.println("---------------");

        Dev devCamila = new Dev();
        devCamila.setNome("camila");
        devCamila.InscreverBootcamp(bootcamp);
        devCamila.progredir();

        System.out.println("Conteudo Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("Xp: " + devCamila.calcularTotalXp());
        System.out.println("---------------");
    }
}
