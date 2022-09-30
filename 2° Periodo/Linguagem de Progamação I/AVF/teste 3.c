#include <stdio.h>

struct produtosDat {
    int registro;
    char nome[ 50 ];
    int quantidade;
    double custo;
};

int main(void){


    printf("!,?");

    /*FILE *abPtr;
    int registro;

    struct produtosDat produtos;
    struct produtosDat produtosNulo = { 0, "", 0, 0.0 };

    if ((abPtr = fopen("hardware.dat", "rb+")) == NULL){
        printf("Erro ao abrir o arquivo.\n");
    }
    else{

        printf("\nDigite o registro para excluir: ");
        scanf("%d", &registro);

        fseek(abPtr, (registro - 1) * sizeof(struct produtosDat), SEEK_SET);
        fread(&produtos, sizeof(struct produtosDat), 1, abPtr);

        if (produtos.registro == 0){
            printf("Registro não existe.\n");
        }
        else {
            printf("%-6d%-16s%-11d%10.2lf\n\n", produtos.registro, produtos.nome, produtos.quantidade, produtos.custo);
            fseek(abPtr, (registro -1 ) * sizeof(struct produtosDat), SEEK_SET);

            fwrite(&produtosNulo, sizeof(struct produtosDat), 1, abPtr);
        }

        fclose(abPtr);

    }
    */

    return 0;

}