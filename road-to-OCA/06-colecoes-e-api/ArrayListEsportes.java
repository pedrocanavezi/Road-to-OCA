import java.util.ArrayList;

public class ArrayListEsportes {
    public static void main(String[] args) {
        // Chega de limitação! Bem-vindo ao mundo dinâmico do ArrayList!
        ArrayList<String> esportes = new ArrayList<>();

        // Adicionando Elementos
        esportes.add("Futebol");
        esportes.add("Tênis");
        esportes.add("Natação");
        esportes.add("Tênis");
        esportes.add("Skate");


        // Exibindo todos os esportes com foreach
        System.out.println("🏆 Esportes Cadastrados:");
        for (String esporte : esportes) {
            System.out.println("- " + esporte);
        }
        // Acessando um item específico
        System.out.println("\nEsporte em destaque hoje: " + esportes.get(2));
        
        //Removendo um esporte
        esportes.remove("Tênis");
        System.out.println("\n🚫 Tênis foi removido. Lista atualizada:");
        
        for (String esporte : esportes) {
            System.out.println("- " + esporte);
        }
        

        // Atualizando um esporte
        esportes.set(1, "Surfe");
        System.out.println("\n🌊 Mudança no lineup! Natação virou Surfe:");

        for (String esporte : esportes){
        System.out.println("- " + esporte);
        }

        // Verificando se contém um item
        if (esportes.contains("Futebol")) {
            System.out.println("\n⚽ Futebol confirmado na lista!");
        } else {
            System.out.println("\n⚽ Futebol ficou de fora!");
        }
        

        //Tamanho da lista
        System.out.println("\nTotal de esportes cadastrados: " + esportes.size());
    }
}

