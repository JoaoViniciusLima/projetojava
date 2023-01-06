package projeto;
public class Gerente extends Funcionario{
  

  public Gerente(String nome,double salario,int cpf){
    super(nome,salario,cpf);
    

    
  }
  public double CalcularSalario(){
      return super.getSalario() + 1500;
    }
}