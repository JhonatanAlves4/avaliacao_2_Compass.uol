package dao;

import model.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    private Connection connection;

    public FilmeDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Filme> pag1Filmes() throws SQLException {
        List<Filme> pag1Filmes = new ArrayList<Filme>();
        String sql = "select * from filme where id <= 10";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Filme filmes = new Filme(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4));
                    pag1Filmes.add(filmes);
                }
            }
        }
        return pag1Filmes;
    }

    public List<Filme> pag2Filmes() throws SQLException {
        List<Filme> pag2Filmes = new ArrayList<Filme>();
        String sql = "select * from filme where id >= 11";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Filme filmes = new Filme(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4));
                    pag2Filmes.add(filmes);
                }
            }
        }
        return pag2Filmes;
    }
}
