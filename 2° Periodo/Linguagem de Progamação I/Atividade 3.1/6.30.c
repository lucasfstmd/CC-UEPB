        
        //------------------------------------------------------------//
        // Lucas Fausto Medeiros --------------- Matricula: 211080055 //
        //------------------------------------------------------------//
        //-------------- Questão 6.30 (Crivo de Eratóstenes) ---------// 
        //------------------------------------------------------------//


#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <conio.h>


int crivo(int inicio, int vetor[]){    
     
  int contador1, contador2;
     
  for (contador1 = 2; contador1 <= inicio; contador1++){
    vetor[contador1] = 1;
  }    

  contador1 = 2;
  
  while (contador1 * contador1 <= inicio){
        
    for (contador2 = contador1 + 1; contador2 <= inicio; contador2++){
      if (vetor[contador2] != 0 && contador2 % contador1 ==0){
        vetor[contador2] = 0;
      }
    }
    for (contador2 = contador1 + 1; vetor[contador2] == 0 && contador2 <= inicio; contador2++);{
      contador1 = contador2;
    }
  }      
}

int main(void){
          
    int vetor[1000], contador_main1, contador_main2, inicio_main = 999;
    
    crivo(inicio_main, vetor);
      
    for (contador_main1 = 2; contador_main1 <= inicio_main; contador_main1++){
        if (vetor[contador_main1] != 0){
          printf ("%d ", contador_main1);
        }
    }  
      getch();
}