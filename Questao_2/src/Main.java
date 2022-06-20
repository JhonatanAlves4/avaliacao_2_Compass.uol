import dao.FilmeDAO;
import factory.ConnectionFactory;
import model.Filme;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            FilmeDAO filmeDAO = new FilmeDAO(connection);

            System.out.println("\nPágina 1\n");
            List<Filme> pagina1Filmes = filmeDAO.pag1Filmes();
            pagina1Filmes.forEach(pag1 -> System.out.println(pag1));

            System.out.println("\nPágina 2\n");
            List<Filme> pagina2Filmes = filmeDAO.pag2Filmes();
            pagina2Filmes.forEach(pag2 -> System.out.println(pag2));

            System.out.println("\nQuantos filmes você deseja assistir? (1 a 10)");
            int qntdfilmes = scanner.nextInt();

            System.out.println("De qual página? (1 ou 2)");
            int pagfilmes = scanner.nextInt();

            Collections.shuffle(pagina1Filmes);
            Collections.shuffle(pagina2Filmes);

            if (pagfilmes == 1) {
                for (int i = 0; i < qntdfilmes; i++) {
                    System.out.println(pagina1Filmes.get(i));
                }
            } else if (pagfilmes == 2) {
                for (int i = 0; i < qntdfilmes; i++) {
                    System.out.println(pagina2Filmes.get(i));
                }
            } else if (pagfilmes < 1 || pagfilmes > 2 || qntdfilmes < 1 || qntdfilmes > 10) {
                System.out.println("Por favor, insire os valores corretamente");
            }
        } catch (Exception ex) {
            System.out.println("\nInfelizmente ocorreu um erro...");
        }
    }
}
