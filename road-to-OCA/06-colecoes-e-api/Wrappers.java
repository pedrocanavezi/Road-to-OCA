 public class Wrappers {
    public static void main(String[] args){
    //Primitivos
    int idadePrimitiva = 18;
    double precoPrimitivo = 9.99;


    //Autoboxing: primitivo virando Wrapper
    
    Integer idadeWrapper = idadePrimitiva;
    Double precoWrapper = precoPrimitivo;
     

    System.out.println(" Idade (Wrapper): " + idadeWrapper);
    System.out.println("Preço (Wrapper): " + precoWrapper);

    //Unboxing: wrapper virando primitivo
    int idadeDescompactada = idadeWrapper;
    double precoDescompactado = precoWrapper;

    System.out.println("Preço (Primitivo): " + precoDescompactado);
    System.out.println("Idade (Primitiva): " + idadeDescompactada);
    


    // conversão de String para int
    String entrada = "123";
    int numeroConvertido = Integer.parseInt(entrada);
    System.out.println("String '123' virou: " + numeroConvertido);
     

    //Métodos úteis do wrapper
    int max = Integer.max(idadePrimitiva, numeroConvertido);
    System.out.println("Maior entre idade e número convertido: " + max);


    //Comparação de wrappers
    Integer x = 10;
    Integer y = 20;

    System.out.println("Comparando x e y: " + x.compareTo(y));


 
    }
}