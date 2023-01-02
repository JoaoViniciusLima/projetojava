/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;

import java.sql.Connection;

import java.sql.DriverManager;

import java.util.Scanner;

import java.sql.SQLException;

import java.sql.Statement;
import java.sql.ResultSet;

public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        ConexaoMySQL con = new ConexaoMySQL();
        Statement st = con.conexao.createStatement();
        
        
        
        while(x!=0){
            
            System.out.println("digite a opção");
           x = sc.nextInt();
           if(x==1){
               try{
                System.out.println("digite o nome");
               String nome = sc.next();
                System.out.println("digite o salario");
                double salario = sc.nextDouble();
                System.out.println("digite o cpf");
                int cpf = sc.nextInt();
               Vendedor vendedor = new Vendedor(nome,salario,cpf);
               st.executeUpdate("INSERT INTO `vendedores` (`nome`, `salario`, `cpf`) VALUES ('"+vendedor.getNome()+"', '"+vendedor.getSalario()+"', '"+vendedor.getCpf()+"')");
               }catch(Exception e){
                   System.out.println("erro no cadastro");
               }
           }
               if(x==2){
               try{
                System.out.println("digite o nome");
               String nome = sc.next();
                System.out.println("digite o salario");
                double salario = sc.nextDouble();
                System.out.println("digite o cpf");
                int cpf = sc.nextInt();
               Gerente gerente = new Gerente(nome,salario,cpf);
               st.executeUpdate("INSERT INTO `gerentes` (`nome`, `salario`, `cpf`) VALUES ('"+gerente.getNome()+"', '"+gerente.getSalario()+"', '"+gerente.getCpf()+"')");
               }catch(Exception e){
                   System.out.println("erro no cadastro");
               }
               }
               if(x==3){
                    st.executeQuery("Select * from vendedores");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            System.out.println(rs.getString("nome")+","+rs.getDouble("salario")+","+rs.getInt("cpf"));
        }
               }
              if(x==4){
                    st.executeQuery("Select * from gerentes");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            System.out.println(rs.getString("nome")+","+rs.getDouble("salario")+","+rs.getInt("cpf"));
        }
               }
              
           
               
        
        
        // TODO code application logic here
    }
    
}
}