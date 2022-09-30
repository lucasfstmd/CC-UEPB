     
        //------------------------------------------------------------//
        // Lucas Fausto Medeiros --------------- Matricula: 211080055 //
        //------------------------------------------------------------//
        //--------- Questão 5.47 (Modificação do Jogo Craps) ---------// 
        //------------------------------------------------------------//


#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>


enum Status {CONTINUE, WON, LOST};

int saldoBanca = 1000;
int rollDice(void);

int main (void){

  setlocale(LC_ALL, "Portuguese");

   int sum;
   int myPoint;
   int aposta;

   enum Status gameStatus;
    
   printf("digite o valor de sua aposta: ");
   scanf("%i", &aposta);

   while (aposta >= (saldoBanca + 1)){
    printf("Digite um valor menor que 1000: ");
    scanf("%i", &aposta);
   }

  while (saldoBanca > 0){
   
    if (saldoBanca > 0){
      
      srand(time(NULL));

      sum = rollDice();

      switch (sum){
        case 7:
        case 11:
          gameStatus = WON;
          break;

        case 2:
        case 3:
        case 12:
          gameStatus = LOST;
          break;

        default:
          gameStatus = CONTINUE;
          myPoint = sum;
          printf("Ponto e %d\n", myPoint);
          break;
      }
   
      while (gameStatus == CONTINUE){
        sum = rollDice();

        if (sum == myPoint){
          gameStatus = WON;
        }
        else{
          if (sum == 7){
            gameStatus = LOST;
          }
        }
      }
      
      if (gameStatus == WON){
        printf("Jogador vence\n");
        saldoBanca += aposta;
        printf("\nNovo valor de Saudo Banca: %i \n", saldoBanca);
        
        if (saldoBanca >= (0.5 * aposta)){
          printf("Vamos la, continue tentando!");
        }
        
        if (saldoBanca >= (0.3 * aposta)){
          printf( "Vamos lá, continue tentando!");
        }       
      }
      else{
        printf("Jogador perde\n");
        saldoBanca -= aposta;
        printf("\nNovo valor de Saudo Banca: %i \n", saldoBanca);
        
        if (saldoBanca >= (aposta / 4)){
          printf("\nEi, assim você quebra!\n");
        }  
      }
    }
  }
    if (saldoBanca <= 0){
      printf("Sinto muito. Você esta quebrado!\n");
    }

return 0;

}

int rollDice(void){

   int die1;
   int die2;
   int workSum;

   die1 = 1 + (rand() % 6);
   die2 = 1 + (rand() % 6);
   workSum = die1 + die2;

   printf("Jogador rolou %d + %d = %d\n", die1, die2, workSum);
   
return workSum;

}     