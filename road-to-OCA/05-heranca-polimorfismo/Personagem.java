public class Personagem{
    String nome;
    //Aqui veremos herança, e não, não é de dinheiro

    public Personagem(String nome) {
        this.nome = nome;
    }
    
    public void atacar(){
        System.out.println(nome + " ataca de forma fraca!");
    }
}