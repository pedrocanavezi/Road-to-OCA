
import java.util.*;

public class ResumoColecoes{
    public static void main(String[] args){
        //--------------ArrayList----------------
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Limão");
        frutas.add("Laranja");
        frutas.remove("Banana");
        System.out.println("ArrayList: " + frutas);


        //-----------------HashMap-----------------
        Map<String, Integer> pontuacoes = new HashMap<>();
        pontuacoes.put("Pedro", 90);
        pontuacoes.put("Dignidade", -100);
        pontuacoes.put("João", 32);
        pontuacoes.remove("Dignidade");
        System.out.println("HashMap: " + pontuacoes);


        //-------------Comparator-----------------
        List<Esporte> esportes = new ArrayList<>();
        esportes.add(new Esporte("Futebol", 88));
        esportes.add(new Esporte("Natação", 95));
        esportes.add(new Esporte("Tênis", 79));
        
        esportes.sort(new Comparator<Esporte>() {
            public int compare(Esporte e1, Esporte e2){

                return Integer.compare(e2.pontuacao, e1.pontuacao);

            }
        });
        System.out.println("\nRanking por pontuação:");
        for (Esporte e : esportes){
            System.out.println("- " + e);
        }
       //---------------Wrappers---------------
       int primitivo = 42;
       Integer wrapper = primitivo; //Autoboxing
       int desempacotado = wrapper; //unboxing


       //------------Conversão-----------------
       String numeroStr = "123";
       int convertido = Integer.parseInt(numeroStr);
       System.out.println("String convertida em int: " + convertido);

    }
}
class Esporte {
    String nome;
    int pontuacao;

    public Esporte(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
    
    @Override
    public String toString(){
        return nome +"(" + pontuacao + " pts)";
    }
}