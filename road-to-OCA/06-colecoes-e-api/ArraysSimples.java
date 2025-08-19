public class ArraysSimples {
    public static void main(String[] args){
        //O pesadelo começa agora, boa sorte pra mim
        //Criação de um array fixo com 5 esportes
        String[] esportes = {"Futebol", "Basquete", "Vôlei", "Tênis", "Natação"};
        

        //Acesso direto pelo índice
        System.out.println("Esporte favorito do dia: " + esportes[0]);

        //interando com for tradicional
        System.out.println("\n🏅 Lista de esportes disponíveis:");
        for (int i = 0; i < esportes.length; i++){
            System.out.println((i+ 1)+ "º - " + esportes[i]);
        }

        //Alterando um valor no array
        esportes[2] = "Skate";
        System.out.println("\n🤸 Mudança de última hora! Vôlei saiu, entrou: " + esportes[2]);
        

    }
}