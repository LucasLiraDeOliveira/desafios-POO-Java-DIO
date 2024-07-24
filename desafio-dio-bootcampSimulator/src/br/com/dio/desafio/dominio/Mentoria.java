package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //Atributos:
    private LocalDate data;



    //Constructor:
    //Quando não construimos um construtor padrão, com atribuições e tals, ele por debaixo dos
    // panos construirá um construtor vazio. Abaixo segue o contrutor vazio para que vejamos como
    // ele é, mas não precisa pois como dito, o java colocará ele por debaixo dos panos:



    //Implementação do metodo abstrato da classe pai
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }



    public Mentoria() {
    }
    //Metodos Getters e Setters dos atributos:

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
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", data: " + data +
                '}';
    } // usei os getters em vez dos atributos pois na classe pai puz PRIVATE  e não PROTECTED
}
