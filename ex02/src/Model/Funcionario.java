package Model;

public abstract class Funcionario {
  private int id;
  private String nome;
  private float salario;

  public Funcionario() {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

}
