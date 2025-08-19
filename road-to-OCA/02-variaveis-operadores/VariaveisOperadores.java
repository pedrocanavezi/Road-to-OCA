 public class VariaveisOperadores{
    public static void main(String[] args){
    //Declaração básica de variáveis
            int idade = 18;
            double salario = 1900;
            boolean aprovado = true;
            char letra = 'K';
            String nome = "Rodolfo";
            boolean reprovado = !aprovado;
           
            // Operadores aritiméticos
            int soma = idade + 3;
            double bonus = salario * 0.2;

            // Operadores relacionais
            boolean maiorDeIdade = idade >= 18;
            
            //Operadores lógicos
            boolean podeEntrar = aprovado && maiorDeIdade;

            //Controle estrutural, queria controlar minha vida assim
            if (podeEntrar){
                System.out.println("Entrada liberada. Boa sorte Rodolfo!");
            }
            else{
                System.out.println("Entrada Negada. Recupere sua dignidade");
            }





            //Impressões fatais
            System.out.println("Nome: " + nome);
            System.out.println("Salário com bônus: " + (salario + bonus));
            System.out.println("Pode entrar? " + podeEntrar);
            System.out.println("Idade daqui a 3 anos: " + soma);
            // A variável é o que te prende à realidade. O operador, o que te leva ao erro.
            
    
        

    }

  }

