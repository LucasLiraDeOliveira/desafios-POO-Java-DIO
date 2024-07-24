package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
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
    public void InscreverBootcamp(Bootcamp bootcamp) {}

    public void progredir() {}

    public void calcularTotalXP() {}






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
