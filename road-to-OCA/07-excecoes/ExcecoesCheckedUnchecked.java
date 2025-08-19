public class ExcecoesCheckedUnchecked{
    public static void main(String[] args){
        //ArithmeticException
        try {
            int resultado = 10/0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero detectada!");
        }


        // ArrayIndexedOfBoundsException
        try { 
            int [] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice do array fora dos limites.");
        }
        //NullPointerException
        try {
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("Tentativa de acessar método em referência nula");
        }
        System.out.println("Fim do programa sem crash.");
    }
}