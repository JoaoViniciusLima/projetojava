package projeto;
public class Vendedor extends Funcionario{

  public Vendedor(String nome,double salario,int cpf){
    super(nome,salario,cpf);
  }
  public double CalcularSalario(){
      return super.getSalario();
    }

}