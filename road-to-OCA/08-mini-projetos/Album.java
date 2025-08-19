import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private List<String> musicas;

    public Album(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(String musica) {
        musicas.add(musica); // Corrigido aqui
    }

    public String getNome() {
        return nome;
    }

    public List<String> getMusicas() {
        return musicas;
    }
}