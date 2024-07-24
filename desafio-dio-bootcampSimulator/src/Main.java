import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Vamos instanciar(criar) variaveis do tipo Curso e Mentoria
        // e já atribuir valores as variaveis por meio dos metodos Setters:
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JS");
        curso2.setCargaHoraria(6);

        /* POLIMORFISMO:

            * Vamos tratar agora o conceito de POLIMORFISMO ao criar mais um curso:
                * Quando fazemos: List<String> palavras = new ArrayList<>();
                * estamos dizendo que criamos/instanciamos um ArrayList a partir de um List.
                    * Dado esse exemplo, podemos dizer que tudo que temos em List, temos em
                    * ArrayList, mas nem tudo que temos em ArrayList temos em List.

            * Passando esse conceito para o nosso exemplo na main, temos:
                   Conteudo conteudo = new Curso();
            * Criamos um Curso apartir de um Conteudo. Tudo que temos em Conteudo, temos em
            * Curso, mas a reciproca não procede


            * EM RESUMO DA ÓPERA: PODEMOS INSTANCIAR/CRIAR UM OBJETO DO TIPO DO FILHO ATRAVÉS DA
            * CLASSE PAI

            * e NO NOSSO EXEMPLO ATUAL, A CLASSE PAI É ABSTRATA, LOGO NÃO SE PODE CRIAR UM OBJETO
            *  DO TIPO PAI POIS ELE FOI FEITO APENAS PARA AGREGAR AS CLASSES FILHAS
        */


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now()); // para que ao criar ele atribuirá a data deste
        // momento de criação

        /*
        //Imprimindo os conteudos para teste:
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */

        //Vamos instanciar o bootcamp e dois devs para usar de exemplo:
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");



        //Se imprimirmos os conteudos inscritos e finalizados, veremos que nos quatro sairão listas
        // vazias, porque nada voi adicionado
        System.out.println("Conteúdos inscritos de Lucas: " + devLucas.getConteudoInscrito());
        System.out.println("Conteúdos concluídos de Lucas: " + devLucas.getConteudoConcluido());
        System.out.println("Conteúdos inscritos de Pedro: " + devPedro.getConteudoInscrito());
        System.out.println("Conteúdos concluídos de Pedro: " + devPedro.getConteudoConcluido() +
                        "\n");

        //Vamos adicionar os devs ao bootcamp e ver como estão de conteúdos:
        devLucas.InscreverBootcamp(bootcamp);
        devPedro.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getConteudoInscrito());
        System.out.println("Conteúdos inscritos Pedro: " + devPedro.getConteudoInscrito() + "\n");

        //Vamos simular que os dois ja estão fazendo alguns cursos:
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devLucas.progredir();
        System.out.println("Conteúdos inscritos de Lucas: " + devLucas.getConteudoInscrito());
        System.out.println("Conteúdos concluídos de Lucas: " + devLucas.getConteudoConcluido());
        System.out.println("Conteúdos inscritos de Pedro: " + devPedro.getConteudoInscrito());
        System.out.println("Conteúdos concluídos de Pedro: " + devPedro.getConteudoConcluido() +
                "\n");

        //Agora simularemos o XP ganho de cada um:
        System.out.println("O XP total de " + devLucas.getNome() + " atualmente é: " + devLucas.calcularTotalXP());
        System.out.println("O XP total de " + devPedro.getNome() + " atualmente é: " + devPedro.calcularTotalXP());
    }
}