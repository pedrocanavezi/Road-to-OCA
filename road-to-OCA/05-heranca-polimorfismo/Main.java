 public class Main{
    public static void main(String[] args){
       Personagem npc = new Personagem("Dignidade");
       npc.atacar();


       //Demonstração prática de polimorfismo
       Personagem[] personagens = {
        new Guerreiro("Thor"),
        new Mago("Lux"),
        new Tank("Ornn")
       };


       for (Personagem p : personagens){
            p.atacar(); //Cada um executa seu próprio método atacar(), graças ao @Override
       }
    }
}