# Projeto "Sudoku" - Dio

Este projeto foi desenvolvido como parte de um desafio da Dio. Eu decidi criar a minha própria solução sem seguir as aulas de apoio, focando em aprender e resolver os problemas por conta própria. Depois, criei outro repositório com a solução apresentada no curso, que basicamente foi copiada para estudo e comparação.

## Como foi o desenvolvimento

Eu busquei entender e implementar as funcionalidades sozinho, baseando-me apenas na descrição do projeto. Da aula oficial, tirei a estrutura geral de como pensar os quadrados e organizar o `vector`, além do template do tabuleiro. Todo o restante das soluções, me esforcei para pesquisar e implementar por conta própria.

## Requisitos funcionais

O projeto deve fornecer um menu interativo com as seguintes opções:

1. **Iniciar um novo jogo:**  
   - Exibe o tabuleiro inicial, preenchido apenas com os números fixos fornecidos (os números e posições devem ser informados como argumentos na execução do programa).  
   - Como o material oficial não detalhava os comandos necessários, busquei uma matriz pronta na internet.

   Exemplo de execução:
   ```bash
   java NomeDoPrograma 5,1 3,1 0,0 0,0 7,1 0,0 0,0 0,0 0,0 6,1 0,0 0,0 1,1 9,1 5,1 0,0 0,0 0,0 0,0 9,1 8,1 0,0 0,0 0,0 0,0 6,1 8,1 0,0 0,0 6,1 0,0 0,0 0,0 3,1 4,1 0,0 8,1 0,0 3,1 0,0 0,0 1,1 7,1 0,0 0,0 2,1 0,0 0,0 6,1 0,0 6,1 0,0 0,0 0,0 0,0 0,0 2,1 8,1 0,0 0,0 4,1 1,1 9,1 0,0 0,0 5,1 0,0 0,0 0,0 0,0 0,0 0,0 8,1 0,0 7,1 9,1```

2. **Colocar um novo número:**  
   - Permite inserir um número no tabuleiro, fornecendo os índices horizontal e vertical.
   - Não permite colocar números em posições já preenchidas, sejam números fixos ou adicionados pelo jogador. ✅

3. **Remover um número:**  
   - Permite remover um número inserido pelo jogador, fornecendo os índices horizontal e vertical.  
   - Números fixos não podem ser removidos. ✅

4. **Verificar jogo:**  
   - Exibe o estado atual do tabuleiro. ✅

5. **Verificar status do jogo:**  
   - Mostra o status do jogo:  
     - Não iniciado  
     - Incompleto  
     - Completo  
   - Indica se o jogo contém erros (como números em posições conflitantes).  
   - Todos os status podem conter erros, exceto o status "não iniciado", que é sempre considerado válido. ✅

6. **Limpar:**  
   - Remove todos os números informados pelo usuário, mantendo os números fixos intactos. ✅

7. **Finalizar o jogo:**  
   - Encerra o jogo caso todos os espaços estejam preenchidos corretamente.  
   - Se houver espaços vazios ou preenchimentos inválidos, o jogador é notificado para continuar jogando. ✅

## Aplicando

- [x] Colocar um novo número.
- [x] Remover um número.
- [x] Verificar jogo.
- [x] Verificar status do jogo.
- [x] Limpar.
- [x] Finalizar o jogo.
- [X] Iniciar um novo jogo.

## Observações

- Este repositório contém a **minha solução original**, desenvolvida sem consulta ao código oficial.  
- Para fins de aprendizado, criei um outro repositório com a solução oficial, que pode ser encontrado [aqui](https://github.com/vini-basilio/sudoku/).  
