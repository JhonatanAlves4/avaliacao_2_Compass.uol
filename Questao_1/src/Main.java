import dao.ProdutoDAO;
import factory.ConnectionFactory;
import model.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            ProdutoDAO produtoDAO = new ProdutoDAO(connection);

            boolean c = true;
            while (c) {

                System.out.println("\nEscolha uma operação (1, 2, 3) ou digite 0 para finalizar");

                int option = scanner.nextInt();

                if (option == 1) {
                    //produtoDAO.truncateTable();
                    System.out.println("Foram cadastrados os 3 ultimos produtos:");
                    Produto produto1 = new Produto("Notebook", "i5 8gb 1tb", 1, 4000);
                    produtoDAO.salvarProduto(produto1);

                    Produto produto2 = new Produto("Geladeira", "Sai água na porta", 1, 5500);
                    produtoDAO.salvarProduto(produto2);

                    Produto produto3 = new Produto("Smart TV", "50\" 4k full HD", 1, 4500);
                    produtoDAO.salvarProduto(produto3);

                    List<Produto> listarProdutos = produtoDAO.listar();
                    listarProdutos.forEach(lp -> System.out.println(lp));

                } else if (option == 2) {

                    List<Produto> listaProdutos = produtoDAO.listar();
                    int ultimo3 = listaProdutos.size() - 3;
                    Produto ultimo = listaProdutos.get(ultimo3);
                    System.out.println(ultimo + " será atualizado");

                    Produto produtoAtualizado = new Produto(ultimo.getId(), "Celular", "128gb 4gb android", 1, 2500);
                    produtoDAO.atualizaProduto(produtoAtualizado);

                } else if (option == 3) {

                    List<Produto> listaProdutos = produtoDAO.listar();
                    int ultimo2 = listaProdutos.size() - 2;
                    Produto penultimo = listaProdutos.get(ultimo2);
                    System.out.println(penultimo + " será excluído");

                    produtoDAO.deleteProduto(penultimo);

                } else if (option < 0 || option > 3) {

                    System.out.println("Por gentileza, selecione uma das opções corretamente");

                } else if (option == 0) { c = false; }

            }
        } catch (Exception ex) {
            System.out.println("Infelizmente houve um erro, finalizando processo.");
        }
    }
}
