public class Personagem{
    //Aqui é onde tudo parece organizado
    String nome;
    int nivel;
    //Construtor
    public Personagem(String nome, int nivel){
       this.nome = nome;
       this.nivel= nivel;
       //Setado nome e nível do personagem
    }

     //Método simples
     public void apresentar() {
        System.out.println("Eu sou " + nome + " e estou no nível " + nivel);
        //console deve retornar nome é nível dos personagens respectivamente
     }
}
