#include <stdio.h>

int main(void){

    int numeros=0;
    int maior=0;
    int menor;
    int contador;

    for(contador=1; contador<=5; contador++){

        printf("Digite um Numero: ");
        scanf("%d", &numeros);

        if (numeros==0){
            maior=numeros;
            menor=numeros;
        }
        if (maior<numeros){
            maior=numeros;
        }
        if (menor>numeros){
            menor=numeros;
        }
    }
printf("O maior numero foi: %d", maior);
printf("\nO menor numero foi: %d", menor);

return 0;
}
