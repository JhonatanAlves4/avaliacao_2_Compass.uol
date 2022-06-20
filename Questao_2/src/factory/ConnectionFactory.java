package factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    public DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        String jdbcUrl = "jdbc:mysql://localhost/questao2?useTimezone=true&serverTimezone=UTC";
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        String user = "root";
        comboPooledDataSource.setUser(user);
        String password = "mysql123";
        comboPooledDataSource.setPassword(password);


        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperarConexao() throws SQLException {
        return this.dataSource.getConnection();
    }
}
