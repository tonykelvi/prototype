package domain.crud;

public class Cliente {
  private int id;
  private String nome;
  private String contato;

  Cliente(){}

  Cliente(String nome, String contato, String email) {
    super();

    this.nome = nome;
    this.contato = contato;
  }
  public int getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public String getContato() {
    return this.contato;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setContato(String contato) {
    this.contato = contato;
  }
  
  // @Override
  // public boolean equals(Object o) {

  //   if (this == o)
  //     return true;
  //   if (!(o instanceof Cliente))
  //     return false;
  //     Cliente cliente = (Cliente) o;
  //   return Objects.equals(this.id, cliente.id) && Objects.equals(this.nome, cliente.nome)
  //       && Objects.equals(this.contato, cliente.contato);
  // }

  // @Override
  // public int hashCode() {
  //   return Objects.hash(this.id, this.nome, this.contato);
  // }

  // @Override
  // public String toString() {
  //   return "Cliente{" + "id=" + this.id + ", nome='" + this.nome + '\'' + ", Contato='" + this.contato + '\'' + '}';
  // }
}
