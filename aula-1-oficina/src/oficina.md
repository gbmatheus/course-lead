# Oficina Aula 1

Durante a aula, aprendemos os conceitos teóricos sobre o padrão MVC e também observamos como é realizada a sua implementação na prática. Uma das vantagens da estrutura deste padrão é que não sofre grandes variâncias conforme o aumento de complexidade e tamanho do projeto que estamos lidando, levando em conta que todas as classes estão bem divididas e distribuídas em seus respectivos pacotes, que dividem as classes por suas funções.

Nesta oficina iremos fazer algo semelhante ao que foi demonstrado no tópico de implementação da webaula, no entanto, faremos isso em um contexto mais específico: Conta Bancária. Neste cenário, temos diferentes regras de negócio que podem ser implementadas, como saque, depósito e verificação do saldo. Também temos diferentes objetos para serem manipulados. Cada aplicação tem suas próprias regras, que devem ser bem distribuídas no padrão MVC.

O intuito é implementar um projeto que contenha os três pacotes deste padrão:
`
com.mvc.modelo;
com.mvc.visao;
com.mvc.controlador;
`
Cada pacote terá sua responsabilidade respectiva conforme o padrão MVC. O contexto se passa em uma situação de controle de fluxo das transações bancárias, ou seja, vamos aplicar as regras de negócio referentes ao fluxo de caixa, entrada e saída. A fim de simplificar nosso código, apenas iremos realizar dois tipos de transações, que estarão presentes em métodos da classe controlador:

Débito (retirada de dinheiro na conta bancária pessoal do usuário);
Crédito (adicionamento de dinheiro na conta bancária pessoal do usuário).
Na classe controlador teremos dois métodos que irão receber as transações de crédito e débito, ambos deverão impactar diretamente na variável saldoAtual da conta e retornar um valor boolean caso a operação tenha sido bem-sucedida ou não. São eles:

`public boolean creditarValor(double valor, int numeroConta, int agencia);public boolean debitarValor(double valor, int numeroConta, int agencia);
`

Dentro do pacote Modelo criaremos a classe: ContaBancaria que terá os seguintes atributos, com seus respectivos métodos getters e setters:

` private double saldoAtual = 0.0;
private String nomePessoa = ""; 
private String cpf = "";
private int numeroConta;
  private int agencia;
`

Em nossa classe Visão teremos uma função main que instancia o objeto controlador e requisita sequencialmente uma ação de crédito e outra de débito por meio do fluxo de regra definido no padrão MVC.

Após realizar esses passos, execute sua função main da classe Visão e escreva no console o resultado do saldoAtual da contaBancaria em cada transação.

Boa sorte e bom trabalho!