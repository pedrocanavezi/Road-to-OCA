import java.util.HashSet;
import java.util.Set;

public class SetHashSet {
    public static void main(String[] args){
    Set<String> esportes = new HashSet<>();
    

    //Adicionando elementos
        esportes.add("Futebol");
        esportes.add("Tênis");
        esportes.add("Basquete");
        esportes.add("Futebol"); // duplicado!

        System.out.println("Esportes cadastrados (sem repetição)");
        for(String esporte : esportes){ 
            System.out.println("- " + esporte);
        }


        //Verificando sem contém
        if(esportes.contains("Basquete")){
            System.out.println("Basquete está na lista");
        }

        //Removendo
        esportes.remove("Tênis");
        System.out.println("Tênis foi removido.");

   }
}