import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class LinkinPark {
    public static void main(String[] args) {
        Album meteora = new Album("Meteora");
        meteora.adicionarMusica("Somewhere I Belong");
        meteora.adicionarMusica("Lying From You");
        meteora.adicionarMusica("Hit the Floor");
        meteora.adicionarMusica("Faint");
        meteora.adicionarMusica("Figure.09");

        Album LivingThings = new Album("Living Things");
        LivingThings.adicionarMusica("Burn It Down");
        LivingThings.adicionarMusica("Lies Greed Money");
        LivingThings.adicionarMusica("Lost in the Echo");
        LivingThings.adicionarMusica("Roads Untraveled");
        LivingThings.adicionarMusica("Skin to Bone");
        LivingThings.adicionarMusica("Powerless");
        LivingThings.adicionarMusica("Remember the Name");
        LivingThings.adicionarMusica("Castle of Glass");

        Album hybridTheory = new Album("Hybrid Theory");
        hybridTheory.adicionarMusica("Papercut");
        hybridTheory.adicionarMusica("One Step Closer");
        hybridTheory.adicionarMusica("With You");
        hybridTheory.adicionarMusica("Points Of Authority");
        hybridTheory.adicionarMusica("Crawling");
        hybridTheory.adicionarMusica("In the End");
        hybridTheory.adicionarMusica("A Place for My Head");

        System.out.println("Álbum " + meteora.getNome());
        for (String musica : meteora.getMusicas()) {
            System.out.println("- " + musica);
        }

        System.out.println("Álbum " + hybridTheory.getNome());
        for (String musica : hybridTheory.getMusicas()) {
            System.out.println("- " + musica);
        }

        // 👇 Agora usamos os métodos do MapSentimentos corretamente:
        Map<String, String> sentimentoMusica = MapSentimentos.getSentimentoMusica();
        Map<String, String> respostasEspeciais = MapSentimentos.getRespostasEspeciais();

        String sentimento = "raiva";

        System.out.println("\n🎧 Sentimento detectado: " + sentimento);
        if (sentimentoMusica.containsKey(sentimento)) {
            System.out.println("♪ Música recomendada: " + sentimentoMusica.get(sentimento));
        } else if (respostasEspeciais.containsKey(sentimento)) {
            System.out.println(respostasEspeciais.get(sentimento));
        } else {
            System.out.println("Nenhuma música encontrada para esse sentimento.");
        }
    }
}