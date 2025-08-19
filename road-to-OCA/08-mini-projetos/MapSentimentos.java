import java.util.HashMap;
import java.util.Map;

public class MapSentimentos {
    public static Map<String, String> getSentimentoMusica(){
        Map<String, String> sentimentoMusica = new HashMap<>();
        sentimentoMusica.put("tristeza", "Crawling");
        sentimentoMusica.put("raiva", "One Step Closer");
        sentimentoMusica.put("felicidade", "In the End");
        sentimentoMusica.put("desespero", "Given Up");
        sentimentoMusica.put("Saudade", "Castle of Glass");
        return sentimentoMusica; // <- retorno adicionado aqui!
        }
        
        
        public static Map<String, String> getRespostasEspeciais(){
        Map<String, String> respostasEspeciais = new HashMap<>();
        respostasEspeciais.put("Amor", "Amor é como um bug no código - parece que vai funcionar, mas sempre quebra no pior momento.");
        respostasEspeciais.put("vazio", "Se você está vazio... talvez devesse programar em C#.");
        respostasEspeciais.put("nada", "Nada? Até o Java tem mais sentimento.");
        respostasEspeciais.put("tédio", "Com tédio? Vai compilar um código recursivo sem IDE.");
        return respostasEspeciais;
    
    }
}