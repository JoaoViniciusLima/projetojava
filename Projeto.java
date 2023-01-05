/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;


import java.util.List;
import java.util.Scanner;

import java.sql.SQLException;



public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int x = 1;  
        
        while(x!=0){
            
            System.out.println("digite a opcao");
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
               
                    new VendedorDao().salvarVendedor(vendedor);
               
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
               new GerenteDao().salvarGerente(gerente);
             
               }catch(Exception e){
                   System.out.println("erro no cadastro");
               }
               }
               if(x==3){
                   List<Vendedor> listaVendedores = new VendedorDao().listarVendedores();
                for (Vendedor c: listaVendedores) {
                    System.out.println("nome:" + c.getNome() +",salario:" + c.getSalario() + ",cpf:" + c.getCpf());
                }
                   
               }
              if(x==4){
                  List<Gerente> listaGerentes = new GerenteDao().listarGerentes();
                for (Gerente c: listaGerentes) {
                    System.out.println("nome:" + c.getNome() +",salario:" + c.getSalario() + ",cpf:" + c.getCpf());
                }
              }
                
                if(x==5){
                    System.out.println("digite o cpf");
                    int cpf = sc.nextInt();
                    List<Vendedor> listaVendedores = new VendedorDao().listarVendedores();
                    for (Vendedor c: listaVendedores) {
                        if(c.getCpf() == cpf){
                            System.out.println("o nome do vendedor e:" + c.getNome());
                        }
                        
                    }
                }
                if(x==6){
                     System.out.println("digite o cpf");
                    int cpf = sc.nextInt();
                    List<Gerente> listaGerentes = new GerenteDao().listarGerentes();
                    for (Gerente c: listaGerentes) {
                        if(c.getCpf() == cpf){
                            System.out.println("o nome do gerente e:" + c.getNome());
                        }
                        
                    }
                    
                }
                if(x==7){
                    Double maior = 0.0;
                     List<Vendedor> listaVendedores = new VendedorDao().listarVendedores();
                    for (Vendedor c: listaVendedores) {
                        if(c.getSalario() > maior){
                            maior = c.getSalario();
                        }
                        
                    }

                    System.out.println("o maior salario e:" + maior);
                }
                if(x==8){
                    Double maior = 0.0;
                     List<Gerente> listaGerentes = new GerenteDao().listarGerentes();
                    for (Gerente c: listaGerentes) {
                        if(c.getSalario() > maior){
                            maior = c.getSalario();
                        }
                        
                    }

                    System.out.println("o maior salario e:" + maior);
                }

                 
               }
              
           
               
        
        
        // TODO code application logic here
    }
    
}
