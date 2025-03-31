# Projeto "Sudoku" Dio

# Como foi o desenvolvimento

Este projeto foi desenvolvido sem seguir as aulas de apoio, pois queria me desafiar. Delas, tirei a estrutura de como pensar os quadrados e organizar o vector, bem como o template do tabuleiro. As demais soluções, me esforcei para pesquisar e pensar por conta.

# Requisitos funcionais

Deve-se ter um menu interativo onde poderemos escolher entre as seguintes opções:

1. Iniciar um novo o jogo: Deve-se exibir na tela o jogo inicial, com os espaços preenchidos somente pelos números iniciais (usar os args do método main para informar os números iniciais e suas devidas posições);
2. Colocar um novo número: Deve-se solicitar as seguintes informações do jogador (número a ser colocado, índice horizontal e índice vertical do número), não se deve permitir que seja colocado um número em uma posição que já esteja preenchida (seja número fixo ou informado pelo jogador);
3. Remover um número: deve-se solicitar os índices verticais e horizontais do número que deseja remover (caso o número seja um número fixo do jogo deve-se exibir uma mensagem informado que o número não pode ser removido);
4. Verificar jogo: visualizar a situação atual do jogo;
5. Verificar status do jogo: Deve-se verificar o status atual do jogo (não iniciado, incompleto e completo) e se contém ou não erros (o jogo está errado quando tem números em posições conflitantes) todos os status do jogo podem conter ou não erros, exceto o status não iniciado que é sempre sem erro;
6. Limpar: remove todos os números informados pelo usuário e mantém os fixos do jogo;
7. Finalizar o jogo: Se o jogo estiver com todos os espaços preenchidos de forma válida o jogo é encerrado, senão informa ao usuário que ele deve preencher todos os espaços com seus respectivos números;

# Aplicando

- [ ] Iniciar um novo o jogo: Deve-se exibir na tela o jogo inicial, com os espaços preenchidos somente pelos números iniciais (usar os args do método main para informar os números iniciais e suas devidas posições)
      No Github do projeto, não encontrei os comandos, imagino que tenham sido apresentados em uma aula, sendo assim, busquei uma matriz na internet.
      ````
      java NomeDoPrograma 5,1 3,1 0,0 0,0 7,1 0,0 0,0 0,0 0,0 6,1 0,0 0,0 1,1 9,1 5,1 0,0 0,0 0,0 0,0 9,1 8,1 0,0 0,0 0,0 0,0 6,1 8,1 0,0 0,0 6,1 0,0 0,0 0,0 3,1 4,1 0,0 8,1 0,0 3,1 0,0 0,0 1,1 7,1 0,0 0,0 2,1 0,0 0,0 6,1 0,0 6,1 0,0 0,0 0,0 0,0 0,0 2,1 8,1 0,0 0,0 4,1 1,1 9,1 0,0 0,0 5,1 0,0 0,0 0,0 0,0 0,0 0,0 8,1 0,0 7,1 9,1
- [x] Colocar um novo número: Deve-se solicitar as seguintes informações do jogador (número a ser colocado, índice horizontal e índice vertical do número), não se deve permitir que seja colocado um número em uma posição que já esteja preenchida (seja número fixo ou informado pelo jogador);
- [x] Remover um número: deve-se solicitar os índices verticais e horizontais do número que deseja remover (caso o número seja um número fixo do jogo deve-se exibir uma mensagem informado que o número não pode ser removido);
- [x] Verificar jogo: visualizar a situação atual do jogo;
- [x] Verificar status do jogo: Deve-se verificar o status atual do jogo (não iniciado, incompleto e completo) e se contém ou não erros (o jogo está errado quando tem números em posições conflitantes) todos os status do jogo podem conter ou não erros, exceto o status não iniciado que é sempre sem erro;
