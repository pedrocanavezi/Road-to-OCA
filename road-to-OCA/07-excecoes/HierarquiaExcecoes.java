    public class HierarquiaExcecoes{
        public static void main(String[] args) {
            try {
                metodoPerigoso();
            } catch (RuntimeException e) {
            System.out.println("Peguei uma RunTimeException!");
            } catch (Exception e) {
                System.out.println("Peguei uma Exception genérica");
            }
        }
            static void metodoPerigoso(){
                throw new ArithmeticException("Divisão por zero");

            }
    }
