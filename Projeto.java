
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
               try{
                System.out.println("digite o nome");
               String nome = sc.next();
                System.out.println("digite o preco");
                double preco = sc.nextDouble();
                System.out.println("digite o codigo");
                int codigo = sc.nextInt();
               Produto produto = new Produto(nome,preco,codigo);
               new ProdutoDao().salvarProduto(produto);
               }catch(Exception e){
                   System.out.println("erro no cadastro");
               }
               }
               if(x==6){
                  List<Produto> listaProdutos = new ProdutoDao().listarProdutos();
                for (Produto c: listaProdutos) {
                    System.out.println("nome:" + c.getNome() +",preco:" + c.getPreco() + ",codigo:" + c.getCodigo());
                }
              }
                

                 
               }
              
           
               
        
        
        // TODO code application logic here
    }
    
}
