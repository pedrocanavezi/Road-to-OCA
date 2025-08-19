public class Tank extends Personagem{
    public Tank(String nome){
         super(nome);
    }


    @Override
    public void atacar(){
        System.out.println(nome + " Absorve todo o dano!");
    }

}