package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //Atributos:
    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>(); //
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>(); // Estamos usando a
    // combinação   SET/LinkedHashSet   pois uma pessoa não pode se inscrever de forma repetida
    // em um mesmo curso, então usamos o  SET  para evitar a repetição de cursos. Foi usado o
    // LinkedHashSet   para que ele ordene os conteudos por oredem que são adicionados.

    // Por termos criado a classe pai Conteudo.java, nos agora não precisamos criar um SET
    // conteudoInscrito e conteudoConcluido para Conteudo.java e para Mentoria.java, pois os dois
    // decendem de Conteudo.java ai só colocamos o  SET  conteudoInscrito e conteudoConcluido
    // para ele.

    // E mais uma vez estamos usando um exemplo de polimorfismo pois estamos instanciando um
    // LinkedHashSet por meio de um SET






    //Metodos da classe
    public void InscreverBootcamp(Bootcamp bootcamp) {
        //A regra de negócio de um Bootcamp é que Quando um dev se inscreve em um Bootcamp,
        // automaticamente, todos os conteúdos do Bootcamp no qual ele se inscrevel vai para o
        // Set de conteudoInscrito

        this.conteudoInscrito.addAll(bootcamp.getConteudos());

        //Também iremos adicionar esse nosso dev ao bootcamp para dizer que ele está matriculado:
        bootcamp.getDevsInscritos().add(this);
    }


    public void progredir() {
        // Para que o dev progrida, é necessario passar o conteúdo concluido do SET de
        // conteudoInscrito para o SET de conteudoConcluido


        //1º -> Atribuir o primeiro valor de conteudoInscrito e ver se não é nulo e caso não
        // seja, adicionar ele a conteudoConcluido e Excluir esse conteudo de conteudoInscrito:
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();//Estamos usando o findFirst pois o padrão é
// que o dev faça as mentorias e cursos na ordem em que eles vêm sendo mostrados.
        //O método findFirst retorna um Optional, por isso criamos uma variavel do tipo Optional.
        // Optional serve para resolver a questão de retornos nulos

        if (conteudo.isPresent()) { // o isPresent "é um paralelo oposto ao isEmpty", ele fala se
            // um conteúdo existe ou não
            this.conteudoConcluido.add(conteudo.get()); //Se põe o .get ao final de conteúdo pois
            // sem ele   conteudo   é um  Optional  , mas já o conteudo.get é o valor de conteudo

            this.conteudoInscrito.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!\n");
        }
    }



    public double calcularTotalXP() {
        //Via streams ele vai em cada conteudo, pega o valor retornado do metodo calculaXP e faz
        // um somatorio de todos eles
        return this.conteudoConcluido
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
    }






    //Metodos Getters e Setters dos atributos:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }






    //Por conta do metodo hash em LinkedHashSet, vamos criar os metodos EQUALS e HASHCODE:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoConcluido);
    }
}
