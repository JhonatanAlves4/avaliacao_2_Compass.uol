package dao;

import model.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarProduto(Produto produto) throws SQLException {
        String sql = "insert into produto (nome, descricao, quantidade, preco) values (?, ?, ?, ?)";

        try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());

            pstm.execute();
        }
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<Produto>();
        String sql = "select * from produto";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Produto produto = new Produto(rst.getInt(1), rst.getString(2),
                            rst.getString(3), rst.getInt(4), rst.getDouble(5));

                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }

    public void atualizaProduto(Produto produto) throws SQLException {
        String sql = "update produto set nome = ?, descricao = ?, quantidade = ?, preco = ? where id = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            pstm.setInt(5, produto.getId());


            pstm.execute();
        }
    }

    public void deleteProduto(Produto produto) throws SQLException {
        String sql = "delete from produto where id = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, produto.getId());

            pstm.execute();

        }
    }

    public void truncateTable() throws SQLException {
        String sql = "truncate table produto";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();
        }
    }
}
