public class FinallyReturn {

    public static void main(String[] args) {
        System.out.println("Resultado da função: " + metodoComFinally());
    }

    public static String metodoComFinally() {
        try {
            System.out.println("Executando com Try");
            return "Retorno do try";
        } catch (Exception e) {
            System.out.println("Exceção capturada");
            return "Retorno do catch";
        } finally {
            System.out.println("Bloco finally sempre executa!");
        }
    }
}