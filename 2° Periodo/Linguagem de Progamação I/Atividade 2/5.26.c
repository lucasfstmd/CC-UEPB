        
        //------------------------------------------------------------//
        // Lucas Fausto Medeiros --------------- Matricula: 211080055 //
        //------------------------------------------------------------//
        //-------------- Questão 5.26 (Numero Perfeito) --------------// 
        //------------------------------------------------------------//


#include <stdio.h>
#include <math.h>


#define retorno_erro 0
#define minimo 1
#define maximo 1000


int perfect(int);
void printDivisors(int[],int);
void imprimir_divisores(int[],int);


int main(void) {

  int numero_atual = 0; 
  int perfeito = 0;

  for(numero_atual = minimo; numero_atual <= maximo; numero_atual++){

    perfeito = perfect(numero_atual); 
    if(perfeito != 0) {

      printf("\n");
    }
  }

  return retorno_erro;
}


int perfect(int number){

  int divisor = 0;
  int divisores[number];
  int numero_perfeito = 0;
  int numero_de_divisores = 0;
  int soma_dos_divisores = 0;

  for(divisor = 1; divisor < number; divisor++){

    if(number % divisor == 0){
      
      divisores[numero_de_divisores] = divisor;
      numero_de_divisores++;
      soma_dos_divisores += divisor;
    }
  }

  if(number == soma_dos_divisores){
     
     printf("\n Numero Perfeito: %d = ", number);
     imprimir_divisores(divisores, numero_de_divisores);
     numero_perfeito = number;
  }

  return numero_perfeito;

}

void imprimir_divisores(int lista[],int tamanho){

  int indice = 0;

  for(indice = 0; indice < tamanho; indice++){
    printf("%d", lista[indice]);

    if( indice < (tamanho - 1) ){
      printf(" + ");
    }

  }
  
  printf("\n");

}

