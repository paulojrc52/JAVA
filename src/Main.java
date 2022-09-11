
//Aula1
/*Aula1 - Hello World!:
write your code here
System.out.println("Hello world!");
*/

//Aula2
/*Aula2 - Tipos de Dados:
Nessa aula vamos aprender sobre variaveis, sobre tipos de dados que podemos trabalhar com JAVA.

Java define 8 tipos de dados primitivos:

1 - byte:
Tipo byte de dados é um inteiro de complemento de 8 bits com sinal. Tem um valor
mínimo de -128 e um valor máximo de 127 (inclusive). O tipo byte
de dados pode ser útil para economizar memória em arrays grandes, onde
a economia de memória realmente importa. Eles também podem ser usados no lugar de "int"
onde seus limites ajudam a esclarecer seu código; O fato de o alcance
de uma variável ser limitado pode servir como uma forma de documentação.

2 - short:
O tipo short de daods é um inteiro de complemento de dois de 16bits com sinal.
Tem um valor mínimo de -32.768 e um valor máximo de 32.767(inclusive).
Assim como com byte, as mesmas diretrizes se aplicam: você pode usar a
short para economizar memória em arrays grandes, em situações em que
a econimoa de memória realmente importa.

3 - int:
Por padrão, o tipo de dados int é um inteiro de complemento de dois com sinal de 32 bits,
que tem um valor mínimo de -2³¹ e um valor máximo de 2³¹-1.
No Java SE 8 e posterior, você pode usar o tipo int de dados para representar
um inteiro sem sinal de bits, que tem um valor mínimo de 0 e um valor máximo
de 2³²-1. Use a classe Integer para usar int como um inteiro sem sinal.

4 - long:
O tipo long de dados é um inteiro de complemento de 64bits. O long assinado tem um valor mínimo
de -2 63 e um valor máximo de 2 63-1.
No Java SE 8 e posterior, você pode usar long para representar um inteiro
sem sinal de 32 bits, que tem um valor mínimo de 0 e um valor máximo de
2 64-1. Use esse tipo de dados quando precisar de um intervalo de valores
mais amplo do que os fornecidos por int.

5 - float:
O tipo float é um ponto flutuante IEEE 754 de 32 bits de precisão simples.
Seu intervalo de valores está além do escopo desta discussão.
Assim como nas recomendações para byte e short use float(em vez de double) se precisar economizar
memória em grandes matrizes de números de ponto flutuante. Esse tipo de dado
nunca deve ser usado para valores precisos, como moeda.



6 - double:
O tipo de dado double é um ponto flutuante IEEE 754 de precisão dupla de 64 bits.
Para valores decimais, esse tipo de dados geralmente é a opção padão.
Conforme mencionado acima, esse tipo de dados nunca deve ser usado
para valores precisos, como moeda.


7 - boolean:
O tipo boolean tem apenas dois valores possíveis: "true" e "false".
Esse tipo de dados é utilizado para sinalizadores simples que rastreiam
condições Verdadeiro/Falso. Esse tipo de dados representa um bit de informação, mas seu "tamanho"
não é algo definido com precisão.


8 - char:
O tipo char é um único caractere de 16 bits.
Tem um valor mínimo de '\u0000'(ou 0) e um valor máximo de
'\uffff'(ou 65.535 inclusive).

A diferença principal entre esses tipos dados, basicamente é
o quanto de dados você consegue armazenar em cada um deles

Imagine que eu tenho um comando de print, e eu quero quero que ela imprima
Ola, Paulo...

System.out.println("Olá, Paulo");

Agora imagine que eu queira mudar meu nome para outro nome, então eu preciso
variar o nome para quem estamos dizendo "ola".
Então para isso eu preciso usar o conceito de variáveis,
Vamos guarda essa informação em um lugar especifico, que é uma forma de
referencia a memoria do meu computador.

O que eu preciso fazer é declarar uma variavel.
Para isso eu preciso dizer qual o tipo de informação que essa variável vai guardar,
que nesse caso é uma string, porque estamos guardando um texto.
Então eu preciso dizer o tipo de dados da variável, o nome da variável e na mesma
linha eu já posso atribuir o valor para ela.

String nome = "João"; //Declaração e atribuição

Eu posso também fazer alterações, atribuir outros valores
para essa variável.


String nome; // Declaração
nome = "Jessé"; // Atribuição
nome = "Paulo"; // Atribuição/Alteração
nome = "Brasil"; // Atribuição/Alteração

Essa é a forma de a gente trabalhar com textos.



Agora para refletir essa mudança no codigo, eu preciso instruir ele
a exibir essa variavel.
dentro dos parenteses do "println()" eu coloco o que eu quero que exiba
entre aspas, e fora das aspas eu coloco o sinal de mais(+) seguido pelo nome da
variável.

Nesse caso, dessa maneira o nome vai variar de acordo com o valor
que atribuirmos na nossa variável.

System.out.println("Olá, " + nome);



Digamos que eu queira somar 2 numeros, guardar esse resultado e
exibir no terminal.

Então antes de tudo preciso declarar duas variáveis "a" e "b" e atribuir
valores para as duas.
Depois eu preciso declarar uma terceira variável para fazer a soma
desses valores, nesse caso, vamos chamar de "soma"
e vamos atribuir como valor para ela, o valor da soma de a + b.
Nesse caso o mais(+) esta trabalhando como um "Operador de Soma".

Aparti dai entramos no assunto de operadores aritméticos,
que são eles:

(+) para representar soma
(-) para representar subtração
(*) para representar multiplicação
(/) para representar divisão

int a;
int b = 2;
a = 3;


int soma = a + b;

int subtraçao = a - b;

int multiplicaçao = a * b;

int divisao = a / b;

Dessa maneira, todos vão ser exibidos corretamente, porém somente
na parte da divisão que o resultado não será preciso, ele mostrará 1
para nos como resultado, e o resultado correto seria 1.5..

Isso acontece porque para mim receber um valor de ponto flutuante, eu preciso
declarar a variável "divisao" como sendo do tipo de dados float.

int soma = a + b;

int subtraçao = a - b;

int multiplicaçao = a * b;

float divisao = a / b;

mas isso ainda não será o suficiente, pois por mais que ela seja uma variável do
tipo float, ela está recebendo dados do tipo int como valor.

Para resolver isso, eu teria então que transformar esses dados que estamos
recebendo do tipo int, para o tipo de dados float...
Para isso, nos usamos uma operação chamada "Cast", isso significa usar
parenteses() na expressão, antes da operação de divisão, e dentro dos parenteses podemos escrever
a palavra "float", exemplo:
" float divisao = (float) a / b; ".
Isso vai fazer com que ele represente o resultado dessa operação como
sendo do tipo float e não do tipo int.

int soma = a + b;

int subtraçao = a - b;

int multiplicaçao = a * b;

float divisao = (float) a / b;

System.out.println(soma);
System.out.println(subtraçao);
System.out.println(multiplicaçao);
System.out.println(divisao);

*/

//Aula3
/*
Aula3 - Operadores Booleanos | Tabela Verdade:

Nessa aula, vamos aprender, sobre operações logicas...
Ou seja, sobre o tipo de dados "boolean" e sempre como
usar operadores pra fazer análises lógicas.

Antes de tudo, vamos criar uma variável do tipo "boolean" com
nome de resultado e com o valor de "true".

Dessa forma, declaramos uma variável e atribuimos um
valor logico, nesse caso true(verdadeiro)
boolean resultado = true;
System.out.println(resultado);




Da mesma forma que existe os operadores aritméticos,
nós também temos os operadores lógicos.

Para usar um Operador lógico, nos temos que fazer o que chamamos
de algoritmos, isso significa fazer uma sequência de passos.

Então nós vamos fazer um algoritmo para "ir a praia"...
Esse algoritmo vai ser baseado em duas condições, por exemplo:
"Só vamos a praia se for fim de semana e se tiver fazendo sol, caso
contrário não vamos a praia."
Aqui temos um Algoritmo(Ir a praia) que só vamos executar se as duas condições
forem verdadeiras(true).



Para transformar esse algoritmo em código, temos que declarar uma
variável do tipo boolean com nome "fimDeSemana" e atribuir o valor true
para ela, exemplo:
"boolean fimDeSemana = true;"
E note que usamos o metodo camel case para nomear essas variáveis
pois dessa forma ficar melhor organizado o código e tambem segue
a regra de nomes para variáveis no Java,
que são elas:
- O nome de uma variável não pode conter um número no inicio do nome.
- O nome de uma variável não pode conter caracteres especiais no inicio da nome.
- O nome de uma variável não pode conter espaços entre as palavras.

Após criarmos a variável do tipo boolean com nome de "fimDeSemana",
vamos criar outra com nome de "fazendoSol" e vamos atribuir o valor
de true a ela, exemplo:
"boolean fazendoSol = true;"

Agora para combinar essas duas condições, vamos usar
os operadores lógicos.

Pra isso vamos criar outra variável do tipo boolean
com nome de "vamosAPraia" e ela vai ser o resultado.
Assim como podemos fazer com soma, subtração e as
operações aritméticas,
nós também podemos fazer com os operadores lógicos.

Então vamos atribuir os valores "fimDeSemana" e "fazendoSol" para
essa variável com nome de "vamosAPraia".

Para essa variável poder retornar true, ou seja, pra podermos
ir a praia, eu tenho que receber o valor das duas variáveis,
uma com nome de "fimDeSemana" ""e"" outra com nome de "fazendoSol"
como sendo verdadeiras(true), então pra mim representar o operador
lógico "e" eu uso dois "e comerciais"(&&).
Exemplo:
"boolean vamosAPraia = fimDeSemana && fazendoSol;"

Então para podermos ir a praia tenho que receber os valores
das duas variáveis, tanto da "fimDeSemana", quanto da "fazendoSol"
como sendo verdade(true).
E o que acontece é que no Java nós temos a "Tabela Verdade".

Na Tabela Verdade, temos os operadores lógicos, que são eles:

- Operador "E"(AND) -> &&
° Para o Operador &&, só é verdade quando todas as
condições são verdadeiras:
// true && true = true;
// true && false = false;
// false && true = false;
// false && false = false;
boolean fimDeSemana = true;
boolean fazendoSol = true;
boolean vamosAPraia = fimDeSemana && fazendoSol;
System.out.println(vamosAPraia);

- Operador "OU"(OR) -> ||
° Para o Operador duplo pip(||), vai ser verdade(true) todas
as vezes que um, "ou" outro for verdade:
// true || true = true;
// true || false = true;
// false || true = true;
// false || false = false;
boolean fimDeSemana = true;
boolean fazendoSol = false;
boolean vamosAPraia = fimDeSemana || fazendoSol;
System.out.println(vamosAPraia);



Existe uma outra maneira muito simples para
a gente trabalhar com esses valores, que são
os chamados operadores ternarios.

O operador ternario, também é usado nesse contexto de operações logicas,
ele é o operador com a interrogação(?), ele é bastante
usado quando temos dois comportamentos possiveis.

Pra mim ter um  operador ternario, eu posso ter uma
variavel do tipo "string" com nome de mensagem e o valor que vamos
atribuir para esse mensagem, é baseado em ser fim de semana, e pra mim
poder atribuir um valor baseado em um condição, eu preciso
usar uma interrogação(?) logo depois do nome da variável que a
gente quer se basear e depois do ponto de interrogação(?)
escrevemos entre aspas a mensagem que queremos exibir,
exemplo:
String mensagem = fimDeSemana ? "É fim de semana"
Isso significa que se a variável "fimDeSemana" tiver o valor de
verdadeiro(true), vai ser mostrado a mensagem "É fim de semana".

Agora precisamos de um "caso ao contrário" e ele é representado
no Java usando "dois pontos"(:)
Após ele, eu posso escrever a mensagem que eu quero exibir caso
não seja fim de semana, exemplo:

String mensagem = fimDeSemana ? "É final de semana" : "Não é final de semana";

Toda essa linha de código é chamada de operador ternario, porque temos três
termos, o primeiro é o termo sendo avaliado, nesse caso "fimDeSemana",
o segundo termo é o valor caso seja verdadeiro, nesse caso a mensagem
"É final de semana", e o terceiro termo é o valor caso seja falso, nesse caso
a mensagem "Não é final de semana".
Dessa forma temos uma atribuição condicionada ao valor de um variável.


Então pra mim representar um operador ternario
eu uso o "interrogação"(?) representando o "SE"
e  o "duplo pip"(||) representando o "CASO CONTRÁRIO".

boolean fimDeSemana = true;
boolean fazendoSol = true;
boolean vamosAPraia = fimDeSemana && fazendoSol;

System.out.println(vamosAPraia);


String mensagem = fimDeSemana ? "É final de semana" : "Não é final de semana";
System.out.println(mensagem);
*/

//Aula4
/*
Aula 4 -Estruturas Condicionais:

Nessa aula, vamos aprender sobre estruturas condicionais
como a gente pode controlar o nosso codigo, a ser executado ou não
baseado em valores lógicos.

Vamos fazer um caso simples onde a gente quer saber se um aluno,
baseado na nota que ele recebeu, se ele está aprovado ou não.

Então antes de tudo, o que preciso fazer é declarar uma variavel
do tipo int, onde eu vou ter a nota do aluno,
exemplo:
"int nota = 70;"
Nós vamos assumir nesse caso, que a media necessária pra
ser aprovado também é de 70.

Então agora eu quero saber se a nota do aluno é maior
ou igual a 70, se for, o Aluno está aprovado.

if() - else():
Pra escrever esse tipo de condição podemos usar o tipo de operadores
"if() - else()",
exemplo:
if (nota >= 70) {
System.out.println("Aluno aprovado!);
} else {
System.out.println("Aluno reprovado!");
}
Esse codigo ficou assim:
"Se a nota for maior(>) ou igual(=) a 70, então o aluno está
aprovado, caso contrário, ou seja, a nota é menor do que 70,
então o aluno está reprovado."
Nesse caso o if() está representando o "SE" e o else está
representando "CASO AO CONTRÁRIO".






Outra situação interessante também com notas, é que algumas
instituições gostam de usar Graduações do tipo "A", "B", "C"...
Então podemos imaginar o seguinte, "A" vale 80, "B" vale 70, "C"
vale 60 e o "D" 0
Pra fazermos isso temos que fazer uma condição do tipo:
"Se a nota é maior ou igual 80, então ela vai ser 'Graduação A',
Se não, se a nota for menor que 80 e maior igual a 70, então vai
ser 'Graduação B', se não, se a nota for menor que 70 e maior ou igual a 60
então vai ser 'Graduação C', se não, se a nota for menor que 60 e
maior ou igual a 0, então é uma 'Graduação D', caso contrario é uma
'Graduação Inválida."
Pra isso usamos o if() e o else if(), exemplo:
if(nota >= 80) {
System.out.println("Graduação A");
}else if (nota < 80 && nota >= 70) {
System.out.println("Graduação B");
} else if (nota < 70 && nota >= 60) {
System.out.println("Graduação C");
} else if (nota < 60 && nota >= 0){
System.out.println("Graduação D");
} else {
System.out.println("Graduação Inválida");
}

Agora baseado nessa graduação, eu quero saber se o aluno foi
aprovado ou reprovado.
Pra isso embaixo da variável "nota", eu tenho que declarar uma
variável do tipo String com nome de "graduaçao",
exemplo:
"String graduaçao;"
E agora o invés de exibir essa graduação no terminal, nos vamos
atribuir um valor a variável,
exemplo:
if(nota >= 80) {
graduaçao = "A";
}else if (nota < 80 && nota >= 70) {
graduaçao = "B";
} else if (nota < 70 && nota >= 60) {
graduaçao = "C";
} else if (nota < 60 && nota >= 0){
graduaçao = "D";
} else {
graduaçao = "";
}

Após isso podemos definir uma estrutura chamada "switch".



- switch():
switch é outra forma de escrever algo parecido com o if() else()
e no switch você passa a variavel que você quer se basear,
abre e fecha chaves({}) e dentro das chaves colocar os "case",
exemplo:
swithc (graduacçao) {
case "A":
case "B":
System.out.println("Aluno Aprovado!");
case "C":
case "D":
System.out.println("Aluno Reprovado!");
defaut:
System.out.println("Graduação Invalida!");
}
Aqui estamos fazendo um switch() em cima da variável "graduaçao", que
vai ter os valores "A", "B", "C", "D" ou nada..
Então ficou assim:
"Se o aluno ta entre A e B, o aluno esta aprovado,
se o alun ta entre C e D, o aluno foi reprovado e se não
for nenhuma dessas opções, então significa que algo deu errado na
nossa conversão e a gente tem uma graduação inválida.
Dessa forma vai mostrar todas as mensagens,"Aluno Aprovado", "Aluno Reprovado"
e "Graduação Inválida" e isso é um bug, o que acontece é que todos os casos
estão sendo avaliados e nos precisamos definir uma situação de parada,
e pra isso usamos o "break;"
exemplo:
swithc (graduacçao) {
case "A":
case "B":
System.out.println("Aluno Aprovado!");
break;
case "C":
case "D":
System.out.println("Aluno Reprovado!");
break;
defaut:
System.out.println("Graduação Invalida!");




int nota = 100;
String graduaçao;

if (nota >= 80) {
graduaçao = "A";
} else if (nota < 80 && nota >= 70) {
graduaçao = "B";
} else if (nota < 70 && nota >= 60) {
graduaçao = "C";
} else if (nota < 60 && nota >= 0) {
graduaçao = "D";
} else {
graduaçao = "";
}

switch (graduaçao) {
case "A":
case "B":
System.out.println("Aluno Aprovado!");
break;
case "C":
case "D":
System.out.println("Aluno Reprovado!");
break;
default:
System.out.println("Graduação Inválida!");
}




*/

//Aula5
/*
Aula5 - Strings e Datas:
Nessa aula vamos aprender sobre manipulação de strings
e datas.
E nós ja aprendemos a declarar String:
String texto = "Olá mundo"
uma string texto que ta sendo atribuida um valor.
Mas e se quisessemos fazer uma coisa mais elaborada?
Do tipo "Olá, {nome}. Hoje é (dia-da-semana), BOM DIA".
Como poderiamos fazer algo tão complexo desse tipo?

Então aqui vamos precisar usar manipulações de Strings, pra colocar por
exemplo esse ultimo texto, "BOM DIA", todo em letras maiusculas e também
vamos precisar fazer manipulações de datas, pra saber qual é o dia da semana
e principalmente qual é a hora do dia, pra gente saber qual a saudação correta,
"BOM DIA", "BOA TARDE", "BOA NOITE", o que fazer..

Então a primeira coisa que tenho que fazer é declarar uma variavel que vai
receber o nome, exemplo:
String nome = "Jessé";
E esse nome, a gente tem algumas manipulações que ja são
proprias do Java, por exemplo:
System.out.println(none.toUpperCase());
Com esse código vamos ter todo o nosso texto em uppercase, ou seja
letras maiusculas.

Da mesma forma se eu quiser tudo em letra minusculas,
só vamos alterar o "toUpperCase()", por "toLowerCase()",
exemplo:
System.out.println(nome.toLowerCase());

Também temos algumas outras funções pra gente saber por
exemplo qual o comprimento do meu texto com o "length()",
exemplo:
System.out.println(nome.length());

Se tratando de Strings, a gente pode usar o nome da variável seguido
por ponto(.) e em seguida colocamos qual a manipulação a gente deseja fazer.


Da mesma maneira que podemos comparar dois números, pra ver
se são maior, menor ou igual, a gente também pode fazer essas manipulações
com Strings, porém a gente faz de uma forma um pouco diferente.
Ao invés de usarmos o operador "igual igual"(==), a gente faz parecido com
a outra abordagem que vimos, do ponto(.).
Exemplo:
String nomeOutro = "Jessé";
System.out.println(nome.equals(nomeOutro);
Com o ponto(.) equals() a gente compara tudo, pra ver se é exatamente igual,
nesse caso, os dois tem que ser exatamente iguais, até na questão de maiusculo ou minusculo.

Ja usando o ponto(.) equalsIgnoreCase(), ele vai ignorar essa questão
de maiusculo ou minusculo e vai levar em consideração somente se é o
mesmo nome.
Exemplo:
String nomeOutro = "jessé";
System.out.println(nome.equalsIgnoreCase(nomeOutro);


String nome = "Jessé";
System.out.println(nome.toUpperCase());
System.out.println(nome.toLowerCase());
System.out.println(nome.length());

String nomeOutro = "jessé";
System.out.println(nome.equalsIgnoreCase(nomeOutro);


Agora vamos começar a construir o nosso objetivo, que é :
"Olá, {nome}. Hoje é (dia-da-semana), BOM DIA".
Como a gente pode fazer isso ?
Já temos um nome :
String nome = "Jessé";
Agora precisamos descobrir qual o dia da semana, e qual a hora do dia
pra poder fazer a saudação.

Pra representar uma data existe um padrão mundial chamado: "ISO 8601"
e isso vai definir como representar uma data de formato padrão,
para o mundo inteiro.
O Java implementa esse padrão atráves do "LocalDate", só que esse arquivo
faz parte de outro pacote, então pra poder usar ele, no inicio do nosso arquivo
temos que definir um "import",
exemplo:
"import java.time.LocalDate;"
Com isso a gente importou essa classe, esse arquivo, para o nosso
código e agora ja podemos usar o "LocalDate".

Então vamos usar "LocalDate" como tipo da minha variável e vamos
dar o nome de "hoje" e vamos atribuir o valor "LocalDate.now()",
exemplo:
LocalDate hoje = LocalDate.now();
Então esse código representa uma data, com as informações locais.
Dessa forma eu consigo recuperar qual é o dia de hoje e vamos ter
uma representação de ano/mês/dia.

Essa é a forma mais simples de representar datas, mas existe
várias outras informações dentro do "System.out.println(hoje);",
por exemplo, nos podemos saber o dia da semana usando o ponto(.)
seguido por "getDayOfWeek()",
exemplo:
System.out.println(hoje.getDayOfWeek());
Dessa forma ele ira aprensetar por escrito o dia da semana, porém escrito
em inglês, mas podemos fazer essa tradução de forma automatica.

Pra isso precisamos depois de "getDayOfWeek()" colocar um outro ponto(.)
e escolher como vamos exibir essa informação com o "getDisplayName()" e eu preciso
passar duas informações, a primeira é "o estilo do texto"(textStyle) e definimos
como sendo "FULL", então eu tenho o nome completo do nome.
exemplo:
System.out.println(hoje.getDayOfWeek().getDisplayNome(textStyle.FUUL));

A segunda, eu tenho que passar qual a "localidade"(locale) e pra não
ficar uma linha muito grande vamos separar, então primeiro temos que importar o
"Locale"
exemplo:
import java.util.Locale;
Após importarmos, vamos criar um novo Locale,
exemplo:
"Locale brasil = new Locale( language: "pt", country: "BR" );"
Aqui nós passamos qual a linguagem(pt) e
em seguida passamos  qual é o país(BR)

Tem uma particularidade no IntelliJ que é preciso prestar atenção
Esses termos "language:" e "country:" não fazem parte do código.

Depois de ter definido o pais, eu posso passar essa informação,
exemplo:
"System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));"
Esse é o código, nele eu tenho a data de hoje, tenho a representação do país
e eu vou exibir o dia da semana com a seguinte formatação:
"Nome completo, no formato do Brasil"

Estamos quase lá, agora já temos o dia da semana, agora precisamos
saber que horas são pra podermos exibir a saudação.

Para isso podemos declarar uma String com nome de "saudaçao"
sem atribuir nenhum valor.

Esse LocalDate representa apenas a data, mas não a hora.
Então podemos fazer o import do "LocalDateTime" pra isso:
import java.time.LocalDateTime;
E podemos criar uma variavél do tipo "LocalDateTime" que vai receber
o nome de "agora" e ele vai receber o valor de "LocalDateTime.now(),
exemplo:
LocalDateTime agora = LocalDateTime.now();
Com isso vamos ter a informação da hora atualmente.
Depois disso podemos fazer uma condicional com if() e dentro dos
parenteses eu colo "agora", "ponto(.)" "getHour()" e agora eu preciso
comparar se é de manhã de tarde ou a noite.
exemplo:
if(agora.getHour() >= 0 && agora.getHour() < 12 ){
saudaçao = "bom dia";
} else if(agora.getHour() >= 12 && agora.getHour < 18 {
saudaçao = "boa tarde";
} else if(agora.getHour() >= 18 && agora.getHour < 18 {
saudaçao = "boa noite";
}
Agora temos todos os elementos da minha saudação, agora preciso montar
isso pra pode exibir no terminal.
A gente vem usando o "System.out.println()" sendo que eu preciso
escrever todo o texto de uma vez, e eu tenho
vários componetes pra forma esse texto.

Existe outra variação que é o "printf()", no printf()
nós podemos primeiro definir o formato e deposis definir os valores,
exemplo:
System.out.printf("Olá, %s. Hoje é %s, %s.")
Com o "%s" nós fizemos uma marcação de lugar, falamos pra ele
que vamos colocar uma variável do tipo String naquele lugar.
O "printf()" tem uma particularidade diferente do println()...
o "println()" escreve cada linha, uma abaixo da outra, o "printf()"
não, a gente que tem que configurar isso explecitamente e pra isso
eu uso o '%n",
exemplo:
System.out.printf("Olá, %s. Hoje é %s, %s.%n");
Pronto agora posso passar as variáveis,
exemplo:
System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudaçao.toUpperCase());

// Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA
String nome = "Jessé";

// ISO 8601
LocalDate hoje = LocalDate.now();
Locale brasil = new Locale("pt",  "BR");

//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
String saudaçao ;
LocalDateTime agora = LocalDateTime.now();
if(agora.getHour() >= 0 && agora.getHour() < 12 ){
saudaçao = "bom dia";
} else if(agora.getHour() >= 12 && agora.getHour() < 18) {
saudaçao = "boa tarde";
} else if(agora.getHour() >= 18 && agora.getHour() < 24) {
saudaçao = "boa noite";
} else {
saudaçao = "Olá";
}

System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudaçao.toUpperCase());

*/

//Aula6
/*
Aula6 - Laços Numéricos.
Nessa aula vamos ver os laços numéricos, ou repetições contadas.
São aquelas estruturas que a gente quer repetir um trecho
de código por uma quantidade conhecida de vezes.

Então a gente tem um controle, uma contagem de quantas vezes
isso vai acontecer.

Imagine que eu quero exibir os numeros de 1 à 10, e vamos
imprimí-los um abaixo do outro.

Então por exemplo, eu quero fazer isso:
"Para uma variável que inicia em 1, e vai até 10, mudando de 1 por 1, faça:"
Esse "faça:" ta representando o comando que vai ser repetido, que
nesse caso vai ser o "System.out.println()"

E agora o que precisamos fazer, é basicamente traduzir isso
para o inglês, então a estrução "para",
vamos traduzir como "for(){}" e dentro dos parenteses,
vamos declarar uma variável com nome de "i",
que inicia em 1, e vai até 10 e vamos fazer ela mudar 1 por 1.
exemplo:

for(int i = 1; i <= 10; i++) {
System.out.println(i);
}
O "mais mais(++)" é um operador de incremento 1 por 1,
então ele vai iniciar em 1 e vai incrementar 1 por 1,
ou seja "1 2 3 4 5 6 7 8 9 10" enquanto for "menor ou igual"(<=)
do que 10.
E o faça é a operação que colocamos entre as chaves, que nesse caso
vamos sempre repetir a exibição do valor da variável "i".

Se eu quisesse variar essa contagem de 2 em 2
eu teria que ao invés de colocar "i++", colocar "i+=2",
exemplo:
for(int i = 1; i <= 100; i+=2) {
System.out.println(i);
}
Com essas estruturas de laços de repetições contadas, ou
laços numéricos, a gente também pode fazer por exemplo
uma tabuada de multiplicação.
então imagine que eu tenha varios termos, e eu quero fazer
essa tabuada de multiplicação, exemplo:

for (int i = 1; i <= 10; i++){
System.out.println(1 * i)
System.out.println(2 * i)
System.out.println(3 * i)
System.out.println(4 * i)
System.out.println(5 * i)
System.out.println(6 * i)
System.out.println(7 * i)
System.out.println(8 * i)
System.out.println(9 * i)
System.out.println(10 * i)
}
Com isso a gente obtem somente os resultados dessa taboada.

Podemos melhorar esse codigo aninhando dois for(){},
colocando um dentro do outro, chamamos isso de laços aninhados,
Dentro do segundo for(){} eu coloco o "System.out.println()".
Exemplo:

for (int i = 1; i <= 10; i++) {
for (int j = 1; j <= 10; j++) {
System.out.println(i * j)
}
}
Eu não posso usar a variável "i" no for(){} filho, pois já estamos
usando ela no for(){} pai, então declaramos a próxima letra
do alfabeto, nesse caso "j".
Agora eu tenho um laço dentro do outro, e quando essa variáveis
vão mudar? A variável "i" só vai mudar quando o programa percorrer
todas as interações do laço "j".
Isso quer dizer que pra cada interação do "i" eu vou ter
10 interações do "j", então eu vou ter o "j" variando de 1 à 10
para só então eu variar a variável "i".
Dessa forma iremos obter exatamente o mesmo resultado, a diferença
é que o código ta bem mais legivel agora.


Agora podemos melhorar a exibição dessa tabuada,
pra isso podemos deixar explicito, qual é o termo que estamos fazendo.
Exemplo:
"System.out.println(j + "x" + i + " = " + j * i);"
Esse codigo vai fazer ser exebido o seguinte pra gente:
1x1 = 1
1x2 = 2
1x3 = 3
1x4 = 4
1x5 = 5
1x6 = 6
...
Isso é o que vai ser impresso no terminal, então
fica muito mais compreensivo para o usuário entender
o que a aplicação está entregando
e ate mesmo para nos programadores fica mais facil a leitura
desse código.

for (int i = 1; i <= 10; i++) {
for (int j = 1; j <= 10; j++) {
System.out.println(j + "x" + i + " = " + j * i );
}
}
A gente usa esse tipo de estrutura, exatamente quando a gente
tem um bloco de codigos que  a gente deseja repetir, e a gente tem
o controle de quantas vezes vai ser repetidas e controlamos isso
com as variáveis.

*/

//Aula7
/*
Aula7 - Vetores/Arrays:
Nessa aula vamos ver sobre vetores, ou arrays como são
mais conhecidos no mundo da programação...

No Java, que é uma linguagem fortemente tipada, nós não
podemos misturar tipos de dados dentro de um array.
Uma vez que a gente declara um array por exemplo do tipo inteiro(int)
ou do tipo String, todos os elementos dentro do array,
devem ser do mesmo tipo, não podemos misturar numeros e textos
por exemplo.
Pra declararmos um array, colocamos colchetes[] dps do tipo da
variavel, depois colocamos o nome desse array, e em seguida
declaramos o tamanho desse array.
exemplo:
int[] numeros = new int[5];
Os arrays são de tamanhos imutáveis, se eu defini o array
de tamanho 5, eu não posso adicionar um sexto elemento nesse array.
Eu posso preencher 1 posição, nenhuma posição, ou até 5 posições.

Agora que declaramos o array de tamanho 5, agora eu posso
preencher os elementos do array.
Os arrays são orientados a indices, então eu preciso definir
qual posição do meu array eu desejo manipular.
É como se eu tivesse essa estrutura:
"[] [] [] [] []"
eu tenho 5 posições a serem preenchidas, e pra gerenciar cada
uma delas a gente usa os indices. No Java o primeiro indice é
zero(0) e vai ate o indice quatro(4), totalizando um total
de 5 elementos:
"[0] [1] [2] [3] [4]"
A regra geral para arrays é que se eu tenho um array de tamanho "n"
então os indices vão de 0 até n - 1.
Nesse caso ele vai de 0 à 5 - 1.

Para preencher essas posições, podemos fazer da seguinte forma:
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
numeros[3] = 4;
numeros[4] = 5;
Dessa forma eu atribui os numeros de 1 a 5 à cada uma das posições
do meu array.

Para visualizar, imprimir esses elementos
temos que acessar esses elementos dentro do array e
pra acessar os elementos vamos usar
uma estrutura de repetição, como sabemos exatamente quantos
indices nos vamos acessar, podemos usar
um laço numérico, ou seja, podemos usar um "for(){}"
nesse for eu preciso definir a minha variavel de controle, ou
"contadora", como os indices vão de 0 até 4, de 0 até n - 1,
ou seja menor do que o tamanho do meu array, eu posso usar "numeros."
seguido por "length".
A propriedade "length" indica o tamanho do meu array.
E ai eu posso fazer o meu incremento(++),
exemplo:
for (int i = 0; i < numeros.length; i++){

}
Agora temos uma variável "i" que inicia em 0 e vai até
menor que o tamanho do meu elemento e faz o incremento.

Agora eu posso fazer um println() pra exibir no terminal,
mas pra isso eu preciso passar o indice, exemplo:
"System.out.println(numeros[i]);"

int[] numeros = new int[5];
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
numeros[3] = 4;
numeros[4] = 5;

for (int i = 0; i < numeros.length; i++){
System.out.println(numeros[i]);
}

Agora para demonstrar que não existe relação entre o indice
e o valor, podemos fazer um array de strings.
Então vamos fazer um array de letras do tipo Stringe ja vamos atribuir
valores pros indices e ja vamos fazer o for(){}
exemplo:
String[] letras = new String[5];
letras[0] = "A";
letras[1] = "B";
letras[2] = "C";
letras[3] = "D";
letras[4] = "E";

for (int i = 0; i < letras.length; i++){
System.out.println(letras[i]);
}
Então eu apenas preciso manter a coerencia dos elementos dentro
do array, ou são apenas numeros, ou são apenas textos.

Tem uma outra sintaxe que podemos usar para declarar
arrays e adicionar ja de antemão todos os valores do meu array.

Pra isso eu posso passar todos os valores desse array dentro de
chaves{},
exemplo:
String[] letras = {"A", "B", "C", "D", "E"};
Dessa forma eu não preciso nem definir o tamanho do meu array.

String[] letras = {"A", "B", "C", "D", "E"};

for (int i = 0; i < letras.length; i++){
System.out.println(letras[i]);
}
Atribuindo esses valores dentro das chaves, o Java já vai
entender qual espaço que vou precisar, ou seja,
qual o tamanho de array vou precisar.


Uma outra coisa também que temos, é que não precisamos nem definir
um laço para exibir os valores desse array,
eu posso usar o print line (println()) e dentro dos paranteses
eu posso chamar "Arrays" seguido por um ponto(.) e eu passo "toString()"
dentro dos parenteses do toString() eu passo a variável letras,
exemplo:
System.out.println(Arrays.toString(letras));
Dessa forma ele vai nos da uma saida de formato diferente,
ele vai nos mostra todos os elementos desse array um do lado do outro
e dentro de colchetes[].


Outra coisa que podemos fazer com arrays, é descobrir qual o maior elemento
dentro desse array, o menor, e também a media entre eles.
Pra isso podemos declarar um array de numeros e já atribuir alguns
valores a ele,
exemplo:
int[] numeros = { 9, 10, 12, 25, 2 };

Agora pra descobrir o maior desses numeros, eu preciso declarar
uma variavel com nome de maior, uma variavel com nome de menor
e outra com nome de media,
exemplo:
int maior;
int menor;
int media;

Maior e menor, eles são baseados em comparação,
então eu só vou conseguir comparar se eu ja tiver uma valor inicial
e um bom valor inicial, é colocar o primeiro indice do nosso array,
exemplo:
int maior = numeros[0];
int menor = numeros[0];
int media = 0;
Aqui eu to dizendo que o maior de todos é o primeiro e o menor
de todos também é o primeiro e a media vai iniciar em zero.

Fazendo essa analise manualmente, temos que ir comparando os valores do
array, temos que comparar se 9 é maior do que 10, se 10 é maior que 12
se 12 é maior que 25 e se 25 é maior  do que 2, da mesmo forma vou comparar
pra descobrir qual o menor valor.
Pra fazer isso, podemos fazer com um laço numérico, com
um for(){},
exemplo:
for (int i=0; i < numeros.lentgh; i++){

}
Dentro desse laço podemos colocar condições
de if e else.
Exemplo:
for (int i=0; i < numeros.lentgh; i++){
if (numeros[i] > maior) {
maior = numeros[i];
}
if (numeros[i] < menor){
menor = numeros[i]
}
media += numeros[i];
}
Então aqui estou dizendo:
Se o numeros na posição i, no indice i, for maior do que o conteudo
da variável maior, então maior vai receber numeros na posição i.
E se numeros no indice i for menor do que o conteudo da
variável menor, então a variável menor passa a ter o valor de
numeros indice i(numeros[i])
E ao fim nos somamos e atribuimos todos esses
valores do array para a variavel media.

Agora podemos exibir quem é o maior, o menor e a media entre eles
só que pra exibir a e media, vamos ter que primeiro calcular,
pois até agora só somamos esses valores, então vamos divir ela
por numeros.length,
exemplo:
"System.out.println( "Media: " + media / numeros.length);"

Duas coisas que precisamos lembrar dessa aula, primeiro
Java é uma linguagem fortemente tipada e nos não podemos misturar
tipos dentro da mesma estrutura, ou é um array de int,
ou é um array de Strings, ou é um array de float...

Outro ponto que temos que lembrar dessa aula,
é que o primeiro indice é o 0, e o ultimo indice sempre vai ser
o tamanho do array - 1.

int[] numeros = {9, 10, 12, 25, 2};
int maior = numeros[0];
int menor = numeros[0];
int media = 0;

for (int i=0; i < numeros.length; i++){
if (numeros[i] > maior) {
maior = numeros[i];
}
if (numeros[i] < menor){
menor = numeros[i];
}
media += numeros[i];
}

System.out.println("Maior: " + maior);
System.out.println( "Menor: " + menor);
System.out.println( "Media: " + media / numeros.length);

*/

//Aula8
/*
Aula8 - Funções:
Nessa aula vamos aprender a definir as nossas proprias
funções.
O Java define varias funções que nos podemos usar
seja em Strings para converter para letras maiusculas, letras
minusculas, ou no scanner pra gente ler entrada de dados, mas
nos também podemos fazer as nossas proprias funções.

Então nós podemos definir nossas funções, desde o mais basico,
seja simplesmente, pra definir uma mensagem de hello world...
Mas imagine que eu tenho um nome de alguém que eu quero passar
e fazer essa personalização.
exemplo:
String nome = "Jessé";
System.out.println("Hello, " + nome);

Se eu quiser isso fazer isso em momentos diferentes do meu codigo
eu vou ter que sair duplicando esse codigo e o principal efeito colateral
dessa duplicação é que se eu precisar alterar, eu vou ter que alterar
em varios pontos.
Então a gente pode definir a nossa propria função de saudação.

E pra fazermos isso vamos ter
que sair da area "main" do nosso codigo, e nos vamos fazer uma
sintaxe muito parecida com essa que ta definida no main.
temos que definir o "public" seguido por "static" e "void",
depois colocamos o nome dessa função seguido por
parenteses e chaves., nesse caso o nome vai ser "saudaçao".
exemplo:
"public static void saudaçao(){}"
A principio, vamos deixar os parenteses vazios, mas depois nos
vamos alterar isso.
Dentro das chaves nos definimos qual o comando que nossa
função vai execultar, nesse caso vai ser "Hello, Jessé" de forma fixa.
Exemplo:
"System.out.println("Hello, Jessé!");"

Agora pra gente execultar esse codigo, precisamos chamá-lo
no nosso main, pois o main é nosso ponto de partida,
e pra chama-lo, basta escrever
saudaçao();


Agora imagine que não queremos necessariamente saudar essa pessoa,
no caso "Jessé",
que queremos deixar em aberto para saudar qualquer nome.
exemplo:
"System.out.println("Hello, " + nome);"
E eu quero que esse nome seja informado la do metodo main.
então podemos definir uma String com nome de "nome" na nossa função main
exemplo:
String nome = "Paulo"
Agora eu quero passar essa informção dessa string do main para
a nossa função saudação, pra isso eu preciso passar um parametro
para minha função, que é basicamente declarar uma variável dentro
dos parenteses, ou seja, vamos reservar um espaço para receber algum valor.
exemplo:

public static void saudaçao(String parametro){
        System.out.println("Hello, " + parametro + "!");
    }

Agora dentro do main nos chamamos o saudaçao, mas agora
precisamos passar um parametro para ele, que vai ser a variavel
"nome",
exemplo:
public static void main(String[] args) {
        String nome = "Paulo";
        saudaçao(nome);
    }



public static void main(String[] args) {
        String nome = "Paulo";
        saudaçao(nome);
    }

    public static void saudaçao(String parametro){
        System.out.println("Hello, " + parametro + "!");
    }

Então podemos definir funções que não recebem parametros,
funções que recebem parametro, mas também podemos definir
funções que retornam valores.
Até agora não estamos retornando nenhum resultado, o metodo main,
tem chamado a nossa função de saudaçao, a gente realiza essa impressão
de uma mensagem de terminal, mas encerra ai,
não existe retorno de volta para o metodo main.

Agora vamos fazer uma função muito simples, simplesmente pra somar
dois numeros e retornar o resultado, pra isso eu vou no main,
e defino uma variavel do tipo int com nome de resultado e passo
a função soma(), dentro dos parenteses eu passo os números que eu quero somar.
Exemplo:

public static void main(String[] args) {
    int resultado = soma(2, 3);
}
Nesse caso a função soma, ainda não existe, ainda vamos criá-la,
e é muito comum fazer isso no desenvolvimento profissional,
a medida que vamos pensando, já vamos escrevendo e depois a gente
cria os trechos que ainda não existem.
Dessa maneira eu defini como vai ser a execução de soma, agora
eu preciso definir de fato essa função, que vai ser também do
tipo inteiro, porque vamos retornar um resultado do tipo int.
Exemplo:
public static int soma(int a, int b){

}
Então aqui criamos nossa função e declaramos
duas variáveis como parametros, ou seja, deixamos dois espaços numéricos
reservados...
Um para guardar o valor de "a" que nesse caso vai receber o valor
de "2", porque é o que o main está enviando,
e outro para guardar o valor de "b", que nesse caso é "3".
Agora dentro das chaves eu preciso colocar a
palavra-reservada/palavra-chave "return", seguida pela definição
do que a minha função faz, que é somar os valores de "a" e "b",
exemplo:
public static int soma(int a, int b){
    return a + b;
}
Então dessa forma ele retorna pra linha 5,
que fez a chamada dessa função, o valor de a + b, e esse valor é
a atribuido à variável "resultado".

Agora podemos imprimir esse resultado usando o "println()"
exemplo:
public class Main {


    public static void main(String[] args) {
        int resultado = soma(2, 3);
        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}


Esse conteúdo de funções, ele é muito amplo e a gente pode variar
o tanto quanto a gente quiser, porém,
essa é a mecanica basica de como trabalharmos com funções,
então eu tenho a sintaxe de como definir uma função, eu defino o nome
dela, e eu posso ou não definir parametros, esses parametros devem está
entre parenteses.

A minha função também pode retornar um valor, ou não.
Se eu desejo retornar, eu uso a palavra-chave "return".

*/

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        int resultado = soma(2, 3);
        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}

