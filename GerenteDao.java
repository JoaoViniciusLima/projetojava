
package projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GerenteDao {
    public void salvarGerente(Gerente c) {

        String sql = "INSERT INTO gerentes VALUES (?, ?, ?)";

        try {
          
            Connection conn =  ConexaoMySQL.getConnection();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setDouble(2, c.CalcularSalario());
            pst.setInt(3, c.getCpf());
           
            
            pst.execute();

            pst.close();
            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Gerente> listarGerentes() {
        String sql = "SELECT * FROM gerentes";
        List<Gerente> listaGerentes = new ArrayList<>();

        try {
            Connection conn = ConexaoMySQL.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet resultSet = pst.executeQuery();
            

            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                double salario = resultSet.getDouble("salario");
                int cpf = resultSet.getInt("cpf");
                
                

                Gerente gerente = new Gerente(nome, salario, cpf);
                listaGerentes.add(gerente);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 

        return listaGerentes;
    }
    
}
