#include <stdio.h>
#include <time.h>

int main(void){

    int quantidade, registro;
    double custo;
    char ferramenta[100];
    
 
    FILE *aqPtr;

    if ((aqPtr = fopen("hardware.dat", "r")) == NULL){
        printf("Não há arquivo!\n");
    }
    
    else {
        
        printf("%-13s%-25s%-25s%-8s\n", "Registro", "Ferramenta", "Quantidade", "Custo");
        fscanf(aqPtr, "%d %s %d %lf", &registro, ferramenta, &quantidade, &custo);


        while (!feof(aqPtr)){
            printf("%-13d%-25s%-25s%-8s\n", &registro, ferramenta, &quantidade, &custo);
            fscanf(aqPtr, "%d %s %d %lf", &registro, ferramenta, &quantidade, &custo);

        }

        fclose(aqPtr);
    
    }

    return 0;

}