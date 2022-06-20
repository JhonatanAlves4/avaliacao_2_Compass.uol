package model;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private double preco;

    public Produto(String nome, String descricao, Integer quantidade, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public Produto(Integer id, String nome, String descricao, Integer quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("O produto { id: %d, nome: %s, descricao: %s, quantidade: %s, preco: %g }",
                this.id, this.nome, this.descricao, this.quantidade, this.preco);
    };

}
