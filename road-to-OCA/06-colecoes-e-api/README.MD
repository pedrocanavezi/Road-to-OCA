# 📦 Arrays & ArrayList – Da rigidez à liberdade (ou quase)

Se você chegou até aqui achando que Java era que nem C#... bom, acertou — mas essa não é a questão.  
Java não tem carinho por você, e essa pasta marca o início no **fatídico** mundo das *listas em Java*.  
Respira, senta… e boa sorte tentando manter a sanidade.

## 📐 Arrays – O bloco de pedra da programação

Arrays em Java são tão modernas quanto cavernas: rígidos, primitivos, e ótimos pra quebrar a cabeça se você errar o índice.  
Mas são o começo de tudo. Segue o sacrifício:

```java
String[] esportes = {"Futebol", "Basquete", "Vôlei", "Tênis", "Natação"};
System.out.println(esportes[0]); // Acessando diretamente
```

Iterando com **for**:

```java
for (int i = 0; i < esportes.length; i++) {
    System.out.println((i + 1) + "º - " + esportes[i]);
}
```

Alterando o valor:

```java 
esportes[2] = "Skate";
```

> Arrays são como juramentos de sangue: difíceis de mudar, mas essenciais pra começar a saga.

---

### 🧪 ArrayList – Flexibilidade com efeitos colaterais

Se Array é pedra, ArrayList é massinha de modelar.  
Você pode adicionar, remover, editar, verificar e até contar elementos — tudo sem perder cabelo (ou quase).

```java 
ArrayList<String> esportes = new ArrayList<>();

// Adicionando
esportes.add("Futebol");
esportes.add("Tênis");

// Acessando
System.out.println(esportes.get(0));

// Removendo o primeiro "Tênis" da lista
esportes.remove("Tênis");

// Atualizando
esportes.set(1, "Surfe");

// Verificando se existe
if (esportes.contains("Futebol")) {
    System.out.println("⚽ Futebol confirmado na lista!");
}

// Tamanho da lista
System.out.println("Total de esportes cadastrados: " + esportes.size());
```

> ArrayList é liberdade. Mas cuidado: liberdade sem controle vira bug com autoestima.

🧠 **Vivência**: Agora, quando eu erro no **ArrayList**, tenho certeza que a culpa é quase inteiramente do console — e mesmo assim, se houver dúvida... é *feature*.

---

#### 🔚 Conclusão 

Entre arrays que não mudam e listas que mudam demais, o Java só quer te ver sofrendo um pouquinho antes de deixar você programar direito.  
E sim, tudo isso serve pra guardar nomes de esportes.  
Mas amanhã pode ser senhas.  
Ou falhas.  
Ou logs de auditoria.

> Mas se tiver erro...  
> A culpa é sua.  
> Ou do console.

---

# 🗺️ Map & HashMap – Porque guardar chave sem valor não faz sentido (exceto em banco público)

Se você achava que `ArrayList` era bagunça, o Java apresenta o `Map` — onde cada chave tem um valor… e cada valor pode sumir como dignidade em daily às 8h da manhã.

Aqui a gente não armazena só nomes. A gente indexa, atualiza, remove e ainda suspeita de que algum `null` esteja espreitando por trás da chave.

## 🔐 HashMap – Dicionário de caos controlado

O `HashMap` funciona como um caderninho de medalhas, mas sem a parte onde você lembra quem você premiou.

```java
Map<String, Integer> medalhas = new HashMap<>();

// Adicionando
medalhas.put("Futebol", 2);
medalhas.put("Tênis", 1);
medalhas.put("Natação", 3);

// Acessando
System.out.println("Medalhas na Natação: " + medalhas.get("Natação") + " medalhas.");

// Atualizando
medalhas.put("Tênis", 2);

// Removendo
medalhas.remove("Skate"); // Tá fora, desclassificado!

// Verificando
if (medalhas.containsKey("Natação") && medalhas.containsValue(5)) {
    System.out.println("Temos um campeão com 5 medalhas!");
}
```

> No `HashMap`, se você errar a chave, o valor some com sua alma — em silêncio. Igual à confiança em promessas de cronograma ágil.

## 📊 Resultado Final

```diff
Tabela geral de medalhas:
- Futebol: 2 medalhas
- Tênis: 2 medalhas
- Natação: 5 medalhas
```

🧠 **Vivência**: Mapas são úteis pra quando você quer parecer organizado, mas na real tá dando `.put()` pra todo lado esperando que funcione.  
E quando não funciona, é `null`. Sempre `null`.

# 🧮 Ordenação, Comparação & Sets – Quando a Lista Cresce e o Caos se Organiza

Se você chegou até aqui, parabéns. Você sobreviveu aos arrays e às listas. Agora vem a parte onde tudo **parece controlado**, mas o Java ainda tá com a faca na bota.

## 🥇 Comparator – Criando Rankings e Mudando as Regras

Nem toda lista quer ser lida na ordem em que nasceu. Às vezes, você quer **rankear**, e pra isso existe o `Comparator`: uma ferramenta pra dizer quem vem primeiro sem ter que brigar por isso (mas com override, claro).

**Exemplo:**
```java
List<Esporte> esportes = new ArrayList<>();
esportes.add(new Esporte("Futebol", 90));
esportes.add(new Esporte("Tênis", 75));
esportes.add(new Esporte("Basquete", 88));
esportes.add(new Esporte("Natação", 92));

// Ordenação por pontuação (decrescente)
Collections.sort(esportes, new OrdenaPorPontuacao());
```

### 🧠 Vivência:
Quando você percebe que a ordem natural da vida não ajuda ninguém — então você cria a sua.  
E se alguém perguntar *“mas como ele tá em primeiro?”*, você só responde: `Comparator`, irmão.

## 🏷️ Classe Esporte – Dados com Emoção

A classe `Esporte` vem com nome e pontuação. Simples, direto e com `toString()` sobreescrito, porque a gente quer **bonito no console**, não só funcionando.

```java
@Override
public String toString() {
    return nome + "(" + pontuacao + " pts)";
}
```

### Resultado da Ordenação:
```
Ranking por Pontuação (decrescente):
- Natação(92 pts)
- Futebol(90 pts)
- Basquete(88 pts)
- Tênis(75 pts)
```

---

## 🧼 Set & HashSet – Sem Bagunça, Sem Duplicatas

Chegou a hora de limpar a casa. O `Set` é aquela estrutura que **não aceita bagunça**. Você até pode tentar repetir o mesmo valor... mas ele te ignora com classe.

**Exemplo:**
```java
Set<String> esportes = new HashSet<>();

esportes.add("Futebol");
esportes.add("Tênis");
esportes.add("Basquete");
esportes.add("Futebol"); // Vai ignorar essa linha
```

### Resultado:
```
Esportes cadastrados (sem repetição)
- Futebol
- Tênis
- Basquete
```

### Operações úteis:
- `contains()` → Pra saber se tá na lista  
- `remove()` → Pra chutar fora o que já deu

```java
if(esportes.contains("Basquete")){
    System.out.println("Basquete está na lista");
}

esportes.remove("Tênis");
System.out.println("Tênis foi removido.");
```

---

## 🔚 Conclusão

Entre ordenações e conjuntos, a vida do programador segue cheia de escolhas:
- Ordenar ou ignorar?
- Repetir ou recusar?
- Usar `Set` ou insistir em `ArrayList` e culpar o console depois?

A verdade é simples:  
> Se você repetir dados num `Set`, o Java te ignora.  
> Se você não implementar um `Comparator`, ele ignora sua lógica.  
> E se der erro, a culpa é sua. Ou... do `null`.

---

```
🧠 Dica final: Nunca subestime um print ordenado. RH adora.
```
# 🧵 Wrappers – Quando o Primitivo se Disfarça

Em Java, até os tipos primitivos têm sua versão “de terno e gravata” — os famosos *Wrappers*.  
E sim, eles existem pra você poder chamar métodos bonitinhos como `.compareTo()` sem apanhar do compilador.

---

## 🎁 Autoboxing & Unboxing – Magia (quase) automática

**Autoboxing**: Converter um tipo primitivo em um objeto wrapper.  
**Unboxing**: O inverso – tirar o conteúdo da caixinha.

```java
int idade = 18;
Integer idadeWrapper = idade; // Autoboxing

int idadeDeVolta = idadeWrapper; // Unboxing
```

🧠 **Vivência**: O Java faz isso por você. Mas quando dá erro, ele finge que nunca te conheceu.

---

## 📦 Métodos úteis

Wrappers trazem métodos de utilidade real (e emocional):

```java
Integer x = 10;
Integer y = 20;

System.out.println(x.compareTo(y)); // -1 (x < y)
```

Resultado de `compareTo()`:

- 🔻 Retorna **negativo** se o valor for **menor**
- ✅ Retorna **0** se for **igual**
- 🔺 Retorna **positivo** se for **maior**

> Java não se importa com *quanto* você perdeu. Só que perdeu.

---

## 🎯 Conversões que salvam (ou ferram)

```java
String numero = "123";
int convertido = Integer.parseInt(numero);
```

> Se a string for “abc”, aí... é exceção na veia. Mas quem nunca?

---

## 🔚 Conclusão

- **Wrappers** são úteis em Collections, métodos de comparação e conversões.
- **Primitivos** são mais leves, mas... não têm métodos.
- Use com sabedoria. Ou use e depois culpe o console. Funciona igual.

```
🧠 Dica final: Se você não sabe por que seu código quebrou... talvez tenha usado `==` com wrappers. E aí meu amigo, nem o debugger salva.
```