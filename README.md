# 
Programa de Formação

Foi solicitado a criação de um conversor de moeda utilizando a linguagem Java. 
As características solicitadas por nosso cliente são as seguintes:

O conversor de moeda deverá:

- Converter de Reais a Dólar
- Converter de Reais a Euro
- Converter de Reais a Libras Esterlinas
- Converter de Reais a Peso argentino
- Converter de Reais a Peso Chileno
- Converter de Reais a Bitcoin
  
E também converter de forma inversa as opções acima.

<h2  align="center">Desenvolvimento do Projeto</h2>

Criei uma caixa de diálogo para permitir que o usuário escolha entre as diferentes moedas à qual ele quer converter seu dinheiro, utilizando a classe JOptionPane da biblioteca Javax e o o método showInputDialog como objeto de apresentar mais de uma opção para conversão.

Depois de executar a primeira conversão, o usuário poderá decidir que ele quer fazer.
Apresentarei as seguintes opções:

- Sim: deve trazer nosso usuário novamente para o menu principal.
- Não: Você deve mostrar uma mensagem "Programa finalizado"
- Cancelar: Você deve mostrar uma mensagem de "Programa concluído"
  
Utilizando o método showConfirmDialog para o usuário que deseja seguir no programa para outra conversão, em caso contrário, se optar por não seguir, utilizei o showMessageDialog para encerrar o programa.
