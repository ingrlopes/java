# JAVA | Informações importantes
Repositório para aprender sobre Java e armazenar informações importantes para poder programar.


## 💻 Palavras Reservadas
| Primitivos | infos |
|------------|-------|
| Boleean | um valor indicando verdadeiro ou falso |
| Byte | um inteiro de 8 bits (signed) |
| Char | um character unicode (16-bit unsigned) |
| Double | um número de ponto flutuante de 64 bits (signed) |
| Float | um número de ponto flutuante de 32 bits (signed) |
| Int | um inteiro de 32 bits (signed) |
| Long | um inteiro de 64 bits (signed) |
| Short | um inteiro de 32 bits (signed) |
| Void | indica que o método não tem retorno de valor |

| Modificadores de acesso | infos |
|-------------------------|-------|
| Public | acesso de qualquer classe |
| Private | acesso apenas dentro da classe |
| Protected | acesso por classes no mesmo pacote e subclasses |

| Controle de pacotes | infos |
|---------------------|-------|
| Import | importa pacotes ou classes para dentro do código |
| Package | especifica a que pacote todas as classes de um arquivo pertencem |

| Tratamento de erros | infos |
|---------------------|-------|
| Assert | testa uma expressão condicional para verificar uma suposição do programador |
| Catch | declara o bloco de código usado para tratar uma exceção |
| Finally | bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção |
| Throw | usado para passar uma exceção para o método que o chamou |
| Throws | indica que um método pode passar uma exceção para o método que o chamou |
| Try | bloco de código que tentará ser executado, mas que pode causar uma exceção |

| Modificadores de classes, variáveis ou métodos | infos |
|------------------------------------------------|-------|
| Abstratic | classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata |
| Class | especifica uma classe |
| Extends | indica a superclasse que a subclasse está estendendo |
| Final | impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada |
| Implements | indica as interfaces que uma classe irá implementar |
| Interface | especifica uma interface |
| Native | indica que um método está escrito em uma linguagem dependente de plataforma, como o C |
| New | instancia um novo objeto, chamando seu construtor |
| Static | faz um método ou variável pertencer à classe ao invés de às instâncias|
| Strictfp | usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões |
| Synchronized | indica que um método só pode ser acessado por uma thread de cada vez |
| Transient | impede a serialização de campos |
| Volatile | indica que uma variável pode ser alterada durante o uso de threads |

| Controle de fluxo dentro de um bloco de código | infos |
|------------------------------------------------|-------|
| Break | sai do bloco de codigo em que ele está |
| Case | executa um bloco de código dependendo do teste do switch |
| Continue | pula a execução do código que viria após essa linha e vai para a próxima passagem do loop |
| Default | executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro |
| Do | executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente |
| Else | executa um bloco de código alternativo caso o teste if seja falso |
| For | usado para realizar um loop condicional de um bloco de código |
| If | usado para realizar um teste lógico de verdadeiro o falso |
| Instanceof | determina se um objeto é uma instância de determinada classe, superclasse ou interface |
| Return | retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável) |
| Switch | indica a variável a ser comparada nas expressões case |
| While | executa um bloco de código repetidamente enquanto a condição for verdadeira |

## 🗃️ Tipos Primitivos e seus valores
No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

Não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (Memory stack).

| Tipo | Memória | Valor mínimo | Valor máximo |
| ---- | ------- | ------------ | ------------ |
| Byte | 1 byte | -128 | 127 |
| Short | 2 byte | -32.768 | 32.767 |
| Int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| Long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

| Tipo | Memória | Valor mínimo | Valor máximo | Precisão |
| ---- | ------- | ------------ | ------------ | -------- |
| Float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 |  6 - 7 dígitos |
| Double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos |


## 🔎 Tags
 Autor / criador
![@autor](https://img.shields.io/badge/@autor-CEDCE3?style=for-the-badge&logo=&logoColor=)

Versão do recurso disponibilizado
![@version](https://img.shields.io/badge/@version-CEDCE3?style=for-the-badge&logo=&logoColor=)

Versão / Data de início da disponibilização do recurso
![@since](https://img.shields.io/badge/@since-CEDCE3?style=for-the-badge&logo=&logoColor=)

Descrição dos parâmetros dos métodos criados
![@param](https://img.shields.io/badge/@param-CEDCE3?style=for-the-badge&logo=&logoColor=)

Definição do tipo de retorno de um método
![@return](https://img.shields.io/badge/@return-CEDCE3?style=for-the-badge&logo=&logoColor=)

Se o método lança alguma exceção
![@throws](https://img.shields.io/badge/@throws-CEDCE3?style=for-the-badge&logo=&logoColor=)


## 🧮 Operadores Aritméticos
Adição
```
+ 
```
Subtração
```
-
```
Multiplicação
```
*
```
Divisão
```
/
```


## 🕹️ Operadores Relacionais
Quando desejamos verificar se uma variável é "IGUAL" a outra
```
==
```
Quando desejamos verificar se uma variável é "DIFERENTE" da outra
```
!=
```
Quando desejamos verificar se uma variável é "MAIOR" a outra
```
>
```
Quando desejamos verificar se uma variável é "MAIOR OU IGUAL" a outra
```
>=
```
Quando desejamos verificar se uma variável é "MENOR" a outra
```
<
```
Quando desejamos verificar se uma variável é "MENOR OU IGUAL" a outra
```
<=
```


## 📝 Operadores Unários
Valor positivo - números são positivos sem esse operador explicitamente
```
+
```
Valor negativo - nega um número ou expressão aritmética
```
-
```
Incremento de valor - incrementa o valor em 1 unidade
```
++
```
Decremento de valor - decrementa o valor em 1 unidade
```
--
```
Lógica de negação - nega o valor de uma expressão booleana
```
!
```


## 🎰 Operadores Lógicos
Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

Igual a "E"
```
&&
```
Igual a "OU"
```
||
```


## 🎯 Operador Ternário
O operador de condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
 
Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

- Representado pelos símbolos:
```
?
```
```
:
```
Sendo ? para "IF" e : para "ELSE"

-------------------------------------
Disponibilizado com ♥ por [Ingrid]((https://www.linkedin.com/in/ingrid-lopes-29a251274/ "Ingrid").
