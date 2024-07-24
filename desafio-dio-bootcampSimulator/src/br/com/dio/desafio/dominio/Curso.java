package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {


    //Atributos:
    private int cargaHoraria;


    //Constructor:
    public Curso() {
    }



    //Implementação do metodo abstrato da classe pai
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }


    //Metodos Getters e Setters dos atributos:

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



    //ToString para na hora de imprimir:

    @Override
    public String toString() {
        return "Curso{" +
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", cargaHoraria: " + cargaHoraria +
                '}';
    }
}
