#include <stdio.h>

struct produtosDat {
    int registro;
    char nome[ 50 ];
    int quantidade;
    double custo;
};

int deletaProduto(int registro);

int main(void){

    FILE *abPtr;
    int registro;
    int quantidade;

    struct produtosDat produtos = { 0, "", 0, 0.0 };

    if ((abPtr = fopen("hardware.dat", "rb+")) == NULL){
        printf("Erro ao abrir o arquivo.\n");
    }
    else{
        printf("Digite o registro: ");
        scanf("%d", &registro);

        struct produtosDat produtos = { 0, "", 0, 0.0 };

        fseek(abPtr, (registro - 1) * sizeof(struct produtosDat), SEEK_SET);
    
        fread(&produtos, sizeof(struct produtosDat), 1, abPtr);

        printf("%-11s%-28s%-15s%10s\n", "Registro", "Nome", "Quantidade", "Custo");
        printf("%-11d%-28s%-15d%10.2f\n\n", produtos.registro, produtos.nome, produtos.quantidade, produtos.custo);

        printf("qnto para alterar: ");
        scanf("%d", &quantidade);

        produtos.quantidade += quantidade;

        if (quantidade == 0){
            deletaProduto(registro);

        }

        printf("%-6d%-16s%-11d%10.2f\n", produtos.registro, produtos.nome, produtos.quantidade, produtos.custo);

        fseek(abPtr, (registro - 1) * sizeof(struct produtosDat), SEEK_SET);

        fwrite(&produtos, sizeof(struct produtosDat), 1, abPtr);

    }

    fclose(abPtr);

return 0;

}

int deletaProduto(int registro){

  FILE *abPtr;

    struct produtosDat produtos;
    struct produtosDat produtosNulo = { 0, "", 0, 0.0 };

    if ((abPtr = fopen("hardware.dat", "rb+")) == NULL){
        printf("Erro ao abrir o arquivo.\n");
    }
    else{

        /*printf("\nDigite o registro para excluir: ");
        scanf("%d", &registro);*/

        fseek(abPtr, (registro - 1) * sizeof(struct produtosDat), SEEK_SET);
        fread(&produtos, sizeof(struct produtosDat), 1, abPtr);

        if (produtos.registro == 0){
            printf("Registro não existe.\n");
        }
        else {
            /*printf("%-6d%-16s%-11d%10.2lf\n\n", produtos.registro, produtos.nome, produtos.quantidade, produtos.custo);*/
            fseek(abPtr, (registro -1 ) * sizeof(struct produtosDat), SEEK_SET);

            fwrite(&produtosNulo, sizeof(struct produtosDat), 1, abPtr);
        }

        fclose(abPtr);

    }

  return 0;

}