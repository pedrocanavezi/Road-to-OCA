import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoComparator {
     public static void main(String[] args){
        //Criando lista de esportes com pontuações
        List<Esporte> esportes = new ArrayList<>();
        esportes.add(new Esporte("Futebol", 90));
        esportes.add(new Esporte("Tênis", 75));
        esportes.add(new Esporte("Basquete", 88));
        esportes.add(new Esporte("Natação", 92));
        
        
        System.out.println("Ranking Original: ");
        for (Esporte e : esportes) {
             System.out.println("- " + e);
        }
        

        //Ordenando com Comparator
        Collections.sort(esportes, new OrdenaPorPontuacao());


        System.out.println("\n Ranking por Pontuação (decrescente): ");
        for(Esporte e : esportes){
            System.out.println("- "+ e);
        }
    }        
}
