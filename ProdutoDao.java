
package projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDao {
     public void salvarProduto(Produto c) {

        String sql = "INSERT INTO Produtos VALUES (?, ?, ?)";

        try {
          
            Connection conn =  ConexaoMySQL.getConnection();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setDouble(2, c.getPreco());
            pst.setInt(3, c.getCodigo());
           
            
            pst.execute();

            pst.close();
            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listarProdutos() {
        String sql = "SELECT * FROM Produtos";
        List<Produto> listaProdutos = new ArrayList<>();

        try {
            Connection conn = ConexaoMySQL.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet resultSet = pst.executeQuery();
            

            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                double preco = resultSet.getDouble("preco");
                int codigo = resultSet.getInt("codigo");
                
                

                Produto produto = new Produto(nome, preco, codigo);
                listaProdutos.add(produto);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 

        return listaProdutos;
    }
}
