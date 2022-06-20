package model;

public class Filme {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer ano;

    public Filme(Integer id, String nome, String descricao, Integer ano) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("id: %d, nome: %s, descricao: %s, ano: %d",
                this.id, this.nome, this.descricao, this.ano);
    };
}
