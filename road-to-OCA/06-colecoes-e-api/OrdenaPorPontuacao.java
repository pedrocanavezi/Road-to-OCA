import java.util.Comparator;

public class OrdenaPorPontuacao implements Comparator<Esporte> {

    @Override
    public int compare(Esporte e1, Esporte e2){
        return Integer.compare(e2.pontuacao, e1.pontuacao); //Ordem descrescente
    }
    
}
