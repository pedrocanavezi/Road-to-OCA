import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);


        //mostrar instruções
        System.out.println("Bem-vindo ao Mood Matcher - Linkin Park Edition");
        System.out.println("Como você está se sentindo hoje? ");
        String sentimento = scanner.nextLine().toLowerCase();

        //Pega os mapas prontos
        Map<String, String> sentimentoMusica = MapSentimentos.getSentimentoMusica();
        Map<String, String> respostasEspeciais = MapSentimentos.getRespostasEspeciais();
        
        
        //Análise do sentimento
        System.out.println("\n🎧 Sentimento detectado: " + sentimento);
        if (sentimentoMusica.containsKey(sentimento)) {
            System.out.println("♪ Música recomendada: " + sentimentoMusica.get(sentimento));
        } else if (respostasEspeciais.containsKey(sentimento)) {
            System.out.println("💬 " + respostasEspeciais.get(sentimento));
        } else {
            System.out.println("🚫 Nenhuma música encontrada para esse sentimento.");
        }

        scanner.close();
    }
}

  