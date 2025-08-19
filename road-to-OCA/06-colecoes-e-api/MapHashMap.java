import java.util.HashMap;
import java.util.Map;

//Ainda é muito cedo pra desistir
public class MapHashMap{
    public static void main(String[] args){
    //Criando o mapa esporte -> medalhas
    Map<String, Integer> medalhasPorEsporte = new HashMap<>();

    //Adicionando esportes e suas respectivas medalhas

    medalhasPorEsporte.put("Futebol", 2);
    medalhasPorEsporte.put("Natação", 5);
    medalhasPorEsporte.put("Tênis", 1);
    medalhasPorEsporte.put("Skate", 3);

    //Acessando diretamente o nome do esporte

    System.out.println(" Medalhas na Natação: " + medalhasPorEsporte.get("Tênis") + " medalhas.");
    
    //Atualizando medalhas
    medalhasPorEsporte.put("Tênis",2);
    System.out.println("Atualização: Tênis agora tem " + medalhasPorEsporte.get("Tênis") + " medalhas.");

    //Removendo um esporte do mapa
    medalhasPorEsporte.remove("Skate");
    System.out.println("Skate desclassificado. Fora da lista.");


    //Verificando se um esporte está na lista
    if(medalhasPorEsporte.containsValue(5)){
        System.out.println("Temos um campeão com 5 medalhas!");
    }



    //Iterando sobre os esportes com suas medalhas
    System.out.println("\n Tabela geral de medalhas: ");
    for (Map.Entry<String, Integer> entrada : medalhasPorEsporte.entrySet()){
    System.out.println("- " + entrada.getKey() + ": " + entrada.getValue() + " medalhas");
    }

    //Tamanho do mapa
    System.out.println("\n Total de esportes registrados: " + medalhasPorEsporte.size());
    }
}
