public class Mago extends Personagem {
    //Classe mais odiada dos jogos online, herança mágica do caos 
    public Mago (String nome) {
        super(nome);
    }

    @Override
    public void atacar(){
        System.out.println(nome + " Lança um laser que colapsa tudo a sua volta!");
    }
}