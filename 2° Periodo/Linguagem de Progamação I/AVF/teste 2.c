#include <stdio.h>

struct produtosDat {
    int registro;
    char nome[ 50 ];
    int quantidade;
    double custo;
};

int main(void){

    FILE *abPtr;

    struct produtosDat produtos = { 0, "", 0, 0.0 };

    if ((abPtr = fopen("hardware.dat", "rb")) == NULL){
        printf("Erro ao abrir o arquivo.\n");
    }
    else{
        printf("%-11s%-28s%-15s%10s\n", "Registro", "Nome", "Quantidade", "Custo");

        while(!feof(abPtr)){
            fread(&produtos, sizeof(struct produtosDat), 1, abPtr);

            if (produtos.registro != 0){
                printf("%-11d%-28s%-15d%10.2f\n", produtos.registro, produtos.nome, produtos.quantidade, produtos.custo);
            }
        }

        fclose(abPtr);
    }
    
    return 0;

}
