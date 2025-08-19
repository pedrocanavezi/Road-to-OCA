public class RevisaoDebug {
  public static void main(String[] args) {
    int[] numeros = {10, 20, 30, 40, 50};
    int resultado = calcularMedia(numeros);
    System.out.println("A média é: " + resultado);
    
    String nome = "Roberson";
    System.out.println("Tamanho do nome: " + nome.length());

    String[] palavras = {"Java", "C", "Python"};
    System.out.println("Última palavra: " + palavras[2]);
    System.out.println("Tamanho do array: " + palavras.length);
    System.out.println("Primeira palavra: " + palavras[0]);
  }

  public static int calcularMedia(int[] valores) {
    int soma = 0;
    for(int i = 0; i < valores.length; i++) {
      soma += valores[i];
    }
    return soma / valores.length;
  }
}