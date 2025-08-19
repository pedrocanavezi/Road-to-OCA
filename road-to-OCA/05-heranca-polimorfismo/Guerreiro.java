 public class Guerreiro extends Personagem {
  //Extensão de classes que herdam a classe Personagem assim como C# herdou java
  public Guerreiro(String nome) {
    super(nome); //chama o construtor da classe Personagem
  }

  @Override
  public void atacar() {
    System.out.println(nome + " invoca o Mjölnir, que desce dos céus e destrói tudo em volta!");
  }
}
