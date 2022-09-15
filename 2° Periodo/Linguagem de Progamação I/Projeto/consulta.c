#include <stdio.h>

int main(void){

    FILE *paPtr;
    char cpf[ 14 ];

    printf("Digite o CPF: ");
    scanf("%s", cpf);

    if ((paPtr = fopen("clients.dat", "r")) == NULL){
    printf("Nao ha arquivo\n"); 
    }

    else{
        char *fgets(char *cpf, int 13,FILE *paPtr);
    

        fclose(paPtr);
    }

    return 0;

}