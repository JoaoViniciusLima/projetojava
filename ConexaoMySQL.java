/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



public class ConexaoMySQL {
        
    
    
    
    
    public static Connection  getConnection() throws SQLException{
        String servername = "localhost";
    String database = "bancojava";
    String url = "jdbc:mysql://" + servername + "/" + database;
    String username = "root";
    String password = "";

        Connection conexao = DriverManager.getConnection(url, username, password);
        System.out.println("Conexao efetuada com sucesso!");
        return conexao;
    }
}