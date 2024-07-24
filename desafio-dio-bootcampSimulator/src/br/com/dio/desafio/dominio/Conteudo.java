package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // Todos bootcamp vai ter conteúdo e Mentorias e Cursos são conteúdos
    // Logo, Criamos a classe pai Conteudo para evitar a duplicação de repetição em
    // Mentoria.java e Curso.java

    //abstract faz com que a classe não possa ser instanciada,
    // no nosso caso, não precisamos criar objetos conteudo pois a nossa classe conteudo ela
    // serve apenas como pai de outras classes



    //Constantes:
    protected static final double XP_PADRAO = 10d; // final diz que é imutável

    //Atributos:
    private String titulo;
    private String descricao;





    //Metodos Getters e Setters dos atributos:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    //Metodos da classe Conteudo:
    public abstract double calcularXP();
}
