public class Esporte {
    String nome;
    int pontuacao;

    public Esporte(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
    
    @Override
    public String toString() {
        return nome + "("+ pontuacao + " pts)";
    }
}