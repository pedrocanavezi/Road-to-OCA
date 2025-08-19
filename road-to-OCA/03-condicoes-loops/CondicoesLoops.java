public class CondicoesLoops{
    public static void main(String[] args) {
          int idade = 16;

        
          //condicional simples
          if (idade >= 18){
            System.out.println("Maior de Idade!");
          }
          else{
            System.out.println("Volte quando for maior de idade!");
          }
          // Condicional encadeada
          int nota =7;
          if(nota >= 9){
            System.out.println("Muito bom, parabéns!");
          }
          else if (nota >= 7){ 
            System.out.println("Aprovado!");
            //Resultado esperado na OCA: mínimo pra não abraçar o `else` e sair de lá de cabeça erguida
          }
          else{
            System.out.println("Reprovado! Mais sorte da próxima vez.");
          }
         // Loop while
         int contador = 0;
         while (contador < 3){
            System.out.println("Contando: "+ contador);
            contador++;
         }

         //Loop for
         for (int i = 1; i <= 5; i++){
            System.out.println("Loop for: Passo " + i);

            //Opicional para matar
            System.out.println("Controle absoluto da lógica alcançado.");
         }
     }     

}