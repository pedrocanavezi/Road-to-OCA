 # 🧬 Herança & Polimorfismo – A evolução natural do caos em Java

 Se você não questionou sua dignidade até aqui, fique tranquilo: vai.

 ## 💡 Conceitos em prática

 ### 🔗 Herança

 Quando uma classe **filha herda tudo** (menos a dívida) de uma classe **pai**.  
 Evita o retrabalho e faz parecer que você pensou no design antes de sair codando.

 #### Exemplo

 ```java
 public class Guerreiro extends Personagem {
   // Herda nome, construtor e tudo mais do Personagem
 }
 ```

 ## 🧠 Polimorfismo

 É quando objetos do mesmo tipo pai (ex: `Personagem`) se comportam de forma diferente.  
 Tipo: todo mundo ataca, mas cada um do seu jeito.

 #### Exemplo

 ```java 
 for (Personagem p : personagens){
   p.atacar(); // Guerreiro usa espada, Mago usa laser, Tank vira parede.
 }
 ```

 ## ⚔️ Personagens criados

 ```java
 Personagem npc = new Personagem("Dignidade");
 npc.atacar();
 // 🗯️ Dignidade ataca de forma fraca!

 Guerreiro guerreiro = new Guerreiro("Thor");
 guerreiro.atacar();
 // ⚡ Thor invoca o Mjölnir, que desce dos céus e destrói tudo em volta!

 Mago mago = new Mago("Lux");
 mago.atacar();
 // 🔮 Lux lança um laser que colapsa tudo a sua volta!

 Tank tank = new Tank("Ornn");
 tank.atacar();
 // 🛡️ Ornn absorve todo o dano!
 ```

 ## 🌀 Demonstração de polimorfismo

 ```java
 Personagem[] personagens = {
   new Guerreiro("Thor"),
   new Mago("Lux"),
   new Tank("Ornn")
 };

 for (Personagem p : personagens){
   p.atacar(); // Cada um executa sua própria versão de atacar()
 }
 ```

 ## ✍️ Observações finais

 - **`extends`** → permite herança entre classes.  
 - **`@Override`** → sobrescreve os métodos herdados.  
 - **`System.out.println()`** → clássico. Te acompanha desde o `Hello World` até o fim da sua carreira. É ele o responsável por toda a poesia acima.  

 Java não é só uma linguagem — é quase uma religião.  
 (Com exceção do **ponto e vírgula**, que é uma maldição.)

 > E o C#? Só herdou o `extends`… e um sonho.
