package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    //Atributos:
    private String titulo;
    private String descricao;
    private LocalDate data;



    //Constructor:
    //Quando não construimos um construtor padrão, com atribuições e tals, ele por debaixo dos
    // panos construirá um construtor vazio. Abaixo segue o contrutor vazio para que vejamos como
    // ele é, mas não precisa pois como dito, o java colocará ele por debaixo dos panos:
    public Mentoria() {
    }

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }




    //ToString para na hora de imprimir:
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo: '" + titulo + '\'' +
                ", descricao: '" + descricao + '\'' +
                ", data: " + data +
                '}';
    }
}
