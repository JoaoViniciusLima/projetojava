package projeto;
public abstract class Funcionario{
  private String nome;
  private double salario;
  private int cpf;

  public Funcionario(String nome,double salario,int cpf){
    this.nome = nome;
    this.salario = salario;
    this.cpf = cpf;
  }
  
  public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
public abstract double CalcularSalario(); 



public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public int getCpf() {
	return cpf;
}

public void setCpf(int cpf) {
	this.cpf = cpf;
}


}