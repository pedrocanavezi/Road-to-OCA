public class LancandoExecao{
  public static void main(String[] args){
    try{
      int resultado = dividir(10, 0);
      System.out.println("Resultado: " + resultado);
    } catch(ArithmeticException e){
      System.out.println("Erro: Divisao por zero"); 
    }finally{
    System.out.println("Melhore a sua divisao");
  }
  }
  public static int dividir(int a, int b){
    if(b == 0){
      throw new ArithmeticException("Divisao por zero");
    }
    return a / b;
  }
}