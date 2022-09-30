#include <stdio.h>

int main(){

    char bairro[20];
    char abreviacao[2];

    FILE *tbPtr;

    if ((tbPtr = fopen("tabelabairro.dat", "r")) == NULL){
        printf("Nao ha arquivo\n");
    }

    else{

        printf("%s%-25s", bairro, abreviacao);
        fscanf(tbPtr, "%s%s", bairro, abreviacao);

        while(!feof(tbPtr)){

            fscanf

            
        }
    
    
    }






}